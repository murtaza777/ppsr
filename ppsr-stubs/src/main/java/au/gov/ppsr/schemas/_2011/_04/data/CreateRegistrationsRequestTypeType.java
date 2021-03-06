
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRegistrationsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRegistrationsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="CollateralType" type="{http://schemas.ppsr.gov.au/2011/04/data}NewRegistrationCollateralType"/>
 *         &lt;element name="Grantors" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewGrantor" minOccurs="0"/>
 *         &lt;element name="IsTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NewRegistrations" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewCollateralRegistration"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRegistrationsRequestType", propOrder = {
    "collateralType",
    "grantors",
    "isTransitional",
    "newRegistrations",
    "securedPartyGroupNumber"
})
public class CreateRegistrationsRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "CollateralType", required = true)
    protected NewRegistrationCollateralTypeType collateralType;
    @XmlElementRef(name = "Grantors", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNewGrantorType> grantors;
    @XmlElement(name = "IsTransitional")
    protected boolean isTransitional;
    @XmlElement(name = "NewRegistrations", required = true, nillable = true)
    protected ArrayOfNewCollateralRegistrationType newRegistrations;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

    /**
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link NewRegistrationCollateralTypeType }
     *     
     */
    public NewRegistrationCollateralTypeType getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRegistrationCollateralTypeType }
     *     
     */
    public void setCollateralType(NewRegistrationCollateralTypeType value) {
        this.collateralType = value;
    }

    /**
     * Gets the value of the grantors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNewGrantorType> getGrantors() {
        return grantors;
    }

    /**
     * Sets the value of the grantors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}
     *     
     */
    public void setGrantors(JAXBElement<ArrayOfNewGrantorType> value) {
        this.grantors = ((JAXBElement<ArrayOfNewGrantorType> ) value);
    }

    /**
     * Gets the value of the isTransitional property.
     * 
     */
    public boolean isIsTransitional() {
        return isTransitional;
    }

    /**
     * Sets the value of the isTransitional property.
     * 
     */
    public void setIsTransitional(boolean value) {
        this.isTransitional = value;
    }

    /**
     * Gets the value of the newRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewCollateralRegistrationType }
     *     
     */
    public ArrayOfNewCollateralRegistrationType getNewRegistrations() {
        return newRegistrations;
    }

    /**
     * Sets the value of the newRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewCollateralRegistrationType }
     *     
     */
    public void setNewRegistrations(ArrayOfNewCollateralRegistrationType value) {
        this.newRegistrations = value;
    }

    /**
     * Gets the value of the securedPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupNumber() {
        return securedPartyGroupNumber;
    }

    /**
     * Sets the value of the securedPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupNumber(String value) {
        this.securedPartyGroupNumber = value;
    }

}
