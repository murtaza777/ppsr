
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByGrantorSearchResultSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorSearchResultSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClassSummary" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralClassSearchSummaryDetail"/>
 *         &lt;element name="CollateralTypeSummary" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralTypeSearchSummaryDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorSearchResultSummary", propOrder = {
    "collateralClassSummary",
    "collateralTypeSummary"
})
public class SearchByGrantorSearchResultSummaryType {

    @XmlElement(name = "CollateralClassSummary", required = true, nillable = true)
    protected ArrayOfCollateralClassSearchSummaryDetailType collateralClassSummary;
    @XmlElement(name = "CollateralTypeSummary", required = true, nillable = true)
    protected ArrayOfCollateralTypeSearchSummaryDetailType collateralTypeSummary;

    /**
     * Gets the value of the collateralClassSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCollateralClassSearchSummaryDetailType }
     *     
     */
    public ArrayOfCollateralClassSearchSummaryDetailType getCollateralClassSummary() {
        return collateralClassSummary;
    }

    /**
     * Sets the value of the collateralClassSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCollateralClassSearchSummaryDetailType }
     *     
     */
    public void setCollateralClassSummary(ArrayOfCollateralClassSearchSummaryDetailType value) {
        this.collateralClassSummary = value;
    }

    /**
     * Gets the value of the collateralTypeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCollateralTypeSearchSummaryDetailType }
     *     
     */
    public ArrayOfCollateralTypeSearchSummaryDetailType getCollateralTypeSummary() {
        return collateralTypeSummary;
    }

    /**
     * Sets the value of the collateralTypeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCollateralTypeSearchSummaryDetailType }
     *     
     */
    public void setCollateralTypeSummary(ArrayOfCollateralTypeSearchSummaryDetailType value) {
        this.collateralTypeSummary = value;
    }

}
