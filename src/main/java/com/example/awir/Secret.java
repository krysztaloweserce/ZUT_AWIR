package com.example.awir;

import java.util.Base64;

public class Secret {
    static public String password = Base64.getEncoder().encodeToString("password".getBytes());
}
