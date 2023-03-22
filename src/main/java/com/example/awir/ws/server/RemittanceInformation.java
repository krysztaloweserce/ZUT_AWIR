
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
 *         &lt;element name="PmtId" type="{}max35Identifier" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Memo" type="{}max35text" maxOccurs="4" minOccurs="0"/&gt;
 *           &lt;element name="Unstrd" type="{}max140text" minOccurs="0"/&gt;
 *           &lt;element ref="{}RemittanceDetails" minOccurs="0"/&gt;
 *           &lt;element ref="{}US"/&gt;
 *           &lt;element ref="{}MPP"/&gt;
 *         &lt;/choice&gt;
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
    "pmtId",
    "memo",
    "unstrd",
    "remittanceDetails",
    "us",
    "mpp"
})
@XmlRootElement(name = "RemittanceInformation")
public class RemittanceInformation {

    @XmlElement(name = "PmtId")
    protected String pmtId;
    @XmlElement(name = "Memo")
    protected List<Max35Text> memo;
    @XmlElement(name = "Unstrd")
    protected Max140Text unstrd;
    @XmlElement(name = "RemittanceDetails")
    protected RemittanceDetails remittanceDetails;
    @XmlElement(name = "US")
    protected US us;
    @XmlElement(name = "MPP")
    protected MPP mpp;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtId(String value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Max35Text }
     * 
     * 
     */
    public List<Max35Text> getMemo() {
        if (memo == null) {
            memo = new ArrayList<Max35Text>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the unstrd property.
     * 
     * @return
     *     possible object is
     *     {@link Max140Text }
     *     
     */
    public Max140Text getUnstrd() {
        return unstrd;
    }

    /**
     * Sets the value of the unstrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max140Text }
     *     
     */
    public void setUnstrd(Max140Text value) {
        this.unstrd = value;
    }

    /**
     * Gets the value of the remittanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceDetails }
     *     
     */
    public RemittanceDetails getRemittanceDetails() {
        return remittanceDetails;
    }

    /**
     * Sets the value of the remittanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceDetails }
     *     
     */
    public void setRemittanceDetails(RemittanceDetails value) {
        this.remittanceDetails = value;
    }

    /**
     * Gets the value of the us property.
     * 
     * @return
     *     possible object is
     *     {@link US }
     *     
     */
    public US getUS() {
        return us;
    }

    /**
     * Sets the value of the us property.
     * 
     * @param value
     *     allowed object is
     *     {@link US }
     *     
     */
    public void setUS(US value) {
        this.us = value;
    }

    /**
     * Gets the value of the mpp property.
     * 
     * @return
     *     possible object is
     *     {@link MPP }
     *     
     */
    public MPP getMPP() {
        return mpp;
    }

    /**
     * Sets the value of the mpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPP }
     *     
     */
    public void setMPP(MPP value) {
        this.mpp = value;
    }

}
