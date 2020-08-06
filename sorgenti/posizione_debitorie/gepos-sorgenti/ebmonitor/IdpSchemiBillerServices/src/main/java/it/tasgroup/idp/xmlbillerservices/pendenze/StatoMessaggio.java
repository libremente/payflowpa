
package it.tasgroup.idp.xmlbillerservices.pendenze;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoMessaggio.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatoMessaggio">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELABORATO_OK"/>
 *     &lt;enumeration value="ELABORATO_KO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatoMessaggio")
@XmlEnum
public enum StatoMessaggio {

    ELABORATO_OK,
    ELABORATO_KO;

    public String value() {
        return name();
    }

    public static StatoMessaggio fromValue(String v) {
        return valueOf(v);
    }

}