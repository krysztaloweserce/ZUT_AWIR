
package com.example.awir.ws.client;

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
 *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BankTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmtCashCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAccount" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}Account" minOccurs="0"/&gt;
 *         &lt;element name="OrderedAmount" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}AmountType"/&gt;
 *         &lt;element name="ImmediatePmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://wi.zut.edu.pl/xsd/payment/v1.0}RemittanceInformation"/&gt;
 *         &lt;element name="AuthorizedPersonName" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}max70text" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedPersonSurname" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}max70text" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedPersonIdentity" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}PayorIdentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedPersonAddress" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedPersonPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalNote" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}max2000text" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDeclaration" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}AdditionalDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ATMNetwor" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}max35text" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBankOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://wi.zut.edu.pl/xsd/payment/v1.0}Denominations" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://wi.zut.edu.pl/xsd/payment/v1.0}TransactionStatus" minOccurs="0"/&gt;
 *         &lt;element name="TransactionRejection" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}TransactionRejectionType" minOccurs="0"/&gt;
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
    "transactionIdentifier",
    "bankTransactionIdentifier",
    "pmtCashCategory",
    "customerAccount",
    "orderedAmount",
    "immediatePmt",
    "remittanceInformation",
    "authorizedPersonName",
    "authorizedPersonSurname",
    "authorizedPersonIdentity",
    "authorizedPersonAddress",
    "authorizedPersonPhone",
    "additionalNote",
    "additionalDeclaration",
    "atmNetwor",
    "paymentBankOffice",
    "denominations",
    "transactionStatus",
    "transactionRejection"
})
@XmlRootElement(name = "PaymentCashDetails")
public class PaymentCashDetails {

    @XmlElement(name = "TransactionIdentifier", required = true)
    protected String transactionIdentifier;
    @XmlElement(name = "BankTransactionIdentifier")
    protected String bankTransactionIdentifier;
    @XmlElement(name = "PmtCashCategory")
    protected String pmtCashCategory;
    @XmlElement(name = "CustomerAccount")
    protected Account customerAccount;
    @XmlElement(name = "OrderedAmount", required = true)
    protected AmountType orderedAmount;
    @XmlElement(name = "ImmediatePmt")
    protected Boolean immediatePmt;
    @XmlElement(name = "RemittanceInformation", required = true)
    protected RemittanceInformation remittanceInformation;
    @XmlElement(name = "AuthorizedPersonName")
    protected Max70Text authorizedPersonName;
    @XmlElement(name = "AuthorizedPersonSurname")
    protected Max70Text authorizedPersonSurname;
    @XmlElement(name = "AuthorizedPersonIdentity")
    protected List<PayorIdentType> authorizedPersonIdentity;
    @XmlElement(name = "AuthorizedPersonAddress")
    protected AddressType authorizedPersonAddress;
    @XmlElement(name = "AuthorizedPersonPhone")
    protected String authorizedPersonPhone;
    @XmlElement(name = "AdditionalNote")
    protected Max2000Text additionalNote;
    @XmlElement(name = "AdditionalDeclaration")
    protected List<AdditionalDeclarationType> additionalDeclaration;
    @XmlElement(name = "ATMNetwor")
    protected Max35Text atmNetwor;
    @XmlElement(name = "PaymentBankOffice")
    protected String paymentBankOffice;
    @XmlElement(name = "Denominations")
    protected List<Denominations> denominations;
    @XmlElement(name = "TransactionStatus")
    protected TransactionStatus transactionStatus;
    @XmlElement(name = "TransactionRejection")
    protected TransactionRejectionType transactionRejection;

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the bankTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransactionIdentifier() {
        return bankTransactionIdentifier;
    }

