
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralTypeSearchSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralTypeSearchSummaryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralType" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralType"/>
 *         &lt;element name="CollateralTypeResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralTypeSearchSummaryDetail", propOrder = {
    "collateralType",
    "collateralTypeResultCount"
})
public class CollateralTypeSearchSummaryDetailType {

    @XmlElement(name = "CollateralType", required = true)
    protected CollateralTypeType collateralType;
    @XmlElement(name = "CollateralTypeResultCount")
    protected int collateralTypeResultCount;

    /**
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTypeType }
     *     
     */
    public CollateralTypeType getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTypeType }
     *     
     */
    public void setCollateralType(CollateralTypeType value) {
        this.collateralType = value;
    }

    /**
     * Gets the value of the collateralTypeResultCount property.
     * 
     */
    public int getCollateralTypeResultCount() {
        return collateralTypeResultCount;
    }

    /**
     * Sets the value of the collateralTypeResultCount property.
     * 
     */
    public void setCollateralTypeResultCount(int value) {
        this.collateralTypeResultCount = value;
    }

}
