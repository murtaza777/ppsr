
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterGrantorSearchResultRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterGrantorSearchResultRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="FilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorFilterCriteria"/>
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
@XmlType(name = "FilterGrantorSearchResultRequestType", propOrder = {
    "filterCriteria",
    "searchNumber"
})
public class FilterGrantorSearchResultRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "FilterCriteria", required = true, nillable = true)
    protected SearchByGrantorFilterCriteriaType filterCriteria;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;

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
