
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="SearchByRegistrationNumber"/>
 *     &lt;enumeration value="SearchBySerialNumber"/>
 *     &lt;enumeration value="SearchByGrantor"/>
 *     &lt;enumeration value="SearchByGrantorAndEventDateRange"/>
 *     &lt;enumeration value="OrdinalSearch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchType")
@XmlEnum
public enum SearchTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("SearchByRegistrationNumber")
    SEARCH_BY_REGISTRATION_NUMBER("SearchByRegistrationNumber"),
    @XmlEnumValue("SearchBySerialNumber")
    SEARCH_BY_SERIAL_NUMBER("SearchBySerialNumber"),
    @XmlEnumValue("SearchByGrantor")
    SEARCH_BY_GRANTOR("SearchByGrantor"),
    @XmlEnumValue("SearchByGrantorAndEventDateRange")
    SEARCH_BY_GRANTOR_AND_EVENT_DATE_RANGE("SearchByGrantorAndEventDateRange"),
    @XmlEnumValue("OrdinalSearch")
    ORDINAL_SEARCH("OrdinalSearch");
    private final String value;

    SearchTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchTypeType fromValue(String v) {
        for (SearchTypeType c: SearchTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
