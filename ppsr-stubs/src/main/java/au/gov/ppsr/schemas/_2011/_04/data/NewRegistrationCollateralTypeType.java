
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewRegistrationCollateralType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewRegistrationCollateralType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consumer"/>
 *     &lt;enumeration value="Commercial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NewRegistrationCollateralType")
@XmlEnum
public enum NewRegistrationCollateralTypeType {

    @XmlEnumValue("Consumer")
    CONSUMER("Consumer"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial");
    private final String value;

    NewRegistrationCollateralTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NewRegistrationCollateralTypeType fromValue(String v) {
        for (NewRegistrationCollateralTypeType c: NewRegistrationCollateralTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
