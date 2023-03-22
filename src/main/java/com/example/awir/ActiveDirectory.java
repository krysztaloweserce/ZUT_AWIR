package com.example.awir;

import com.example.awir.Secret;
import java.util.Base64;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
public class ActiveDirectory {

    public static final String LDAP_HOST_1 = "ni.wi.tuniv.szczecin.pl";
    public static final String LDAP_HOST_2 = "eta.wi.tuniv.szczecin.pl";
    public static final int LDAP_PORT = 389;
    public static final String DOMAIN = "WIPSAD";
    public static LdapContext authenticate(String username, String password,
                                           String domain, String ldapHost, int port) throws NamingException {
        Hashtable<String, String> env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, domain + "\\" + username);
        env.put(Context.SECURITY_CREDENTIALS, password);
        String ldapURL = "ldap://" + ldapHost;
        ldapURL += (port == 0) ? "/" : ( ":" + port + "/" );
        env.put(Context.PROVIDER_URL, ldapURL);
        return new InitialLdapContext(env, null);
    }
    public static void main(String...args) throws NamingException {
        byte [] haselko = Base64.getDecoder().decode(Secret.password);
        String tajne = new String(haselko);
        //System.out.println(Secret.password);
        LdapContext ldapContext = authenticate( "login", tajne, DOMAIN, LDAP_HOST_1, LDAP_PORT ); //logowanie
        System.out.println("zalogowano");
        ldapContext.close();
    }
}