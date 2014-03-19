
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralClassSearchSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralClassSearchSummaryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClass" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralClassFilterCriteriaType"/>
 *         &lt;element name="CollateralClassResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralClassSearchSummaryDetail", propOrder = {
    "collateralClass",
    "collateralClassResultCount"
})
public class CollateralClassSearchSummaryDetailType {

    @XmlElement(name = "CollateralClass", required = true)
    protected CollateralClassFilterCriteriaTypeType collateralClass;
    @XmlElement(name = "CollateralClassResultCount")
    protected int collateralClassResultCount;

    /**
     * Gets the value of the collateralClass property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralClassFilterCriteriaTypeType }
     *     
     */
    public CollateralClassFilterCriteriaTypeType getCollateralClass() {
        return collateralClass;
    }

    /**
     * Sets the value of the collateralClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralClassFilterCriteriaTypeType }
     *     
     */
    public void setCollateralClass(CollateralClassFilterCriteriaTypeType value) {
        this.collateralClass = value;
    }

    /**
     * Gets the value of the collateralClassResultCount property.
     * 
     */
    public int getCollateralClassResultCount() {
        return collateralClassResultCount;
    }

    /**
     * Sets the value of the collateralClassResultCount property.
     * 
     */
    public void setCollateralClassResultCount(int value) {
        this.collateralClassResultCount = value;
    }

}
