
package au.gov.ppsr.schemas.faults;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPpsrValidationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPpsrValidationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PpsrValidationError" type="{http://schemas.ppsr.gov.au/faults}PpsrValidationError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPpsrValidationError", propOrder = {
    "ppsrValidationError"
})
public class ArrayOfPpsrValidationError {

    @XmlElement(name = "PpsrValidationError", nillable = true)
    protected List<PpsrValidationError> ppsrValidationError;

    /**
     * Gets the value of the ppsrValidationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppsrValidationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpsrValidationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpsrValidationError }
     * 
     * 
     */
    public List<PpsrValidationError> getPpsrValidationError() {
        if (ppsrValidationError == null) {
            ppsrValidationError = new ArrayList<PpsrValidationError>();
        }
        return this.ppsrValidationError;
    }

}
