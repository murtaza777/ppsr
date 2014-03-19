
package au.gov.ppsr.schemas.faults;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPpsrValidationErrorGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPpsrValidationErrorGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PpsrValidationErrorGroup" type="{http://schemas.ppsr.gov.au/faults}PpsrValidationErrorGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPpsrValidationErrorGroup", propOrder = {
    "ppsrValidationErrorGroup"
})
public class ArrayOfPpsrValidationErrorGroup {

    @XmlElement(name = "PpsrValidationErrorGroup", nillable = true)
    protected List<PpsrValidationErrorGroup> ppsrValidationErrorGroup;

    /**
     * Gets the value of the ppsrValidationErrorGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppsrValidationErrorGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpsrValidationErrorGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpsrValidationErrorGroup }
     * 
     * 
     */
    public List<PpsrValidationErrorGroup> getPpsrValidationErrorGroup() {
        if (ppsrValidationErrorGroup == null) {
            ppsrValidationErrorGroup = new ArrayList<PpsrValidationErrorGroup>();
        }
        return this.ppsrValidationErrorGroup;
    }

}
