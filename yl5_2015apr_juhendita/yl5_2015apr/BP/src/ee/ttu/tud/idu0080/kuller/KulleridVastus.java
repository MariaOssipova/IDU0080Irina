
package ee.ttu.tud.idu0080.kuller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kuller" type="{http://idu0080.tud.ttu.ee/kuller/}kuller" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kuller"
})
@XmlRootElement(name = "KulleridVastus")
public class KulleridVastus {

    protected List<Kuller_Type> kuller;

    /**
     * Gets the value of the kuller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKuller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kuller_Type }
     * 
     * 
     */
    public List<Kuller_Type> getKuller() {
        if (kuller == null) {
            kuller = new ArrayList<Kuller_Type>();
        }
        return this.kuller;
    }

}
