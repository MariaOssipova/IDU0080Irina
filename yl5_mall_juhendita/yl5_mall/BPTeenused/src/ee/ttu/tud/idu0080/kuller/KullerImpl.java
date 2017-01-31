
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

import ttu.idu0080.order.server.CourierService;
import ttu.idu0080.order.server.CourierServiceService;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-11T23:33:33.152+03:00
 * Generated source version: 2.7.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "kuller",
                      portName = "kullerSOAP",
                      targetNamespace = "http://idu0080.tud.ttu.ee/kuller/",
                      wsdlLocation = "http://localhost:8086/kuller?wsdl",
                      endpointInterface = "ee.ttu.tud.idu0080.kuller.Kuller")
                      
public class KullerImpl implements Kuller {

    private static final Logger LOG = Logger.getLogger(KullerImpl.class.getName());

    /* (non-Javadoc)
     * @see ee.ttu.tud.idu0080.kuller.Kuller#getKullerid(*
     */
    public ee.ttu.tud.idu0080.kuller.KulleridVastus getKullerid() { 
        LOG.info("Executing operation getKullerid");
        try {
        	//k�sin andmed tund.ttu.ee serverilt
        	CourierServiceService ss = new CourierServiceService(
        			new URL("http://tund.ttu.ee/orderservice/couriers?wsdl"), 
        			new QName("http://server.order.idu0080.ttu/", "CourierServiceService"));
            CourierService port = ss.getCourierServicePort();  
            
            System.out.println("Invoking getAllCouriers...");
            java.util.List<ttu.idu0080.order.server.Courier> kullerid = port.getAllCouriers();
            System.out.println("getAllCouriers.result=" + kullerid);

        	
           	
        	//siin ma t��tlen andmed ja saadan tagasi massiivi, kus on kulleri ID ja nimi
        	
        	ee.ttu.tud.idu0080.kuller.KulleridVastus vastus = new ee.ttu.tud.idu0080.kuller.KulleridVastus();
        	java.util.List<ee.ttu.tud.idu0080.kuller.Kuller_Type> minuKullerid = new java.util.ArrayList<ee.ttu.tud.idu0080.kuller.Kuller_Type>();
        	
        	//n��d �kshaaval k�in tund.ttu.ee saabunud kullerite nimekirja
        	for(int i=0; i < kullerid.size(); i++)
        	{
        		ttu.idu0080.order.server.Courier ykskuller=kullerid.get(i);
        		ee.ttu.tud.idu0080.kuller.Kuller_Type minukuller=new ee.ttu.tud.idu0080.kuller.Kuller_Type();
        		minukuller.setKullerId(ykskuller.getEnterprise());
        		minukuller.setNimi(ykskuller.getName());
        		minuKullerid.add(minukuller);
        	}
        	/*for(ttu.idu0080.order.server.Courier ykskuller : kullerid)
        	{
        		
        	}*/
        	/*java.util.List<ee.ttu.tud.idu0080.kuller.Kuller_Type> _returnKuller = new java.util.ArrayList<ee.ttu.tud.idu0080.kuller.Kuller_Type>();
            ee.ttu.tud.idu0080.kuller.Kuller_Type _returnKullerVal1 = new ee.ttu.tud.idu0080.kuller.Kuller_Type();
            _returnKullerVal1.setKullerId(447644634);
            _returnKullerVal1.setNimi("Nimi936300950");
            _returnKuller.add(_returnKullerVal1);
            vastus.getKuller().addAll(_returnKuller);*/
        	vastus.getKuller().addAll(minuKullerid);
            return vastus;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
