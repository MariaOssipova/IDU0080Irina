
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ee.ttu.tud.idu0080.kuller;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-04-23T17:08:17.735+03:00
 * Generated source version: 2.7.14
 * 
 */

@javax.jws.WebService(
                      serviceName = "kuller",
                      portName = "kullerSOAP",
                      targetNamespace = "http://idu0080.tud.ttu.ee/kuller/",
                      wsdlLocation = "http://localhost:8083/BP4/services/kullerSOAP?wsdl",
                      endpointInterface = "ee.ttu.tud.idu0080.kuller.Kuller")
                      
public class KullerImpl implements Kuller {

    private static final Logger LOG = Logger.getLogger(KullerImpl.class.getName());

    /* (non-Javadoc)
     * @see ee.ttu.tud.idu0080.kuller.Kuller#getKullerid(*
     */
    public ee.ttu.tud.idu0080.kuller.KulleridVastus getKullerid() { 
        LOG.info("Executing operation getKullerid");
        try {
            ee.ttu.tud.idu0080.kuller.KulleridVastus _return = new ee.ttu.tud.idu0080.kuller.KulleridVastus();
            java.util.List<ee.ttu.tud.idu0080.kuller.Kuller_Type> _returnKuller = new java.util.ArrayList<ee.ttu.tud.idu0080.kuller.Kuller_Type>();
            ee.ttu.tud.idu0080.kuller.Kuller_Type _returnKullerVal1 = new ee.ttu.tud.idu0080.kuller.Kuller_Type();
            _returnKullerVal1.setKullerId(318139523);
            _returnKullerVal1.setNimi("Nimi1727926666");
            _returnKuller.add(_returnKullerVal1);
            _return.getKuller().addAll(_returnKuller);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
