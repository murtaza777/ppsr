
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrdinalSearchSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchSearchResult" minOccurs="0"/>
 *         &lt;element name="SearchByGrantorAndEventDateRangeSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorSearchResult" minOccurs="0"/>
 *         &lt;element name="SearchByGrantorSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorSearchResult" minOccurs="0"/>
 *         &lt;element name="SearchByRegistrationNumberSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByRegistrationNumberSearchResult" minOccurs="0"/>
 *         &lt;element name="SearchBySerialNumberSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "ordinalSearchSearchResult",
    "searchByGrantorAndEventDateRangeSearchResult",
    "searchByGrantorSearchResult",
    "searchByRegistrationNumberSearchResult",
    "searchBySerialNumberSearchResult"
})
public class SearchResultType {

    @XmlElementRef(name = "OrdinalSearchSearchResult", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<OrdinalSearchSearchResultType> ordinalSearchSearchResult;
    @XmlElementRef(name = "SearchByGrantorAndEventDateRangeSearchResult", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorSearchResultType> searchByGrantorAndEventDateRangeSearchResult;
    @XmlElementRef(name = "SearchByGrantorSearchResult", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorSearchResultType> searchByGrantorSearchResult;
    @XmlElementRef(name = "SearchByRegistrationNumberSearchResult", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByRegistrationNumberSearchResultType> searchByRegistrationNumberSearchResult;
    @XmlElementRef(name = "SearchBySerialNumberSearchResult", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchBySerialNumberSearchResultType> searchBySerialNumberSearchResult;

    /**
     * Gets the value of the ordinalSearchSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrdinalSearchSearchResultType }{@code >}
     *     
     */
    public JAXBElement<OrdinalSearchSearchResultType> getOrdinalSearchSearchResult() {
        return ordinalSearchSearchResult;
    }

    /**
     * Sets the value of the ordinalSearchSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrdinalSearchSearchResultType }{@code >}
     *     
     */
    public void setOrdinalSearchSearchResult(JAXBElement<OrdinalSearchSearchResultType> value) {
        this.ordinalSearchSearchResult = ((JAXBElement<OrdinalSearchSearchResultType> ) value);
    }

    /**
     * Gets the value of the searchByGrantorAndEventDateRangeSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorSearchResultType> getSearchByGrantorAndEventDateRangeSearchResult() {
        return searchByGrantorAndEventDateRangeSearchResult;
    }

    /**
     * Sets the value of the searchByGrantorAndEventDateRangeSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}
     *     
     */
    public void setSearchByGrantorAndEventDateRangeSearchResult(JAXBElement<SearchByGrantorSearchResultType> value) {
        this.searchByGrantorAndEventDateRangeSearchResult = ((JAXBElement<SearchByGrantorSearchResultType> ) value);
    }

    /**
     * Gets the value of the searchByGrantorSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorSearchResultType> getSearchByGrantorSearchResult() {
        return searchByGrantorSearchResult;
    }

    /**
     * Sets the value of the searchByGrantorSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}
     *     
     */
    public void setSearchByGrantorSearchResult(JAXBElement<SearchByGrantorSearchResultType> value) {
        this.searchByGrantorSearchResult = ((JAXBElement<SearchByGrantorSearchResultType> ) value);
    }

    /**
     * Gets the value of the searchByRegistrationNumberSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchResultType }{@code >}
     *     
     */
    public JAXBElement<SearchByRegistrationNumberSearchResultType> getSearchByRegistrationNumberSearchResult() {
        return searchByRegistrationNumberSearchResult;
    }

    /**
     * Sets the value of the searchByRegistrationNumberSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchResultType }{@code >}
     *     
     */
    public void setSearchByRegistrationNumberSearchResult(JAXBElement<SearchByRegistrationNumberSearchResultType> value) {
        this.searchByRegistrationNumberSearchResult = ((JAXBElement<SearchByRegistrationNumberSearchResultType> ) value);
    }

    /**
     * Gets the value of the searchBySerialNumberSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchResultType }{@code >}
     *     
     */
    public JAXBElement<SearchBySerialNumberSearchResultType> getSearchBySerialNumberSearchResult() {
        return searchBySerialNumberSearchResult;
    }

    /**
     * Sets the value of the searchBySerialNumberSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchResultType }{@code >}
     *     
     */
    public void setSearchBySerialNumberSearchResult(JAXBElement<SearchBySerialNumberSearchResultType> value) {
        this.searchBySerialNumberSearchResult = ((JAXBElement<SearchBySerialNumberSearchResultType> ) value);
    }

}
