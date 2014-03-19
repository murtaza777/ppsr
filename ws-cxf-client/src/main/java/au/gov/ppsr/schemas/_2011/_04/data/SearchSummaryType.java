
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessToSearchResultExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchExecutedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SearchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchType" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSummary", propOrder = {
    "accessToSearchResultExpiryTime",
    "resultCount",
    "searchExecutedDateTime",
    "searchNumber",
    "searchType"
})
public class SearchSummaryType {

    @XmlElement(name = "AccessToSearchResultExpiryTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessToSearchResultExpiryTime;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "SearchExecutedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchExecutedDateTime;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;
    @XmlElement(name = "SearchType", required = true)
    protected SearchTypeType searchType;

    /**
     * Gets the value of the accessToSearchResultExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessToSearchResultExpiryTime() {
        return accessToSearchResultExpiryTime;
    }

    /**
     * Sets the value of the accessToSearchResultExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessToSearchResultExpiryTime(XMLGregorianCalendar value) {
        this.accessToSearchResultExpiryTime = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the searchExecutedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchExecutedDateTime() {
        return searchExecutedDateTime;
    }

    /**
     * Sets the value of the searchExecutedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchExecutedDateTime(XMLGregorianCalendar value) {
        this.searchExecutedDateTime = value;
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

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTypeType }
     *     
     */
    public SearchTypeType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTypeType }
     *     
     */
    public void setSearchType(SearchTypeType value) {
        this.searchType = value;
    }

}
