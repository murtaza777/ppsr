
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewRegistrationSerialisedCollateralDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewRegistrationSerialisedCollateralDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalAircraftDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}AdditionalAircraftCollateralDescription" minOccurs="0"/>
 *         &lt;element name="AdditionalVehicleDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}AdditionalVehicleCollateralDescription" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SerialNumberType" type="{http://schemas.ppsr.gov.au/2011/04/data}NewRegistrationSerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewRegistrationSerialisedCollateralDescription", propOrder = {
    "additionalAircraftDetails",
    "additionalVehicleDetails",
    "serialNumber",
    "serialNumberType"
})
public class NewRegistrationSerialisedCollateralDescriptionType {

    @XmlElementRef(name = "AdditionalAircraftDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<AdditionalAircraftCollateralDescriptionType> additionalAircraftDetails;
    @XmlElementRef(name = "AdditionalVehicleDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<AdditionalVehicleCollateralDescriptionType> additionalVehicleDetails;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SerialNumberType", required = true)
    protected NewRegistrationSerialNumberTypeType serialNumberType;

    /**
     * Gets the value of the additionalAircraftDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionType }{@code >}
     *     
     */
    public JAXBElement<AdditionalAircraftCollateralDescriptionType> getAdditionalAircraftDetails() {
        return additionalAircraftDetails;
    }

    /**
     * Sets the value of the additionalAircraftDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionType }{@code >}
     *     
     */
    public void setAdditionalAircraftDetails(JAXBElement<AdditionalAircraftCollateralDescriptionType> value) {
        this.additionalAircraftDetails = ((JAXBElement<AdditionalAircraftCollateralDescriptionType> ) value);
    }

    /**
     * Gets the value of the additionalVehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionType }{@code >}
     *     
     */
    public JAXBElement<AdditionalVehicleCollateralDescriptionType> getAdditionalVehicleDetails() {
        return additionalVehicleDetails;
    }

    /**
     * Sets the value of the additionalVehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionType }{@code >}
     *     
     */
    public void setAdditionalVehicleDetails(JAXBElement<AdditionalVehicleCollateralDescriptionType> value) {
        this.additionalVehicleDetails = ((JAXBElement<AdditionalVehicleCollateralDescriptionType> ) value);
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link NewRegistrationSerialNumberTypeType }
     *     
     */
    public NewRegistrationSerialNumberTypeType getSerialNumberType() {
        return serialNumberType;
    }

    /**
     * Sets the value of the serialNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRegistrationSerialNumberTypeType }
     *     
     */
    public void setSerialNumberType(NewRegistrationSerialNumberTypeType value) {
        this.serialNumberType = value;
    }

}
