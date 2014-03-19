
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchByGrantorSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClassSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralClassSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="GrantorIndividualSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorIndividualSearchCriteria" minOccurs="0"/>
 *         &lt;element name="GrantorOrganisationSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorOrganisationSearchCriteria" minOccurs="0"/>
 *         &lt;element name="GrantorType" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorType"/>
 *         &lt;element name="IncludeArchived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeMigratedTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeNonMigratedTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeNonTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPMSISearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchSelectionFlagType"/>
 *         &lt;element name="PointInTimeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberSortOrder" type="{http://schemas.ppsr.gov.au/2011/04/data}SortOrderType"/>
 *         &lt;element name="SecurityInterestsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorSearchCriteria", propOrder = {
    "collateralClassSearchCriteria",
    "grantorIndividualSearchCriteria",
    "grantorOrganisationSearchCriteria",
    "grantorType",
    "includeArchived",
    "includeCurrent",
    "includeExpired",
    "includeMigratedTransitional",
    "includeNonMigratedTransitional",
    "includeNonTransitional",
    "includeRemoved",
    "isPMSISearchCriteria",
    "pointInTimeDateTime",
    "registrationNumberSortOrder",
    "securityInterestsOnly"
})
public class SearchByGrantorSearchCriteriaType {

    @XmlElementRef(name = "CollateralClassSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> collateralClassSearchCriteria;
    @XmlElementRef(name = "GrantorIndividualSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorIndividualSearchCriteriaType> grantorIndividualSearchCriteria;
    @XmlElementRef(name = "GrantorOrganisationSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorOrganisationSearchCriteriaType> grantorOrganisationSearchCriteria;
    @XmlElement(name = "GrantorType", required = true)
    protected GrantorTypeType grantorType;
    @XmlElement(name = "IncludeArchived")
    protected boolean includeArchived;
    @XmlElement(name = "IncludeCurrent")
    protected boolean includeCurrent;
    @XmlElement(name = "IncludeExpired")
    protected boolean includeExpired;
    @XmlElement(name = "IncludeMigratedTransitional")
    protected boolean includeMigratedTransitional;
    @XmlElement(name = "IncludeNonMigratedTransitional")
    protected boolean includeNonMigratedTransitional;
    @XmlElement(name = "IncludeNonTransitional")
    protected boolean includeNonTransitional;
    @XmlElement(name = "IncludeRemoved")
    protected boolean includeRemoved;
    @XmlElement(name = "IsPMSISearchCriteria", required = true)
    protected SearchSelectionFlagTypeType isPMSISearchCriteria;
    @XmlElementRef(name = "PointInTimeDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> pointInTimeDateTime;
    @XmlElement(name = "RegistrationNumberSortOrder", required = true)
    protected SortOrderTypeType registrationNumberSortOrder;
    @XmlElement(name = "SecurityInterestsOnly")
    protected boolean securityInterestsOnly;

    /**
     * Gets the value of the collateralClassSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassSearchCriteriaTypeType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> getCollateralClassSearchCriteria() {
        return collateralClassSearchCriteria;
    }

    /**
     * Sets the value of the collateralClassSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassSearchCriteriaTypeType }{@code >}
     *     
     */
    public void setCollateralClassSearchCriteria(JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> value) {
        this.collateralClassSearchCriteria = ((JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> ) value);
    }

    /**
     * Gets the value of the grantorIndividualSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<GrantorIndividualSearchCriteriaType> getGrantorIndividualSearchCriteria() {
        return grantorIndividualSearchCriteria;
    }

    /**
     * Sets the value of the grantorIndividualSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}
     *     
     */
    public void setGrantorIndividualSearchCriteria(JAXBElement<GrantorIndividualSearchCriteriaType> value) {
        this.grantorIndividualSearchCriteria = ((JAXBElement<GrantorIndividualSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the grantorOrganisationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<GrantorOrganisationSearchCriteriaType> getGrantorOrganisationSearchCriteria() {
        return grantorOrganisationSearchCriteria;
    }

    /**
     * Sets the value of the grantorOrganisationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}
     *     
     */
    public void setGrantorOrganisationSearchCriteria(JAXBElement<GrantorOrganisationSearchCriteriaType> value) {
        this.grantorOrganisationSearchCriteria = ((JAXBElement<GrantorOrganisationSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the grantorType property.
     * 
     * @return
     *     possible object is
     *     {@link GrantorTypeType }
     *     
     */
    public GrantorTypeType getGrantorType() {
        return grantorType;
    }

    /**
     * Sets the value of the grantorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantorTypeType }
     *     
     */
    public void setGrantorType(GrantorTypeType value) {
        this.grantorType = value;
    }

    /**
     * Gets the value of the includeArchived property.
     * 
     */
    public boolean isIncludeArchived() {
        return includeArchived;
    }

    /**
     * Sets the value of the includeArchived property.
     * 
     */
    public void setIncludeArchived(boolean value) {
        this.includeArchived = value;
    }

    /**
     * Gets the value of the includeCurrent property.
     * 
     */
    public boolean isIncludeCurrent() {
        return includeCurrent;
    }

    /**
     * Sets the value of the includeCurrent property.
     * 
     */
    public void setIncludeCurrent(boolean value) {
        this.includeCurrent = value;
    }

    /**
     * Gets the value of the includeExpired property.
     * 
     */
    public boolean isIncludeExpired() {
        return includeExpired;
    }

    /**
     * Sets the value of the includeExpired property.
     * 
     */
    public void setIncludeExpired(boolean value) {
        this.includeExpired = value;
    }

    /**
     * Gets the value of the includeMigratedTransitional property.
     * 
     */
    public boolean isIncludeMigratedTransitional() {
        return includeMigratedTransitional;
    }

    /**
     * Sets the value of the includeMigratedTransitional property.
     * 
     */
    public void setIncludeMigratedTransitional(boolean value) {
        this.includeMigratedTransitional = value;
    }

    /**
     * Gets the value of the includeNonMigratedTransitional property.
     * 
     */
    public boolean isIncludeNonMigratedTransitional() {
        return includeNonMigratedTransitional;
    }

    /**
     * Sets the value of the includeNonMigratedTransitional property.
     * 
     */
    public void setIncludeNonMigratedTransitional(boolean value) {
        this.includeNonMigratedTransitional = value;
    }

    /**
     * Gets the value of the includeNonTransitional property.
     * 
     */
    public boolean isIncludeNonTransitional() {
        return includeNonTransitional;
    }

    /**
     * Sets the value of the includeNonTransitional property.
     * 
     */
    public void setIncludeNonTransitional(boolean value) {
        this.includeNonTransitional = value;
    }

    /**
     * Gets the value of the includeRemoved property.
     * 
     */
    public boolean isIncludeRemoved() {
        return includeRemoved;
    }

    /**
     * Sets the value of the includeRemoved property.
     * 
     */
    public void setIncludeRemoved(boolean value) {
        this.includeRemoved = value;
    }

    /**
     * Gets the value of the isPMSISearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSelectionFlagTypeType }
     *     
     */
    public SearchSelectionFlagTypeType getIsPMSISearchCriteria() {
        return isPMSISearchCriteria;
    }

    /**
     * Sets the value of the isPMSISearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSelectionFlagTypeType }
     *     
     */
    public void setIsPMSISearchCriteria(SearchSelectionFlagTypeType value) {
        this.isPMSISearchCriteria = value;
    }

    /**
     * Gets the value of the pointInTimeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPointInTimeDateTime() {
        return pointInTimeDateTime;
    }

    /**
     * Sets the value of the pointInTimeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPointInTimeDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.pointInTimeDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the registrationNumberSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderTypeType }
     *     
     */
    public SortOrderTypeType getRegistrationNumberSortOrder() {
        return registrationNumberSortOrder;
    }

    /**
     * Sets the value of the registrationNumberSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderTypeType }
     *     
     */
    public void setRegistrationNumberSortOrder(SortOrderTypeType value) {
        this.registrationNumberSortOrder = value;
    }

    /**
     * Gets the value of the securityInterestsOnly property.
     * 
     */
    public boolean isSecurityInterestsOnly() {
        return securityInterestsOnly;
    }

    /**
     * Sets the value of the securityInterestsOnly property.
     * 
     */
    public void setSecurityInterestsOnly(boolean value) {
        this.securityInterestsOnly = value;
    }

}
