
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrValidationErrorGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrValidationErrorGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrValidationErrorGroup", propOrder = {
    "sequenceNumber",
    "validationErrors"
})
public class PpsrValidationErrorGroup {

    @XmlElement(name = "SequenceNumber")
    protected short sequenceNumber;
    @XmlElement(name = "ValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationError validationErrors;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public short getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(short value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public ArrayOfPpsrValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfPpsrValidationError value) {
        this.validationErrors = value;
    }

}
