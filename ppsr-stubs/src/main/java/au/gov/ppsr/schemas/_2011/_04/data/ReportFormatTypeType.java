
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Xml"/>
 *     &lt;enumeration value="Pdf"/>
 *     &lt;enumeration value="Csv"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportFormatType")
@XmlEnum
public enum ReportFormatTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("Xml")
    XML("Xml"),
    @XmlEnumValue("Pdf")
    PDF("Pdf"),
    @XmlEnumValue("Csv")
    CSV("Csv");
    private final String value;

    ReportFormatTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportFormatTypeType fromValue(String v) {
        for (ReportFormatTypeType c: ReportFormatTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
