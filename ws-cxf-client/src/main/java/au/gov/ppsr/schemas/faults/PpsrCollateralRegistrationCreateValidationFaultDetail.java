
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationCreateValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationCreateValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="ApplicationValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *         &lt;element name="AttachmentValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *         &lt;element name="CollateralRegistrationValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *         &lt;element name="GrantorValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrCollateralRegistrationCreateValidationFaultDetail", propOrder = {
    "applicationValidationErrors",
    "attachmentValidationErrors",
    "collateralRegistrationValidationErrors",
    "grantorValidationErrors"
})
public class PpsrCollateralRegistrationCreateValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "ApplicationValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> applicationValidationErrors;
    @XmlElementRef(name = "AttachmentValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> attachmentValidationErrors;
    @XmlElementRef(name = "CollateralRegistrationValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> collateralRegistrationValidationErrors;
    @XmlElementRef(name = "GrantorValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationErrorGroup> grantorValidationErrors;

    /**
     * Gets the value of the applicationValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getApplicationValidationErrors() {
        return applicationValidationErrors;
    }

    /**
     * Sets the value of the applicationValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setApplicationValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.applicationValidationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

    /**
     * Gets the value of the attachmentValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getAttachmentValidationErrors() {
        return attachmentValidationErrors;
    }

    /**
     * Sets the value of the attachmentValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setAttachmentValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.attachmentValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

    /**
     * Gets the value of the collateralRegistrationValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getCollateralRegistrationValidationErrors() {
        return collateralRegistrationValidationErrors;
    }

    /**
     * Sets the value of the collateralRegistrationValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setCollateralRegistrationValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.collateralRegistrationValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

    /**
     * Gets the value of the grantorValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationErrorGroup> getGrantorValidationErrors() {
        return grantorValidationErrors;
    }

    /**
     * Sets the value of the grantorValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationErrorGroup }{@code >}
     *     
     */
    public void setGrantorValidationErrors(JAXBElement<ArrayOfPpsrValidationErrorGroup> value) {
        this.grantorValidationErrors = ((JAXBElement<ArrayOfPpsrValidationErrorGroup> ) value);
    }

}
