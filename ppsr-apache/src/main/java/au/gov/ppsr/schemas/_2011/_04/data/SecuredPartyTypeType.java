
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuredPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuredPartyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Organisation"/>
 *     &lt;enumeration value="Individual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecuredPartyType")
@XmlEnum
public enum SecuredPartyTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("Organisation")
    ORGANISATION("Organisation"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual");
    private final String value;

    SecuredPartyTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecuredPartyTypeType fromValue(String v) {
        for (SecuredPartyTypeType c: SecuredPartyTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
