
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBySerialNumberResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBySerialNumberResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberSearchCriteria"/>
 *         &lt;element name="SearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberSearchResult"/>
 *         &lt;element name="SearchSummary" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchSummary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBySerialNumberResponseType", propOrder = {
    "ppsrTransactionId",
    "searchCriteria",
    "searchResult",
    "searchSummary"
})
public class SearchBySerialNumberResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SearchCriteria", required = true, nillable = true)
    protected SearchBySerialNumberSearchCriteriaType searchCriteria;
    @XmlElement(name = "SearchResult", required = true, nillable = true)
    protected SearchBySerialNumberSearchResultType searchResult;
    @XmlElement(name = "SearchSummary", required = true, nillable = true)
    protected SearchSummaryType searchSummary;

    /**
     * Gets the value of the ppsrTransactionId property.
     * 
     */
    public long getPpsrTransactionId() {
        return ppsrTransactionId;
    }

    /**
     * Sets the value of the ppsrTransactionId property.
     * 
     */
    public void setPpsrTransactionId(long value) {
        this.ppsrTransactionId = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBySerialNumberSearchCriteriaType }
     *     
     */
    public SearchBySerialNumberSearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBySerialNumberSearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchBySerialNumberSearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBySerialNumberSearchResultType }
     *     
     */
    public SearchBySerialNumberSearchResultType getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBySerialNumberSearchResultType }
     *     
     */
    public void setSearchResult(SearchBySerialNumberSearchResultType value) {
        this.searchResult = value;
    }

    /**
     * Gets the value of the searchSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSummaryType }
     *     
     */
    public SearchSummaryType getSearchSummary() {
        return searchSummary;
    }

    /**
     * Sets the value of the searchSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSummaryType }
     *     
     */
    public void setSearchSummary(SearchSummaryType value) {
        this.searchSummary = value;
    }

}
