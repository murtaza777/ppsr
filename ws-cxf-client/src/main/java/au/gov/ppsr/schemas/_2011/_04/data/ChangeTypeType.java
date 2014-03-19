
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Amend"/>
 *     &lt;enumeration value="Discharge"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="Reinstate"/>
 *     &lt;enumeration value="AddressForServiceChange"/>
 *     &lt;enumeration value="Transfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeType")
@XmlEnum
public enum ChangeTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Amend")
    AMEND("Amend"),
    @XmlEnumValue("Discharge")
    DISCHARGE("Discharge"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Reinstate")
    REINSTATE("Reinstate"),
    @XmlEnumValue("AddressForServiceChange")
    ADDRESS_FOR_SERVICE_CHANGE("AddressForServiceChange"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer");
    private final String value;

    ChangeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypeType fromValue(String v) {
        for (ChangeTypeType c: ChangeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
