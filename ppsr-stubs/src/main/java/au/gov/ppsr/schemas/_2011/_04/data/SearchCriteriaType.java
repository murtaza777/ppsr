
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrdinalSearchSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchSearchCriteria" minOccurs="0"/>
 *         &lt;element name="SearchByGrantorAndEventDateRangeSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorAndEventDateRangeSearchCriteria" minOccurs="0"/>
 *         &lt;element name="SearchByGrantorSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorSearchCriteria" minOccurs="0"/>
 *         &lt;element name="SearchByRegistrationNumberSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByRegistrationNumberSearchCriteria" minOccurs="0"/>
 *         &lt;element name="SearchBySerialNumberSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberSearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "ordinalSearchSearchCriteria",
    "searchByGrantorAndEventDateRangeSearchCriteria",
    "searchByGrantorSearchCriteria",
    "searchByRegistrationNumberSearchCriteria",
    "searchBySerialNumberSearchCriteria"
})
public class SearchCriteriaType {

    @XmlElementRef(name = "OrdinalSearchSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<OrdinalSearchSearchCriteriaType> ordinalSearchSearchCriteria;
    @XmlElementRef(name = "SearchByGrantorAndEventDateRangeSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> searchByGrantorAndEventDateRangeSearchCriteria;
    @XmlElementRef(name = "SearchByGrantorSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorSearchCriteriaType> searchByGrantorSearchCriteria;
    @XmlElementRef(name = "SearchByRegistrationNumberSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchByRegistrationNumberSearchCriteriaType> searchByRegistrationNumberSearchCriteria;
    @XmlElementRef(name = "SearchBySerialNumberSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SearchBySerialNumberSearchCriteriaType> searchBySerialNumberSearchCriteria;

    /**
     * Gets the value of the ordinalSearchSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrdinalSearchSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<OrdinalSearchSearchCriteriaType> getOrdinalSearchSearchCriteria() {
        return ordinalSearchSearchCriteria;
    }

    /**
     * Sets the value of the ordinalSearchSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrdinalSearchSearchCriteriaType }{@code >}
     *     
     */
    public void setOrdinalSearchSearchCriteria(JAXBElement<OrdinalSearchSearchCriteriaType> value) {
        this.ordinalSearchSearchCriteria = ((JAXBElement<OrdinalSearchSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the searchByGrantorAndEventDateRangeSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> getSearchByGrantorAndEventDateRangeSearchCriteria() {
        return searchByGrantorAndEventDateRangeSearchCriteria;
    }

    /**
     * Sets the value of the searchByGrantorAndEventDateRangeSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeSearchCriteriaType }{@code >}
     *     
     */
    public void setSearchByGrantorAndEventDateRangeSearchCriteria(JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> value) {
        this.searchByGrantorAndEventDateRangeSearchCriteria = ((JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the searchByGrantorSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorSearchCriteriaType> getSearchByGrantorSearchCriteria() {
        return searchByGrantorSearchCriteria;
    }

    /**
     * Sets the value of the searchByGrantorSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorSearchCriteriaType }{@code >}
     *     
     */
    public void setSearchByGrantorSearchCriteria(JAXBElement<SearchByGrantorSearchCriteriaType> value) {
        this.searchByGrantorSearchCriteria = ((JAXBElement<SearchByGrantorSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the searchByRegistrationNumberSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<SearchByRegistrationNumberSearchCriteriaType> getSearchByRegistrationNumberSearchCriteria() {
        return searchByRegistrationNumberSearchCriteria;
    }

    /**
     * Sets the value of the searchByRegistrationNumberSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchCriteriaType }{@code >}
     *     
     */
    public void setSearchByRegistrationNumberSearchCriteria(JAXBElement<SearchByRegistrationNumberSearchCriteriaType> value) {
        this.searchByRegistrationNumberSearchCriteria = ((JAXBElement<SearchByRegistrationNumberSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the searchBySerialNumberSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<SearchBySerialNumberSearchCriteriaType> getSearchBySerialNumberSearchCriteria() {
        return searchBySerialNumberSearchCriteria;
    }

    /**
     * Sets the value of the searchBySerialNumberSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchCriteriaType }{@code >}
     *     
     */
    public void setSearchBySerialNumberSearchCriteria(JAXBElement<SearchBySerialNumberSearchCriteriaType> value) {
        this.searchBySerialNumberSearchCriteria = ((JAXBElement<SearchBySerialNumberSearchCriteriaType> ) value);
    }

}
