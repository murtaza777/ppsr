
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NevdisVehicleDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevdisVehicleDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Jurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JurisdictionParticipation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Registration" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisRegistration" minOccurs="0"/>
 *         &lt;element name="VehicleDescription" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisVehicleDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevdisVehicleDetail", propOrder = {
    "jurisdiction",
    "jurisdictionParticipation",
    "registration",
    "vehicleDescription"
})
public class NevdisVehicleDetailType {

    @XmlElementRef(name = "Jurisdiction", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> jurisdiction;
    @XmlElement(name = "JurisdictionParticipation")
    protected Boolean jurisdictionParticipation;
    @XmlElementRef(name = "Registration", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<NevdisRegistrationType> registration;
    @XmlElementRef(name = "VehicleDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<NevdisVehicleDescriptionType> vehicleDescription;

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJurisdiction(JAXBElement<String> value) {
        this.jurisdiction = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jurisdictionParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJurisdictionParticipation() {
        return jurisdictionParticipation;
    }

    /**
     * Sets the value of the jurisdictionParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJurisdictionParticipation(Boolean value) {
        this.jurisdictionParticipation = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NevdisRegistrationType }{@code >}
     *     
     */
    public JAXBElement<NevdisRegistrationType> getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NevdisRegistrationType }{@code >}
     *     
     */
    public void setRegistration(JAXBElement<NevdisRegistrationType> value) {
        this.registration = ((JAXBElement<NevdisRegistrationType> ) value);
    }

    /**
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NevdisVehicleDescriptionType }{@code >}
     *     
     */
    public JAXBElement<NevdisVehicleDescriptionType> getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NevdisVehicleDescriptionType }{@code >}
     *     
     */
    public void setVehicleDescription(JAXBElement<NevdisVehicleDescriptionType> value) {
        this.vehicleDescription = ((JAXBElement<NevdisVehicleDescriptionType> ) value);
    }

}
