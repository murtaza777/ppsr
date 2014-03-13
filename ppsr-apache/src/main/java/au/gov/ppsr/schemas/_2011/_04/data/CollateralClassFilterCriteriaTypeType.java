
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralClassFilterCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralClassFilterCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="MotorVehicle"/>
 *     &lt;enumeration value="Watercraft"/>
 *     &lt;enumeration value="Aircraft"/>
 *     &lt;enumeration value="AircraftEngine"/>
 *     &lt;enumeration value="Airframe"/>
 *     &lt;enumeration value="Helicopter"/>
 *     &lt;enumeration value="SmallAircraft"/>
 *     &lt;enumeration value="Agriculture"/>
 *     &lt;enumeration value="Crops"/>
 *     &lt;enumeration value="Livestock"/>
 *     &lt;enumeration value="OtherGoods"/>
 *     &lt;enumeration value="FinancialProperty"/>
 *     &lt;enumeration value="ChattelPaper"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="DocumentOfTitle"/>
 *     &lt;enumeration value="IntermediatedSecurity"/>
 *     &lt;enumeration value="InvestmentInstrument"/>
 *     &lt;enumeration value="NegotiableInstrument"/>
 *     &lt;enumeration value="IntangibleProperty"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="GeneralIntangible"/>
 *     &lt;enumeration value="IntellectualProperty"/>
 *     &lt;enumeration value="CircuitLayout"/>
 *     &lt;enumeration value="Copyright"/>
 *     &lt;enumeration value="Patent"/>
 *     &lt;enumeration value="Design"/>
 *     &lt;enumeration value="TradeMark"/>
 *     &lt;enumeration value="PlantBreedersRight"/>
 *     &lt;enumeration value="AllPapNoExcept"/>
 *     &lt;enumeration value="AllPapWithExcept"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CollateralClassFilterCriteriaType")
@XmlEnum
public enum CollateralClassFilterCriteriaTypeType {

    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("MotorVehicle")
    MOTOR_VEHICLE("MotorVehicle"),
    @XmlEnumValue("Watercraft")
    WATERCRAFT("Watercraft"),
    @XmlEnumValue("Aircraft")
    AIRCRAFT("Aircraft"),
    @XmlEnumValue("AircraftEngine")
    AIRCRAFT_ENGINE("AircraftEngine"),
    @XmlEnumValue("Airframe")
    AIRFRAME("Airframe"),
    @XmlEnumValue("Helicopter")
    HELICOPTER("Helicopter"),
    @XmlEnumValue("SmallAircraft")
    SMALL_AIRCRAFT("SmallAircraft"),
    @XmlEnumValue("Agriculture")
    AGRICULTURE("Agriculture"),
    @XmlEnumValue("Crops")
    CROPS("Crops"),
    @XmlEnumValue("Livestock")
    LIVESTOCK("Livestock"),
    @XmlEnumValue("OtherGoods")
    OTHER_GOODS("OtherGoods"),
    @XmlEnumValue("FinancialProperty")
    FINANCIAL_PROPERTY("FinancialProperty"),
    @XmlEnumValue("ChattelPaper")
    CHATTEL_PAPER("ChattelPaper"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("DocumentOfTitle")
    DOCUMENT_OF_TITLE("DocumentOfTitle"),
    @XmlEnumValue("IntermediatedSecurity")
    INTERMEDIATED_SECURITY("IntermediatedSecurity"),
    @XmlEnumValue("InvestmentInstrument")
    INVESTMENT_INSTRUMENT("InvestmentInstrument"),
    @XmlEnumValue("NegotiableInstrument")
    NEGOTIABLE_INSTRUMENT("NegotiableInstrument"),
    @XmlEnumValue("IntangibleProperty")
    INTANGIBLE_PROPERTY("IntangibleProperty"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("GeneralIntangible")
    GENERAL_INTANGIBLE("GeneralIntangible"),
    @XmlEnumValue("IntellectualProperty")
    INTELLECTUAL_PROPERTY("IntellectualProperty"),
    @XmlEnumValue("CircuitLayout")
    CIRCUIT_LAYOUT("CircuitLayout"),
    @XmlEnumValue("Copyright")
    COPYRIGHT("Copyright"),
    @XmlEnumValue("Patent")
    PATENT("Patent"),
    @XmlEnumValue("Design")
    DESIGN("Design"),
    @XmlEnumValue("TradeMark")
    TRADE_MARK("TradeMark"),
    @XmlEnumValue("PlantBreedersRight")
    PLANT_BREEDERS_RIGHT("PlantBreedersRight"),
    @XmlEnumValue("AllPapNoExcept")
    ALL_PAP_NO_EXCEPT("AllPapNoExcept"),
    @XmlEnumValue("AllPapWithExcept")
    ALL_PAP_WITH_EXCEPT("AllPapWithExcept");
    private final String value;

    CollateralClassFilterCriteriaTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollateralClassFilterCriteriaTypeType fromValue(String v) {
        for (CollateralClassFilterCriteriaTypeType c: CollateralClassFilterCriteriaTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