    /**
     * Sets the value of the bankTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransactionIdentifier(String value) {
        this.bankTransactionIdentifier = value;
    }

    /**
     * Gets the value of the pmtCashCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCashCategory() {
        return pmtCashCategory;
    }

    /**
     * Sets the value of the pmtCashCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCashCategory(String value) {
        this.pmtCashCategory = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCustomerAccount(Account value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the orderedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOrderedAmount() {
        return orderedAmount;
    }

    /**
     * Sets the value of the orderedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOrderedAmount(AmountType value) {
        this.orderedAmount = value;
    }

    /**
     * Gets the value of the immediatePmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediatePmt() {
        return immediatePmt;
    }

    /**
     * Sets the value of the immediatePmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediatePmt(Boolean value) {
        this.immediatePmt = value;
    }

    /**
     * Gets the value of the remittanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation }
     *     
     */
    public RemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * Sets the value of the remittanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation }
     *     
     */
    public void setRemittanceInformation(RemittanceInformation value) {
        this.remittanceInformation = value;
    }

    /**
     * Gets the value of the authorizedPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link Max70Text }
     *     
     */
    public Max70Text getAuthorizedPersonName() {
        return authorizedPersonName;
    }

    /**
     * Sets the value of the authorizedPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70Text }
     *     
     */
    public void setAuthorizedPersonName(Max70Text value) {
        this.authorizedPersonName = value;
    }

    /**
     * Gets the value of the authorizedPersonSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Max70Text }
     *     
     */
    public Max70Text getAuthorizedPersonSurname() {
        return authorizedPersonSurname;
    }

    /**
     * Sets the value of the authorizedPersonSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70Text }
     *     
     */
    public void setAuthorizedPersonSurname(Max70Text value) {
        this.authorizedPersonSurname = value;
    }

    /**
     * Gets the value of the authorizedPersonIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedPersonIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedPersonIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayorIdentType }
     * 
     * 
     */
    public List<PayorIdentType> getAuthorizedPersonIdentity() {
        if (authorizedPersonIdentity == null) {
            authorizedPersonIdentity = new ArrayList<PayorIdentType>();
        }
        return this.authorizedPersonIdentity;
    }

    /**
     * Gets the value of the authorizedPersonAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAuthorizedPersonAddress() {
        return authorizedPersonAddress;
    }

    /**
     * Sets the value of the authorizedPersonAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAuthorizedPersonAddress(AddressType value) {
        this.authorizedPersonAddress = value;
    }

    /**
     * Gets the value of the authorizedPersonPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedPersonPhone() {
        return authorizedPersonPhone;
    }

    /**
     * Sets the value of the authorizedPersonPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedPersonPhone(String value) {
        this.authorizedPersonPhone = value;
    }

    /**
     * Gets the value of the additionalNote property.
     * 
     * @return
     *     possible object is
     *     {@link Max2000Text }
     *     
     */
    public Max2000Text getAdditionalNote() {
        return additionalNote;
    }

    /**
     * Sets the value of the additionalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max2000Text }
     *     
     */
    public void setAdditionalNote(Max2000Text value) {
        this.additionalNote = value;
    }

    /**
     * Gets the value of the additionalDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDeclarationType }
     * 
     * 
     */
    public List<AdditionalDeclarationType> getAdditionalDeclaration() {
        if (additionalDeclaration == null) {
            additionalDeclaration = new ArrayList<AdditionalDeclarationType>();
        }
        return this.additionalDeclaration;
    }

    /**
     * Gets the value of the atmNetwor property.
     * 
     * @return
     *     possible object is
     *     {@link Max35Text }
     *     
     */
    public Max35Text getATMNetwor() {
        return atmNetwor;
    }

    /**
     * Sets the value of the atmNetwor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35Text }
     *     
     */
    public void setATMNetwor(Max35Text value) {
        this.atmNetwor = value;
    }

    /**
     * Gets the value of the paymentBankOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankOffice() {
        return paymentBankOffice;
    }

    /**
     * Sets the value of the paymentBankOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankOffice(String value) {
        this.paymentBankOffice = value;
    }

    /**
     * Gets the value of the denominations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denominations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenominations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Denominations }
     * 
     * 
     */
    public List<Denominations> getDenominations() {
        if (denominations == null) {
            denominations = new ArrayList<Denominations>();
        }
        return this.denominations;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setTransactionStatus(TransactionStatus value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionRejection property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRejectionType }
     *     
     */
    public TransactionRejectionType getTransactionRejection() {
        return transactionRejection;
    }

    /**
     * Sets the value of the transactionRejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRejectionType }
     *     
     */
    public void setTransactionRejection(TransactionRejectionType value) {
        this.transactionRejection = value;
    }

}
