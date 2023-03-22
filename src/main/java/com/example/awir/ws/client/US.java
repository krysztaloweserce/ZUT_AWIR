
package com.example.awir.ws.client;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayorIdentifier" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}PayorIdentType"/&gt;
 *         &lt;element name="PaymentFormIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USDescription" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}max40text" minOccurs="0"/&gt;
 *         &lt;element name="USPaymentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payorIdentifier",
    "paymentFormIdentifier",
    "usDescription",
    "usPaymentPeriod"
})
@XmlRootElement(name = "US")
public class US {

    @XmlElement(name = "PayorIdentifier", required = true)
    protected PayorIdentType payorIdentifier;
    @XmlElement(name = "PaymentFormIdentifier", required = true)
    protected String paymentFormIdentifier;
    @XmlElement(name = "USDescription")
    protected Max40Text usDescription;
    @XmlElement(name = "USPaymentPeriod")
    protected String usPaymentPeriod;

    /**
     * Gets the value of the payorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PayorIdentType }
     *     
     */
    public PayorIdentType getPayorIdentifier() {
        return payorIdentifier;
    }

    /**
     * Sets the value of the payorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorIdentType }
     *     
     */
    public void setPayorIdentifier(PayorIdentType value) {
        this.payorIdentifier = value;
    }

    /**
     * Gets the value of the paymentFormIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFormIdentifier() {
        return paymentFormIdentifier;
    }

    /**
     * Sets the value of the paymentFormIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFormIdentifier(String value) {
        this.paymentFormIdentifier = value;
    }

    /**
     * Gets the value of the usDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Max40Text }
     *     
     */
    public Max40Text getUSDescription() {
        return usDescription;
    }

    /**
     * Sets the value of the usDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max40Text }
     *     
     */
    public void setUSDescription(Max40Text value) {
        this.usDescription = value;
    }

    /**
     * Gets the value of the usPaymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPaymentPeriod() {
        return usPaymentPeriod;
    }

    /**
     * Sets the value of the usPaymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPaymentPeriod(String value) {
        this.usPaymentPeriod = value;
    }

}
