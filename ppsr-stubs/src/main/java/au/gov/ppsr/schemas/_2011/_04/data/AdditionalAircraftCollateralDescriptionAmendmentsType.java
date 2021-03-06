
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalAircraftCollateralDescriptionAmendments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalAircraftCollateralDescriptionAmendments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftNationalityCodeAndRegistrationMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAircraftCollateralDescriptionAmendments", propOrder = {
    "aircraftNationality",
    "aircraftNationalityCodeAndRegistrationMark"
})
public class AdditionalAircraftCollateralDescriptionAmendmentsType {

    @XmlElementRef(name = "AircraftNationality", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> aircraftNationality;
    @XmlElementRef(name = "AircraftNationalityCodeAndRegistrationMark", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> aircraftNationalityCodeAndRegistrationMark;

    /**
     * Gets the value of the aircraftNationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAircraftNationality() {
        return aircraftNationality;
    }

    /**
     * Sets the value of the aircraftNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAircraftNationality(JAXBElement<String> value) {
        this.aircraftNationality = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aircraftNationalityCodeAndRegistrationMark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAircraftNationalityCodeAndRegistrationMark() {
        return aircraftNationalityCodeAndRegistrationMark;
    }

    /**
     * Sets the value of the aircraftNationalityCodeAndRegistrationMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAircraftNationalityCodeAndRegistrationMark(JAXBElement<String> value) {
        this.aircraftNationalityCodeAndRegistrationMark = ((JAXBElement<String> ) value);
    }

}
