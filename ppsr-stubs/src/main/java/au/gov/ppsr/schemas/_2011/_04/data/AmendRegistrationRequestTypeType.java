
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendRegistrationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRegistrationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CollateralRegistrationAmendments" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralRegistrationAmendments"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRegistrationRequestType", propOrder = {
    "changeNumber",
    "collateralRegistrationAmendments",
    "registrationNumber",
    "registrationToken",
    "securedPartyGroupAccessCode",
    "securedPartyGroupNumber"
})
public class AmendRegistrationRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "CollateralRegistrationAmendments", required = true, nillable = true)
    protected CollateralRegistrationAmendmentsType collateralRegistrationAmendments;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElementRef(name = "RegistrationToken", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> registrationToken;
    @XmlElementRef(name = "SecuredPartyGroupAccessCode", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> securedPartyGroupAccessCode;
    @XmlElementRef(name = "SecuredPartyGroupNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> securedPartyGroupNumber;

    /**
     * Gets the value of the changeNumber property.
     * 
     */
    public long getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     */
    public void setChangeNumber(long value) {
        this.changeNumber = value;
    }

    /**
     * Gets the value of the collateralRegistrationAmendments property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRegistrationAmendmentsType }
     *     
     */
    public CollateralRegistrationAmendmentsType getCollateralRegistrationAmendments() {
        return collateralRegistrationAmendments;
    }

    /**
     * Sets the value of the collateralRegistrationAmendments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRegistrationAmendmentsType }
     *     
     */
    public void setCollateralRegistrationAmendments(CollateralRegistrationAmendmentsType value) {
        this.collateralRegistrationAmendments = value;
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
     * Gets the value of the registrationToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationToken() {
        return registrationToken;
    }

    /**
     * Sets the value of the registrationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationToken(JAXBElement<String> value) {
        this.registrationToken = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securedPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuredPartyGroupAccessCode() {
        return securedPartyGroupAccessCode;
    }

    /**
     * Sets the value of the securedPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuredPartyGroupAccessCode(JAXBElement<String> value) {
        this.securedPartyGroupAccessCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securedPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuredPartyGroupNumber() {
        return securedPartyGroupNumber;
    }

    /**
     * Sets the value of the securedPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuredPartyGroupNumber(JAXBElement<String> value) {
        this.securedPartyGroupNumber = ((JAXBElement<String> ) value);
    }

}
