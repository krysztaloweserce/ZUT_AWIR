
package com.example.awir.ws.server;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PaymentIdentifier" type="{}max32Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankServerPaymentIdentifier" type="{}max35Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{}max32Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankTransactionIdentifier" type="{}max35Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "paymentIdentifier",
    "bankServerPaymentIdentifier",
    "transactionIdentifier",
    "bankTransactionIdentifier"
})
@XmlRootElement(name = "PaymentRefusalSelectionCriteria")
public class PaymentRefusalSelectionCriteria {

    @XmlElement(name = "PaymentIdentifier")
    protected List<String> paymentIdentifier;
    @XmlElement(name = "BankServerPaymentIdentifier")
    protected List<String> bankServerPaymentIdentifier;
    @XmlElement(name = "TransactionIdentifier")
    protected List<String> transactionIdentifier;
    @XmlElement(name = "BankTransactionIdentifier")
    protected List<String> bankTransactionIdentifier;

    /**
     * Gets the value of the paymentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentIdentifier() {
        if (paymentIdentifier == null) {
            paymentIdentifier = new ArrayList<String>();
        }
        return this.paymentIdentifier;
    }

    /**
     * Gets the value of the bankServerPaymentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankServerPaymentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankServerPaymentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBankServerPaymentIdentifier() {
        if (bankServerPaymentIdentifier == null) {
            bankServerPaymentIdentifier = new ArrayList<String>();
        }
        return this.bankServerPaymentIdentifier;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransactionIdentifier() {
        if (transactionIdentifier == null) {
            transactionIdentifier = new ArrayList<String>();
        }
        return this.transactionIdentifier;
    }

    /**
     * Gets the value of the bankTransactionIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankTransactionIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankTransactionIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBankTransactionIdentifier() {
        if (bankTransactionIdentifier == null) {
            bankTransactionIdentifier = new ArrayList<String>();
        }
        return this.bankTransactionIdentifier;
    }

}
