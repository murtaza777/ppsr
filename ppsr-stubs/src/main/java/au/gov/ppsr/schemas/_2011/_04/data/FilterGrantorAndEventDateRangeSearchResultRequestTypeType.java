
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterGrantorAndEventDateRangeSearchResultRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterGrantorAndEventDateRangeSearchResultRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="FilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorAndEventDateRangeFilterCriteria"/>
 *         &lt;element name="SearchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterGrantorAndEventDateRangeSearchResultRequestType", propOrder = {
    "filterCriteria",
    "searchNumber"
})
public class FilterGrantorAndEventDateRangeSearchResultRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "FilterCriteria", required = true, nillable = true)
    protected SearchByGrantorAndEventDateRangeFilterCriteriaType filterCriteria;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByGrantorAndEventDateRangeFilterCriteriaType }
     *     
     */
    public SearchByGrantorAndEventDateRangeFilterCriteriaType getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByGrantorAndEventDateRangeFilterCriteriaType }
     *     
     */
    public void setFilterCriteria(SearchByGrantorAndEventDateRangeFilterCriteriaType value) {
        this.filterCriteria = value;
    }

    /**
     * Gets the value of the searchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchNumber() {
        return searchNumber;
    }

    /**
     * Sets the value of the searchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchNumber(String value) {
        this.searchNumber = value;
    }

}
