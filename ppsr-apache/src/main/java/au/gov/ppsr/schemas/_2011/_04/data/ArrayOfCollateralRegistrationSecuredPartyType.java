
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCollateralRegistrationSecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCollateralRegistrationSecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralRegistrationSecuredParty" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralRegistrationSecuredParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCollateralRegistrationSecuredParty", propOrder = {
    "collateralRegistrationSecuredParty"
})
public class ArrayOfCollateralRegistrationSecuredPartyType {

    @XmlElement(name = "CollateralRegistrationSecuredParty", nillable = true)
    protected List<CollateralRegistrationSecuredPartyType> collateralRegistrationSecuredParty;

    /**
     * Gets the value of the collateralRegistrationSecuredParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralRegistrationSecuredParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralRegistrationSecuredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralRegistrationSecuredPartyType }
     * 
     * 
     */
    public List<CollateralRegistrationSecuredPartyType> getCollateralRegistrationSecuredParty() {
        if (collateralRegistrationSecuredParty == null) {
            collateralRegistrationSecuredParty = new ArrayList<CollateralRegistrationSecuredPartyType>();
        }
        return this.collateralRegistrationSecuredParty;
    }

}
