
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NevdisData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevdisData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NevdisVehicles" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNevdisVehicle" minOccurs="0"/>
 *         &lt;element name="VerificationStatus" type="{http://schemas.ppsr.gov.au/2011/04/data}IdentifierVerificationStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevdisData", propOrder = {
    "nevdisVehicles",
    "verificationStatus"
})
public class NevdisDataType {

    @XmlElementRef(name = "NevdisVehicles", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNevdisVehicleType> nevdisVehicles;
    @XmlElement(name = "VerificationStatus", required = true)
    protected IdentifierVerificationStatusTypeType verificationStatus;

    /**
     * Gets the value of the nevdisVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNevdisVehicleType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNevdisVehicleType> getNevdisVehicles() {
        return nevdisVehicles;
    }

    /**
     * Sets the value of the nevdisVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNevdisVehicleType }{@code >}
     *     
     */
    public void setNevdisVehicles(JAXBElement<ArrayOfNevdisVehicleType> value) {
        this.nevdisVehicles = ((JAXBElement<ArrayOfNevdisVehicleType> ) value);
    }

    /**
     * Gets the value of the verificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierVerificationStatusTypeType }
     *     
     */
    public IdentifierVerificationStatusTypeType getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the value of the verificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierVerificationStatusTypeType }
     *     
     */
    public void setVerificationStatus(IdentifierVerificationStatusTypeType value) {
        this.verificationStatus = value;
    }

}
