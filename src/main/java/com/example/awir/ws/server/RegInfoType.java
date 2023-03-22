
package com.example.awir.ws.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tytul"/&gt;
 *     &lt;enumeration value="Grupa"/&gt;
 *     &lt;enumeration value="Kraj"/&gt;
 *     &lt;enumeration value="Podmiot"/&gt;
 *     &lt;enumeration value="REGON"/&gt;
 *     &lt;enumeration value="Charakter beneficjenta"/&gt;
 *     &lt;enumeration value="Kod kraju"/&gt;
 *     &lt;enumeration value="Kontrola dewizowa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegInfoType")
@XmlEnum
public enum RegInfoType {

    @XmlEnumValue("Tytul")
    TYTUL("Tytul"),
    @XmlEnumValue("Grupa")
    GRUPA("Grupa"),
    @XmlEnumValue("Kraj")
    KRAJ("Kraj"),
    @XmlEnumValue("Podmiot")
    PODMIOT("Podmiot"),
    REGON("REGON"),
    @XmlEnumValue("Charakter beneficjenta")
    CHARAKTER_BENEFICJENTA("Charakter beneficjenta"),
    @XmlEnumValue("Kod kraju")
    KOD_KRAJU("Kod kraju"),
    @XmlEnumValue("Kontrola dewizowa")
    KONTROLA_DEWIZOWA("Kontrola dewizowa");
    private final String value;

    RegInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegInfoType fromValue(String v) {
        for (RegInfoType c: RegInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
