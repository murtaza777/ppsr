
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrB2GMailboxRetrieveMessagesValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrB2GMailboxRetrieveMessagesValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="RetrieveValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrB2GMailboxRetrieveMessagesValidationFaultDetail", propOrder = {
    "retrieveValidationErrors"
})
public class PpsrB2GMailboxRetrieveMessagesValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "RetrieveValidationErrors", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPpsrValidationError> retrieveValidationErrors;

    /**
     * Gets the value of the retrieveValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPpsrValidationError> getRetrieveValidationErrors() {
        return retrieveValidationErrors;
    }

    /**
     * Sets the value of the retrieveValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPpsrValidationError }{@code >}
     *     
     */
    public void setRetrieveValidationErrors(JAXBElement<ArrayOfPpsrValidationError> value) {
        this.retrieveValidationErrors = ((JAXBElement<ArrayOfPpsrValidationError> ) value);
    }

}
