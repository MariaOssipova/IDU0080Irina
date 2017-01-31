
package ee.ttu.tud.idu0080.kuller;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-11T23:33:33.200+03:00
 * Generated source version: 2.7.4
 * 
 */
 
public class Kuller_KullerSOAP_Server{

    protected Kuller_KullerSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new KullerImpl();
        String address = "http://localhost:8086/kuller";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Kuller_KullerSOAP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}