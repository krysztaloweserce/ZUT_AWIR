
package com.example.awir.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Text"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="TextLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", propOrder = {
    "value"
})
@XmlSeeAlso({
    Max210Text.class,
    Max35Text.class,
    Max26Text.class,
    Max70Text.class,
    Max25Text.class,
    Max50Text.class,
    Max140Text.class,
    Max14Text.class,
    Max40Text.class,
    Max33Text.class,
    Max2000Text.class,
    Min1Max4Text.class,
    Max105Text.class,
    Max15Text.class,
    Max16Text.class,
    Max20Text.class,
    Max21Text.class,
    Max34Text.class,
    Min1Max35Text.class,
    Max4Text.class,
    Min1Max70Text.class,
    Min1Max210Text.class,
    Max350Text.class
})
public class Text {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "TextLanguageCode")
    protected String textLanguageCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the textLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLanguageCode() {
        return textLanguageCode;
    }

    /**
     * Sets the value of the textLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLanguageCode(String value) {
        this.textLanguageCode = value;
    }

}
