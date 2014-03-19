
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationSearchValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationSearchValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="ValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrCollateralRegistrationSearchValidationFaultDetail", propOrder = {
    "validationErrors"
})
public class PpsrCollateralRegistrationSearchValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "ValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> validationErrors;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.validationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

}
