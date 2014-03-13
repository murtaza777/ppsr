
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdinalSearchResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrdinalSearchResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="RegistrationEventOneBeforeTwo"/>
 *     &lt;enumeration value="RegistrationEventOneAfterTwo"/>
 *     &lt;enumeration value="RegistrationEventOneSameAsTwo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrdinalSearchResultType")
@XmlEnum
public enum OrdinalSearchResultTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("RegistrationEventOneBeforeTwo")
    REGISTRATION_EVENT_ONE_BEFORE_TWO("RegistrationEventOneBeforeTwo"),
    @XmlEnumValue("RegistrationEventOneAfterTwo")
    REGISTRATION_EVENT_ONE_AFTER_TWO("RegistrationEventOneAfterTwo"),
    @XmlEnumValue("RegistrationEventOneSameAsTwo")
    REGISTRATION_EVENT_ONE_SAME_AS_TWO("RegistrationEventOneSameAsTwo");
    private final String value;

    OrdinalSearchResultTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrdinalSearchResultTypeType fromValue(String v) {
        for (OrdinalSearchResultTypeType c: OrdinalSearchResultTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
