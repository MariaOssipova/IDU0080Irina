
package org.example.pakkumus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tellimusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tellimusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price_total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="seller" type="{http://www.example.org/pakkumus/}seller" minOccurs="0"/>
 *         &lt;element name="shipping_address" type="{http://www.example.org/pakkumus/}address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tellimusType", propOrder = {
    "orderId",
    "priceTotal",
    "seller",
    "shippingAddress"
})
public class TellimusType {

    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(name = "price_total")
    protected double priceTotal;
    protected Seller seller;
    @XmlElement(name = "shipping_address")
    protected Address shippingAddress;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the priceTotal property.
     * 
     */
    public double getPriceTotal() {
        return priceTotal;
    }

    /**
     * Sets the value of the priceTotal property.
     * 
     */
    public void setPriceTotal(double value) {
        this.priceTotal = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link Seller }
     *     
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seller }
     *     
     */
    public void setSeller(Seller value) {
        this.seller = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

}
