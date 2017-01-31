
package org.example.pakkumus;

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
 *         &lt;element name="hind" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paevade_arv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "hind",
    "paevadeArv",
    "offerId"
})
@XmlRootElement(name = "PakkumusVastus")
public class PakkumusVastus {

    protected double hind;
    @XmlElement(name = "paevade_arv")
    protected Integer paevadeArv;
    @XmlElement(name = "offer_id", required = true)
    protected String offerId;

    /**
     * Gets the value of the hind property.
     * 
     */
    public double getHind() {
        return hind;
    }

    /**
     * Sets the value of the hind property.
     * 
     */
    public void setHind(double value) {
        this.hind = value;
    }

    /**
     * Gets the value of the paevadeArv property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaevadeArv() {
        return paevadeArv;
    }

    /**
     * Sets the value of the paevadeArv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaevadeArv(Integer value) {
        this.paevadeArv = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

}
