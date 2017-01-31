
package ee.ttu.tud.idu0080.kuller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kuller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kuller">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kuller_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kuller", propOrder = {
    "kullerId",
    "nimi"
})
public class Kuller_Type {

    @XmlElement(name = "kuller_id")
    protected int kullerId;
    @XmlElement(required = true)
    protected String nimi;

    /**
     * Gets the value of the kullerId property.
     * 
     */
    public int getKullerId() {
        return kullerId;
    }

    /**
     * Sets the value of the kullerId property.
     * 
     */
    public void setKullerId(int value) {
        this.kullerId = value;
    }

    /**
     * Gets the value of the nimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Sets the value of the nimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNimi(String value) {
        this.nimi = value;
    }

}
