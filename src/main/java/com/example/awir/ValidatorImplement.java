package com.example.awir;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class ValidatorImplement extends UnicastRemoteObject implements Validator {

    protected ValidatorImplement() throws RemoteException{} //konstruktor
    private static long currentTime; //biezacy czas
    private static long tokenTime = 2500; //czas ktory ma uplynac w ms
    private static int flaga = 0; //czy token zostal uzyty, false - niewazny, true - do wykorzystania
    private static String token; //przechowuje token

    @Override
    public String validate(String aUserName, String aPassword) throws RemoteException {
        try { //proba logowania
            LdapContext ldapContext = ActiveDirectory.authenticate( aUserName, aPassword, ActiveDirectory.DOMAIN, ActiveDirectory.LDAP_HOST_1, ActiveDirectory.LDAP_PORT );
            token = generateToken();
            flaga = 2;
            currentTime = System.currentTimeMillis();
            return token;
        } catch (NamingException e) {
            return "Błąd logowania.";
        }
    }

    public String generateToken() { //generowanie tokena
        Random rand = new Random();
        byte[] bitToken= new byte[20];
        rand.nextBytes(bitToken);
        return Base64.encodeBase64String(bitToken);
    }

    public static String getToken(){
        if (flaga == 0) {
            //token jest nieważny
            return "Token jest niewazny!";
        }
        else if (System.currentTimeMillis() > currentTime + tokenTime) {
            //token jest przeterminowany
            return "Upłynął czas ważności tokena!";
        }
        else {
            flaga = flaga - 1; //token jest uzyty raz
            return token;
        }
    }
}
