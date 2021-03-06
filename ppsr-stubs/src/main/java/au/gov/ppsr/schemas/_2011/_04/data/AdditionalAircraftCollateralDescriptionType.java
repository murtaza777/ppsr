
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalAircraftCollateralDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalAircraftCollateralDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftNationalityCodeAndRegistrationMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturersModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAircraftCollateralDescription", propOrder = {
    "aircraftNationality",
    "aircraftNationalityCodeAndRegistrationMark",
    "manufacturersModel",
    "manufacturersName"
})
public class AdditionalAircraftCollateralDescriptionType {

    @XmlElementRef(name = "AircraftNationality", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> aircraftNationality;
    @XmlElementRef(name = "AircraftNationalityCodeAndRegistrationMark", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> aircraftNationalityCodeAndRegistrationMark;
    @XmlElementRef(name = "ManufacturersModel", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> manufacturersModel;
    @XmlElementRef(name = "ManufacturersName", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> manufacturersName;

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

    /**
     * Gets the value of the manufacturersModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturersModel() {
        return manufacturersModel;
    }

    /**
     * Sets the value of the manufacturersModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturersModel(JAXBElement<String> value) {
        this.manufacturersModel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the manufacturersName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturersName() {
        return manufacturersName;
    }

    /**
     * Sets the value of the manufacturersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturersName(JAXBElement<String> value) {
        this.manufacturersName = ((JAXBElement<String> ) value);
    }

}
