
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCollateralClassSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCollateralClassSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClassSearchCriteriaType" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralClassSearchCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCollateralClassSearchCriteriaType", propOrder = {
    "collateralClassSearchCriteriaType"
})
public class ArrayOfCollateralClassSearchCriteriaTypeType {

    @XmlElement(name = "CollateralClassSearchCriteriaType")
    protected List<CollateralClassSearchCriteriaTypeType> collateralClassSearchCriteriaType;

    /**
     * Gets the value of the collateralClassSearchCriteriaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralClassSearchCriteriaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralClassSearchCriteriaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralClassSearchCriteriaTypeType }
     * 
     * 
     */
    public List<CollateralClassSearchCriteriaTypeType> getCollateralClassSearchCriteriaType() {
        if (collateralClassSearchCriteriaType == null) {
            collateralClassSearchCriteriaType = new ArrayList<CollateralClassSearchCriteriaTypeType>();
        }
        return this.collateralClassSearchCriteriaType;
    }

}
