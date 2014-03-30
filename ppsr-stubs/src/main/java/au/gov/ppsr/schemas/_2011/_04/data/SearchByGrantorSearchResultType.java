
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByGrantorSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GrantorOrganisationSearchCriteriaVerificationDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorOrganisationWithVerificationStatus" minOccurs="0"/>
 *         &lt;element name="MaximumNumberOfReturnedRegistrationsPerRetrieve" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchResultSummary" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorSearchResultSummary"/>
 *         &lt;element name="TransitionalPeriodMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorSearchResult", propOrder = {
    "filterNumber",
    "grantorOrganisationSearchCriteriaVerificationDetail",
    "maximumNumberOfReturnedRegistrationsPerRetrieve",
    "searchResultSummary",
    "transitionalPeriodMessage"
})
public class SearchByGrantorSearchResultType {

    @XmlElement(name = "FilterNumber")
    protected int filterNumber;
    @XmlElementRef(name = "GrantorOrganisationSearchCriteriaVerificationDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorOrganisationWithVerificationStatusType> grantorOrganisationSearchCriteriaVerificationDetail;
    @XmlElement(name = "MaximumNumberOfReturnedRegistrationsPerRetrieve")
    protected int maximumNumberOfReturnedRegistrationsPerRetrieve;
    @XmlElement(name = "SearchResultSummary", required = true, nillable = true)
    protected SearchByGrantorSearchResultSummaryType searchResultSummary;
    @XmlElementRef(name = "TransitionalPeriodMessage", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> transitionalPeriodMessage;

    /**
     * Gets the value of the filterNumber property.
     * 
     */
    public int getFilterNumber() {
        return filterNumber;
    }

    /**
     * Sets the value of the filterNumber property.
     * 
     */
    public void setFilterNumber(int value) {
        this.filterNumber = value;
    }

    /**
     * Gets the value of the grantorOrganisationSearchCriteriaVerificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationWithVerificationStatusType }{@code >}
     *     
     */
    public JAXBElement<GrantorOrganisationWithVerificationStatusType> getGrantorOrganisationSearchCriteriaVerificationDetail() {
        return grantorOrganisationSearchCriteriaVerificationDetail;
    }

    /**
     * Sets the value of the grantorOrganisationSearchCriteriaVerificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationWithVerificationStatusType }{@code >}
     *     
     */
    public void setGrantorOrganisationSearchCriteriaVerificationDetail(JAXBElement<GrantorOrganisationWithVerificationStatusType> value) {
        this.grantorOrganisationSearchCriteriaVerificationDetail = ((JAXBElement<GrantorOrganisationWithVerificationStatusType> ) value);
    }

    /**
     * Gets the value of the maximumNumberOfReturnedRegistrationsPerRetrieve property.
     * 
     */
    public int getMaximumNumberOfReturnedRegistrationsPerRetrieve() {
        return maximumNumberOfReturnedRegistrationsPerRetrieve;
    }

    /**
     * Sets the value of the maximumNumberOfReturnedRegistrationsPerRetrieve property.
     * 
     */
    public void setMaximumNumberOfReturnedRegistrationsPerRetrieve(int value) {
        this.maximumNumberOfReturnedRegistrationsPerRetrieve = value;
    }

    /**
     * Gets the value of the searchResultSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByGrantorSearchResultSummaryType }
     *     
     */
    public SearchByGrantorSearchResultSummaryType getSearchResultSummary() {
        return searchResultSummary;
    }

    /**
     * Sets the value of the searchResultSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByGrantorSearchResultSummaryType }
     *     
     */
    public void setSearchResultSummary(SearchByGrantorSearchResultSummaryType value) {
        this.searchResultSummary = value;
    }

    /**
     * Gets the value of the transitionalPeriodMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransitionalPeriodMessage() {
        return transitionalPeriodMessage;
    }

    /**
     * Sets the value of the transitionalPeriodMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransitionalPeriodMessage(JAXBElement<String> value) {
        this.transitionalPeriodMessage = ((JAXBElement<String> ) value);
    }

}
