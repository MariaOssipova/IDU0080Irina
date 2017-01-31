
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ee.ttu.tud.idu0080.kuller;

import java.net.URL;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.namespace.QName;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.CourierService;
import ttu.idu0080.order.server.CourierServiceService;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-04-23T16:42:05.106+03:00
 * Generated source version: 2.5.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "kuller",
                      portName = "kullerSOAP",
                      targetNamespace = "http://idu0080.tud.ttu.ee/kuller/",
                      wsdlLocation = "file:/C:/Temp/ws1/BP4/WebContent/kuller.wsdl",
                      endpointInterface = "ee.ttu.tud.idu0080.kuller.Kuller")
                      
public class KullerImpl implements Kuller {

    private static final Logger LOG = Logger.getLogger(KullerImpl.class.getName());

    /* (non-Javadoc)
     * @see ee.ttu.tud.idu0080.kuller.Kuller#getKullerid(*
     */
    public ee.ttu.tud.idu0080.kuller.KulleridVastus getKullerid() { 
        LOG.info("Executing operation getKullerid");
        try {
            
        	//Seda kohta hakkame muutma
        	
        	CourierServiceService ss = new CourierServiceService(
        			new URL("http://tund.ttu.ee/orderservice/couriers?wsdl"), 
        			new QName("http://server.order.idu0080.ttu/", "CourierServiceService"));
            CourierService port = ss.getCourierServicePort();  
            
            
            System.out.println("Invoking getAllCouriers...");
            java.util.List<ttu.idu0080.order.server.Courier> kullerid = port.getAllCouriers();
            System.out.println("getAllCouriers.result=" + kullerid);


            ee.ttu.tud.idu0080.kuller.KulleridVastus vastus = new ee.ttu.tud.idu0080.kuller.KulleridVastus();
            java.util.List<ee.ttu.tud.idu0080.kuller.Kuller_Type> minuKullerid = new java.util.ArrayList<ee.ttu.tud.idu0080.kuller.Kuller_Type>();
            
            for(int i=0; i< kullerid.size();i++)
            {
            	Courier yksKuller=kullerid.get(i);
            	Kuller_Type minuKuller=new Kuller_Type();
            	minuKuller.setKullerId(yksKuller.getEnterprise());
            	minuKuller.setNimi(yksKuller.getName());
            	minuKullerid.add(minuKuller);
            }
            
        	
        	//lisan kullerid vastusele
            vastus.getKuller().addAll(minuKullerid);
        	
            /*ee.ttu.tud.idu0080.kuller.Kuller_Type _returnKullerVal1 = new ee.ttu.tud.idu0080.kuller.Kuller_Type();
            _returnKullerVal1.setKullerId(1891132499);
            _returnKullerVal1.setNimi("Nimi198440800");
            _returnKuller.add(_returnKullerVal1);
            _return.getKuller().addAll(_returnKuller);*/
            return vastus;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
