
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCollateralTypeSearchSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCollateralTypeSearchSummaryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralTypeSearchSummaryDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralTypeSearchSummaryDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCollateralTypeSearchSummaryDetail", propOrder = {
    "collateralTypeSearchSummaryDetail"
})
public class ArrayOfCollateralTypeSearchSummaryDetailType {

    @XmlElement(name = "CollateralTypeSearchSummaryDetail", nillable = true)
    protected List<CollateralTypeSearchSummaryDetailType> collateralTypeSearchSummaryDetail;

    /**
     * Gets the value of the collateralTypeSearchSummaryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralTypeSearchSummaryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralTypeSearchSummaryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralTypeSearchSummaryDetailType }
     * 
     * 
     */
    public List<CollateralTypeSearchSummaryDetailType> getCollateralTypeSearchSummaryDetail() {
        if (collateralTypeSearchSummaryDetail == null) {
            collateralTypeSearchSummaryDetail = new ArrayList<CollateralTypeSearchSummaryDetailType>();
        }
        return this.collateralTypeSearchSummaryDetail;
    }

}
