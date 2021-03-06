
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByGrantorFilterCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorFilterCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClassFilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralClassFilterCriteriaType" minOccurs="0"/>
 *         &lt;element name="CollateralTypeFilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralType" minOccurs="0"/>
 *         &lt;element name="IncludeMigratedTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeNonMigratedTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeNonTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPMSIFilterCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchSelectionFlagType"/>
 *         &lt;element name="LastChangeTimeYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecurityInterestsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartTimeYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorFilterCriteria", propOrder = {
    "collateralClassFilterCriteria",
    "collateralTypeFilterCriteria",
    "includeMigratedTransitional",
    "includeNonMigratedTransitional",
    "includeNonTransitional",
    "isPMSIFilterCriteria",
    "lastChangeTimeYear",
    "securityInterestsOnly",
    "startTimeYear"
})
public class SearchByGrantorFilterCriteriaType {

    @XmlElementRef(name = "CollateralClassFilterCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> collateralClassFilterCriteria;
    @XmlElementRef(name = "CollateralTypeFilterCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCollateralTypeType> collateralTypeFilterCriteria;
    @XmlElement(name = "IncludeMigratedTransitional")
    protected boolean includeMigratedTransitional;
    @XmlElement(name = "IncludeNonMigratedTransitional")
    protected boolean includeNonMigratedTransitional;
    @XmlElement(name = "IncludeNonTransitional")
    protected boolean includeNonTransitional;
    @XmlElement(name = "IsPMSIFilterCriteria", required = true)
    protected SearchSelectionFlagTypeType isPMSIFilterCriteria;
    @XmlElementRef(name = "LastChangeTimeYear", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Integer> lastChangeTimeYear;
    @XmlElement(name = "SecurityInterestsOnly")
    protected boolean securityInterestsOnly;
    @XmlElementRef(name = "StartTimeYear", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Integer> startTimeYear;

    /**
     * Gets the value of the collateralClassFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassFilterCriteriaTypeType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> getCollateralClassFilterCriteria() {
        return collateralClassFilterCriteria;
    }

    /**
     * Sets the value of the collateralClassFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassFilterCriteriaTypeType }{@code >}
     *     
     */
    public void setCollateralClassFilterCriteria(JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> value) {
        this.collateralClassFilterCriteria = ((JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> ) value);
    }

    /**
     * Gets the value of the collateralTypeFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralTypeType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCollateralTypeType> getCollateralTypeFilterCriteria() {
        return collateralTypeFilterCriteria;
    }

    /**
     * Sets the value of the collateralTypeFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCollateralTypeType }{@code >}
     *     
     */
    public void setCollateralTypeFilterCriteria(JAXBElement<ArrayOfCollateralTypeType> value) {
        this.collateralTypeFilterCriteria = ((JAXBElement<ArrayOfCollateralTypeType> ) value);
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
     * Gets the value of the isPMSIFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSelectionFlagTypeType }
     *     
     */
    public SearchSelectionFlagTypeType getIsPMSIFilterCriteria() {
        return isPMSIFilterCriteria;
    }

    /**
     * Sets the value of the isPMSIFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSelectionFlagTypeType }
     *     
     */
    public void setIsPMSIFilterCriteria(SearchSelectionFlagTypeType value) {
        this.isPMSIFilterCriteria = value;
    }

    /**
     * Gets the value of the lastChangeTimeYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastChangeTimeYear() {
        return lastChangeTimeYear;
    }

    /**
     * Sets the value of the lastChangeTimeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastChangeTimeYear(JAXBElement<Integer> value) {
        this.lastChangeTimeYear = ((JAXBElement<Integer> ) value);
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

    /**
     * Gets the value of the startTimeYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStartTimeYear() {
        return startTimeYear;
    }

    /**
     * Sets the value of the startTimeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStartTimeYear(JAXBElement<Integer> value) {
        this.startTimeYear = ((JAXBElement<Integer> ) value);
    }

}
