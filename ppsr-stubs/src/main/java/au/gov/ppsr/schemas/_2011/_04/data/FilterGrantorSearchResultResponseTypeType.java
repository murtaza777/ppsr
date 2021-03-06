
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterGrantorSearchResultResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterGrantorSearchResultResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="FilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorFilterCriteria"/>
 *         &lt;element name="FilterSummary" type="{http://schemas.ppsr.gov.au/2011/04/data}FilterSummary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterGrantorSearchResultResponseType", propOrder = {
    "filterCriteria",
    "filterSummary"
})
public class FilterGrantorSearchResultResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "FilterCriteria", required = true, nillable = true)
    protected SearchByGrantorFilterCriteriaType filterCriteria;
    @XmlElement(name = "FilterSummary", required = true, nillable = true)
    protected FilterSummaryType filterSummary;

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByGrantorFilterCriteriaType }
     *     
     */
    public SearchByGrantorFilterCriteriaType getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByGrantorFilterCriteriaType }
     *     
     */
    public void setFilterCriteria(SearchByGrantorFilterCriteriaType value) {
        this.filterCriteria = value;
    }

    /**
     * Gets the value of the filterSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FilterSummaryType }
     *     
     */
    public FilterSummaryType getFilterSummary() {
        return filterSummary;
    }

    /**
     * Sets the value of the filterSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSummaryType }
     *     
     */
    public void setFilterSummary(FilterSummaryType value) {
        this.filterSummary = value;
    }

}
