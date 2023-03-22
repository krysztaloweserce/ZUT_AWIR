package com.example.awir;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.rmi.Naming;
import java.rmi.NoSuchObjectException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

@Component //komponent SpringBoot
public class RMI implements ApplicationRunner {
    public static final String adres = "//localhost/logowanie"; //adres uruchomienia uslugi
    private Registry registry;
    private Validator validator;
    private boolean flaga = false;

    public void run(ApplicationArguments args){
        System.out.println("Start RMI");
        try {
            this.registry = LocateRegistry.createRegistry(1099); //powiazanie zdalnej metody RMI z kodem
        } catch (RemoteException e) {
            System.err.println("Nie można utworzyć rejestru.");
        }
        try {
            this.validator = new ValidatorImplement();
        } catch (RemoteException e) {
            System.err.println("Nie można utworzyć obiektu.");
        }
        try {
            Naming.rebind(adres, validator);
        } catch (Exception e) {
            System.err.println("Nie można połączyć z serwisem.");
        }
        this.flaga = true;
        System.out.println("Zrobione.");
    }
    public void shutdown(){ //czyszczenie i zamykanie usługi
        try {
            Naming.unbind(adres);
        } catch (Exception e) {
            System.err.println("Błąd odłączenia.");
        }

        try {
            UnicastRemoteObject.unexportObject(this.registry, true);
        } catch (NoSuchObjectException e) {
            System.err.println("Błąd zamykania.");
        }
    }
    public boolean isInitialized(){
        return this.flaga;
    }
}