
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NevdisVehicleIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NevdisVehicleIdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="VIN"/>
 *     &lt;enumeration value="ChassisNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NevdisVehicleIdentifierType")
@XmlEnum
public enum NevdisVehicleIdentifierTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    VIN("VIN"),
    @XmlEnumValue("ChassisNumber")
    CHASSIS_NUMBER("ChassisNumber");
    private final String value;

    NevdisVehicleIdentifierTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NevdisVehicleIdentifierTypeType fromValue(String v) {
        for (NevdisVehicleIdentifierTypeType c: NevdisVehicleIdentifierTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
