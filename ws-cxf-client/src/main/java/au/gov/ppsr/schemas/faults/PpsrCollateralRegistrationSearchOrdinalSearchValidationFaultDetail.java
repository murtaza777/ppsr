
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationSearchOrdinalSearchValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationSearchOrdinalSearchValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="RegistrationEventOneValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *         &lt;element name="RegistrationEventTwoValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrCollateralRegistrationSearchOrdinalSearchValidationFaultDetail", propOrder = {
    "registrationEventOneValidationErrors",
    "registrationEventTwoValidationErrors"
})
public class PpsrCollateralRegistrationSearchOrdinalSearchValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "RegistrationEventOneValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> registrationEventOneValidationErrors;
    @XmlElementRef(name = "RegistrationEventTwoValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> registrationEventTwoValidationErrors;

    /**
     * Gets the value of the registrationEventOneValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getRegistrationEventOneValidationErrors() {
        return registrationEventOneValidationErrors;
    }

    /**
     * Sets the value of the registrationEventOneValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setRegistrationEventOneValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.registrationEventOneValidationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

    /**
     * Gets the value of the registrationEventTwoValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getRegistrationEventTwoValidationErrors() {
        return registrationEventTwoValidationErrors;
    }

    /**
     * Sets the value of the registrationEventTwoValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setRegistrationEventTwoValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.registrationEventTwoValidationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

}
