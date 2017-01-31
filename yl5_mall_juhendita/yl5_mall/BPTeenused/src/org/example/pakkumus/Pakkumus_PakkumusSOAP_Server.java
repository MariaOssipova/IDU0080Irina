
package org.example.pakkumus;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-11T23:47:20.199+03:00
 * Generated source version: 2.7.4
 * 
 */
 
public class Pakkumus_PakkumusSOAP_Server{

    protected Pakkumus_PakkumusSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new PakkumusImpl();
        String address = "http://www.example.org/";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Pakkumus_PakkumusSOAP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}