
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerialNumberSearchCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SerialNumberSearchCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="VIN"/>
 *     &lt;enumeration value="ChassisNumber"/>
 *     &lt;enumeration value="MotorVehicleManufacturersNumber"/>
 *     &lt;enumeration value="HIN"/>
 *     &lt;enumeration value="OfficialNumber"/>
 *     &lt;enumeration value="AircraftEngineManufacturersNumber"/>
 *     &lt;enumeration value="AirframeManufacturersNumber"/>
 *     &lt;enumeration value="HelicopterManufacturersNumber"/>
 *     &lt;enumeration value="AircraftNationalityCodeAndRegistrationMark"/>
 *     &lt;enumeration value="PatentNumber"/>
 *     &lt;enumeration value="TradeMarkNumber"/>
 *     &lt;enumeration value="DesignNumber"/>
 *     &lt;enumeration value="PlantBreedersRightNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SerialNumberSearchCriteriaType")
@XmlEnum
public enum SerialNumberSearchCriteriaTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    VIN("VIN"),
    @XmlEnumValue("ChassisNumber")
    CHASSIS_NUMBER("ChassisNumber"),
    @XmlEnumValue("MotorVehicleManufacturersNumber")
    MOTOR_VEHICLE_MANUFACTURERS_NUMBER("MotorVehicleManufacturersNumber"),
    HIN("HIN"),
    @XmlEnumValue("OfficialNumber")
    OFFICIAL_NUMBER("OfficialNumber"),
    @XmlEnumValue("AircraftEngineManufacturersNumber")
    AIRCRAFT_ENGINE_MANUFACTURERS_NUMBER("AircraftEngineManufacturersNumber"),
    @XmlEnumValue("AirframeManufacturersNumber")
    AIRFRAME_MANUFACTURERS_NUMBER("AirframeManufacturersNumber"),
    @XmlEnumValue("HelicopterManufacturersNumber")
    HELICOPTER_MANUFACTURERS_NUMBER("HelicopterManufacturersNumber"),
    @XmlEnumValue("AircraftNationalityCodeAndRegistrationMark")
    AIRCRAFT_NATIONALITY_CODE_AND_REGISTRATION_MARK("AircraftNationalityCodeAndRegistrationMark"),
    @XmlEnumValue("PatentNumber")
    PATENT_NUMBER("PatentNumber"),
    @XmlEnumValue("TradeMarkNumber")
    TRADE_MARK_NUMBER("TradeMarkNumber"),
    @XmlEnumValue("DesignNumber")
    DESIGN_NUMBER("DesignNumber"),
    @XmlEnumValue("PlantBreedersRightNumber")
    PLANT_BREEDERS_RIGHT_NUMBER("PlantBreedersRightNumber");
    private final String value;

    SerialNumberSearchCriteriaTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerialNumberSearchCriteriaTypeType fromValue(String v) {
        for (SerialNumberSearchCriteriaTypeType c: SerialNumberSearchCriteriaTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
