
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.example.pakkumus;

import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.namespace.QName;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.CourierService;
import ttu.idu0080.order.server.CourierServiceService;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-11T23:47:20.151+03:00
 * Generated source version: 2.7.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "pakkumus",
                      portName = "pakkumusSOAP",
                      targetNamespace = "http://www.example.org/pakkumus/",
                      wsdlLocation = "http://www.example.org/?wsdl",
                      endpointInterface = "org.example.pakkumus.Pakkumus")
                      
public class PakkumusImpl implements Pakkumus {

    private static final Logger LOG = Logger.getLogger(PakkumusImpl.class.getName());

    /* (non-Javadoc)
     * @see org.example.pakkumus.Pakkumus#teePakkumus(org.example.pakkumus.PakkumusParing  parameters )*
     */
    public org.example.pakkumus.PakkumusVastus teePakkumus(PakkumusParing parameters) { 
        LOG.info("Executing operation teePakkumus");
        System.out.println(parameters);
        try {
        	PakkumusVastus pakkumuse_vastus = new org.example.pakkumus.PakkumusVastus();
            //_return.setHind(0.6687431578832627);
            //_return.setPaevadeArv(Integer.valueOf(366119099));
            //_return.setOfferId("OfferId1412525826");
            
        	
        	//kopeerime kullerite kliendi teenuse vajalikud read siia
        	
        	//K�sin kullerite andmed tund.ttu.ee serverilt
        	CourierServiceService ss = new CourierServiceService(
        			new URL("http://tund.ttu.ee/orderservice/couriers?wsdl"), 
        			new QName("http://server.order.idu0080.ttu/", "CourierServiceService"));
            CourierService port = ss.getCourierServicePort();  
            
            
            System.out.println("K�sin �he kulleri andmed");
            Courier kuller = port.getCourierById(parameters.getKullerId());
            
            System.out.println("Kulleri andmed :"+kuller.getName());
            
            //kulleri andmete p�hjal arvutan hinda
            /* NB! seda osa peate ise tegema
             * 
             * 
             * 
             * */
            double hind=5;
            /*kirjutate siia kuidas te seda teete
             * 
             * 
             * 
             * */
            
            //random'iga kohaletoimetamise aeg
            
            Random rdgeneraator=new Random();
            int paevade_arv=rdgeneraator.nextInt(6)+1;
            
            SecureRandom scrandom=new SecureRandom();
            String pakk_id=new BigInteger(130,scrandom).toString(32).toUpperCase();
            
            pakkumuse_vastus.setHind(hind);
            pakkumuse_vastus.setPaevadeArv(new Integer(paevade_arv));
            pakkumuse_vastus.setOfferId(pakk_id);
        
            
            return pakkumuse_vastus;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}