
package com.example.awir.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDeclarationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationItemCode" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}min1max70text"/&gt;
 *         &lt;element name="DeclarationItemValue" type="{http://wi.zut.edu.pl/xsd/payment/v1.0}min1max210text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDeclarationType", propOrder = {
    "declarationItemCode",
    "declarationItemValue"
})
public class AdditionalDeclarationType {

    @XmlElement(name = "DeclarationItemCode", required = true)
    protected Min1Max70Text declarationItemCode;
    @XmlElement(name = "DeclarationItemValue", required = true)
    protected Min1Max210Text declarationItemValue;

    /**
     * Gets the value of the declarationItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link Min1Max70Text }
     *     
     */
    public Min1Max70Text getDeclarationItemCode() {
        return declarationItemCode;
    }

    /**
     * Sets the value of the declarationItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Min1Max70Text }
     *     
     */
    public void setDeclarationItemCode(Min1Max70Text value) {
        this.declarationItemCode = value;
    }

    /**
     * Gets the value of the declarationItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link Min1Max210Text }
     *     
     */
    public Min1Max210Text getDeclarationItemValue() {
        return declarationItemValue;
    }

    /**
     * Sets the value of the declarationItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Min1Max210Text }
     *     
     */
    public void setDeclarationItemValue(Min1Max210Text value) {
        this.declarationItemValue = value;
    }

}
