
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="ProcessingPending"/>
 *     &lt;enumeration value="ProcessingCompleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportStatusType")
@XmlEnum
public enum ReportStatusTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("ProcessingPending")
    PROCESSING_PENDING("ProcessingPending"),
    @XmlEnumValue("ProcessingCompleted")
    PROCESSING_COMPLETED("ProcessingCompleted");
    private final String value;

    ReportStatusTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportStatusTypeType fromValue(String v) {
        for (ReportStatusTypeType c: ReportStatusTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
