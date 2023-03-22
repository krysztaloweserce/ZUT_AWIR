package com.example.awir;

import java.rmi.*;

public interface Validator extends Remote
{
    public String validate(String aUserName, String aPassword) throws RemoteException;

}