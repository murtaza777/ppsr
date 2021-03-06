
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationNumberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="ACN"/>
 *     &lt;enumeration value="ARBN"/>
 *     &lt;enumeration value="ARSN"/>
 *     &lt;enumeration value="ABN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationNumberType")
@XmlEnum
public enum OrganisationNumberTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    ACN("ACN"),
    ARBN("ARBN"),
    ARSN("ARSN"),
    ABN("ABN");
    private final String value;

    OrganisationNumberTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationNumberTypeType fromValue(String v) {
        for (OrganisationNumberTypeType c: OrganisationNumberTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
