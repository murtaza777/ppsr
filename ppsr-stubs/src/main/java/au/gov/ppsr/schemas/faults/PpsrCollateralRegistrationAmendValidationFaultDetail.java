
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationAmendValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationAmendValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="AddedAttachmentValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *         &lt;element name="AddedGrantorValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *         &lt;element name="CollateralRegistrationValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemovedAttachmentValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *         &lt;element name="RemovedGrantorValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrCollateralRegistrationAmendValidationFaultDetail", propOrder = {
    "addedAttachmentValidationErrors",
    "addedGrantorValidationErrors",
    "collateralRegistrationValidationErrors",
    "registrationNumber",
    "removedAttachmentValidationErrors",
    "removedGrantorValidationErrors"
})
public class PpsrCollateralRegistrationAmendValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "AddedAttachmentValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> addedAttachmentValidationErrors;
    @XmlElementRef(name = "AddedGrantorValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> addedGrantorValidationErrors;
    @XmlElementRef(name = "CollateralRegistrationValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> collateralRegistrationValidationErrors;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElementRef(name = "RemovedAttachmentValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> removedAttachmentValidationErrors;
    @XmlElementRef(name = "RemovedGrantorValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> removedGrantorValidationErrors;

    /**
     * Gets the value of the addedAttachmentValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getAddedAttachmentValidationErrors() {
        return addedAttachmentValidationErrors;
    }

    /**
     * Sets the value of the addedAttachmentValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setAddedAttachmentValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.addedAttachmentValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

    /**
     * Gets the value of the addedGrantorValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getAddedGrantorValidationErrors() {
        return addedGrantorValidationErrors;
    }

    /**
     * Sets the value of the addedGrantorValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setAddedGrantorValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.addedGrantorValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

    /**
     * Gets the value of the collateralRegistrationValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getCollateralRegistrationValidationErrors() {
        return collateralRegistrationValidationErrors;
    }

    /**
     * Sets the value of the collateralRegistrationValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setCollateralRegistrationValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.collateralRegistrationValidationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the removedAttachmentValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getRemovedAttachmentValidationErrors() {
        return removedAttachmentValidationErrors;
    }

    /**
     * Sets the value of the removedAttachmentValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setRemovedAttachmentValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.removedAttachmentValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

    /**
     * Gets the value of the removedGrantorValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getRemovedGrantorValidationErrors() {
        return removedGrantorValidationErrors;
    }

    /**
     * Sets the value of the removedGrantorValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setRemovedGrantorValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.removedGrantorValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

}
