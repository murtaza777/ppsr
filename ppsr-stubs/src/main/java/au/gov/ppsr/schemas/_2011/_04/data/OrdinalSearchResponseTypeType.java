
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdinalSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalSearchResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchSearchCriteria"/>
 *         &lt;element name="SearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchSearchResult"/>
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
@XmlType(name = "OrdinalSearchResponseType", propOrder = {
    "ppsrTransactionId",
    "searchCriteria",
    "searchResult",
    "searchSummary"
})
public class OrdinalSearchResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SearchCriteria", required = true, nillable = true)
    protected OrdinalSearchSearchCriteriaType searchCriteria;
    @XmlElement(name = "SearchResult", required = true, nillable = true)
    protected OrdinalSearchSearchResultType searchResult;
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
     *     {@link OrdinalSearchSearchCriteriaType }
     *     
     */
    public OrdinalSearchSearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalSearchSearchCriteriaType }
     *     
     */
    public void setSearchCriteria(OrdinalSearchSearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalSearchSearchResultType }
     *     
     */
    public OrdinalSearchSearchResultType getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalSearchSearchResultType }
     *     
     */
    public void setSearchResult(OrdinalSearchSearchResultType value) {
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
