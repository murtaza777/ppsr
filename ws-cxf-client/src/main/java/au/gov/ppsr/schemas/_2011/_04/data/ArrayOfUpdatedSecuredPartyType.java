
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdatedSecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdatedSecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdatedSecuredParty" type="{http://schemas.ppsr.gov.au/2011/04/data}UpdatedSecuredParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdatedSecuredParty", propOrder = {
    "updatedSecuredParty"
})
public class ArrayOfUpdatedSecuredPartyType {

    @XmlElement(name = "UpdatedSecuredParty", nillable = true)
    protected List<UpdatedSecuredPartyType> updatedSecuredParty;

    /**
     * Gets the value of the updatedSecuredParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedSecuredParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedSecuredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedSecuredPartyType }
     * 
     * 
     */
    public List<UpdatedSecuredPartyType> getUpdatedSecuredParty() {
        if (updatedSecuredParty == null) {
            updatedSecuredParty = new ArrayList<UpdatedSecuredPartyType>();
        }
        return this.updatedSecuredParty;
    }

}
