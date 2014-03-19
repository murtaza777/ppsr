
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReverifySecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReverifySecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReverifySecuredParty" type="{http://schemas.ppsr.gov.au/2011/04/data}ReverifySecuredParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReverifySecuredParty", propOrder = {
    "reverifySecuredParty"
})
public class ArrayOfReverifySecuredPartyType {

    @XmlElement(name = "ReverifySecuredParty", nillable = true)
    protected List<ReverifySecuredPartyType> reverifySecuredParty;

    /**
     * Gets the value of the reverifySecuredParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reverifySecuredParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReverifySecuredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReverifySecuredPartyType }
     * 
     * 
     */
    public List<ReverifySecuredPartyType> getReverifySecuredParty() {
        if (reverifySecuredParty == null) {
            reverifySecuredParty = new ArrayList<ReverifySecuredPartyType>();
        }
        return this.reverifySecuredParty;
    }

}
