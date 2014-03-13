//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.23 at 05:12:29 PM EST 
//


package au.gov.ppsr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="ChangeNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegistrationEventType")
@XmlEnum
public enum RegistrationEventTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),
    @XmlEnumValue("ChangeNumber")
    CHANGE_NUMBER("ChangeNumber");
    private final String value;

    RegistrationEventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistrationEventTypeType fromValue(String v) {
        for (RegistrationEventTypeType c: RegistrationEventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
