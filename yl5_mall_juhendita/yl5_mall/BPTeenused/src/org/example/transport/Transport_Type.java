
package org.example.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="pakkumus_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pakkumusId"
})
@XmlRootElement(name = "Transport")
public class Transport_Type {

    @XmlElement(name = "pakkumus_id", required = true)
    protected String pakkumusId;

    /**
     * Gets the value of the pakkumusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPakkumusId() {
        return pakkumusId;
    }

    /**
     * Sets the value of the pakkumusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPakkumusId(String value) {
        this.pakkumusId = value;
    }

}
