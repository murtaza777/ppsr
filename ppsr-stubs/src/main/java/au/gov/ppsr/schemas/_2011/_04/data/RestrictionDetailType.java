
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsAccessRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemovalDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}RemovalDetail" minOccurs="0"/>
 *         &lt;element name="RestrictedAccessDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}RestrictedAccessDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionDetail", propOrder = {
    "isAccessRestricted",
    "isArchived",
    "isRemoved",
    "registrationNumber",
    "removalDetail",
    "restrictedAccessDetail"
})
public class RestrictionDetailType {

    @XmlElementRef(name = "IsAccessRestricted", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isAccessRestricted;
    @XmlElement(name = "IsArchived")
    protected boolean isArchived;
    @XmlElement(name = "IsRemoved")
    protected boolean isRemoved;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElementRef(name = "RemovalDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<RemovalDetailType> removalDetail;
    @XmlElementRef(name = "RestrictedAccessDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<RestrictedAccessDetailType> restrictedAccessDetail;

    /**
     * Gets the value of the isAccessRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAccessRestricted() {
        return isAccessRestricted;
    }

    /**
     * Sets the value of the isAccessRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAccessRestricted(JAXBElement<Boolean> value) {
        this.isAccessRestricted = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the isArchived property.
     * 
     */
    public boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     */
    public void setIsArchived(boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the isRemoved property.
     * 
     */
    public boolean isIsRemoved() {
        return isRemoved;
    }

    /**
     * Sets the value of the isRemoved property.
     * 
     */
    public void setIsRemoved(boolean value) {
        this.isRemoved = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the removalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemovalDetailType }{@code >}
     *     
     */
    public JAXBElement<RemovalDetailType> getRemovalDetail() {
        return removalDetail;
    }

    /**
     * Sets the value of the removalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemovalDetailType }{@code >}
     *     
     */
    public void setRemovalDetail(JAXBElement<RemovalDetailType> value) {
        this.removalDetail = ((JAXBElement<RemovalDetailType> ) value);
    }

    /**
     * Gets the value of the restrictedAccessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestrictedAccessDetailType }{@code >}
     *     
     */
    public JAXBElement<RestrictedAccessDetailType> getRestrictedAccessDetail() {
        return restrictedAccessDetail;
    }

    /**
     * Sets the value of the restrictedAccessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestrictedAccessDetailType }{@code >}
     *     
     */
    public void setRestrictedAccessDetail(JAXBElement<RestrictedAccessDetailType> value) {
        this.restrictedAccessDetail = ((JAXBElement<RestrictedAccessDetailType> ) value);
    }

}
