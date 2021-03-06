
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierVerificationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierVerificationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Found"/>
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="NotVerified"/>
 *     &lt;enumeration value="NotPerformed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentifierVerificationStatusType")
@XmlEnum
public enum IdentifierVerificationStatusTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("Found")
    FOUND("Found"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("NotVerified")
    NOT_VERIFIED("NotVerified"),
    @XmlEnumValue("NotPerformed")
    NOT_PERFORMED("NotPerformed");
    private final String value;

    IdentifierVerificationStatusTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentifierVerificationStatusTypeType fromValue(String v) {
        for (IdentifierVerificationStatusTypeType c: IdentifierVerificationStatusTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
