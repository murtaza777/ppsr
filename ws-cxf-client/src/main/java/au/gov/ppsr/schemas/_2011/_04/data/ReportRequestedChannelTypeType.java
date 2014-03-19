
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequestedChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportRequestedChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="B2G"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="ContactCentre"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportRequestedChannelType")
@XmlEnum
public enum ReportRequestedChannelTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("B2G")
    B_2_G("B2G"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("ContactCentre")
    CONTACT_CENTRE("ContactCentre");
    private final String value;

    ReportRequestedChannelTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportRequestedChannelTypeType fromValue(String v) {
        for (ReportRequestedChannelTypeType c: ReportRequestedChannelTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
