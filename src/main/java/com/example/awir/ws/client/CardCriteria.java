
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
 *         &lt;element name="CustomerAccount" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}AccountNumber"/&gt;
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
    "customerAccount"
})
@XmlRootElement(name = "CardCriteria")
public class CardCriteria {

    @XmlElement(name = "CustomerAccount", required = true)
    protected AccountNumber customerAccount;

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountNumber }
     *     
     */
    public AccountNumber getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountNumber }
     *     
     */
    public void setCustomerAccount(AccountNumber value) {
        this.customerAccount = value;
    }

}
