
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewSecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Individual" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredPartyIndividual" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://schemas.ppsr.gov.au/2011/04/data}NewAddress"/>
 *         &lt;element name="NewSecuredPartySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Organisation" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredPartyOrganisation" minOccurs="0"/>
 *         &lt;element name="SecuredPartyType" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredPartyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewSecuredParty", propOrder = {
    "contactName",
    "contactPhone",
    "emailAddress",
    "individual",
    "mailingAddress",
    "newSecuredPartySequenceNumber",
    "organisation",
    "securedPartyType"
})
public class NewSecuredPartyType {

    @XmlElement(name = "ContactName", required = true, nillable = true)
    protected String contactName;
    @XmlElement(name = "ContactPhone", required = true, nillable = true)
    protected String contactPhone;
    @XmlElementRef(name = "EmailAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "Individual", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SecuredPartyIndividualType> individual;
    @XmlElement(name = "MailingAddress", required = true, nillable = true)
    protected NewAddressType mailingAddress;
    @XmlElement(name = "NewSecuredPartySequenceNumber")
    protected short newSecuredPartySequenceNumber;
    @XmlElementRef(name = "Organisation", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SecuredPartyOrganisationType> organisation;
    @XmlElement(name = "SecuredPartyType", required = true)
    protected SecuredPartyTypeType securedPartyType;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}
     *     
     */
    public JAXBElement<SecuredPartyIndividualType> getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}
     *     
     */
    public void setIndividual(JAXBElement<SecuredPartyIndividualType> value) {
        this.individual = ((JAXBElement<SecuredPartyIndividualType> ) value);
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link NewAddressType }
     *     
     */
    public NewAddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAddressType }
     *     
     */
    public void setMailingAddress(NewAddressType value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the newSecuredPartySequenceNumber property.
     * 
     */
    public short getNewSecuredPartySequenceNumber() {
        return newSecuredPartySequenceNumber;
    }

    /**
     * Sets the value of the newSecuredPartySequenceNumber property.
     * 
     */
    public void setNewSecuredPartySequenceNumber(short value) {
        this.newSecuredPartySequenceNumber = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}
     *     
     */
    public JAXBElement<SecuredPartyOrganisationType> getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}
     *     
     */
    public void setOrganisation(JAXBElement<SecuredPartyOrganisationType> value) {
        this.organisation = ((JAXBElement<SecuredPartyOrganisationType> ) value);
    }

    /**
     * Gets the value of the securedPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredPartyTypeType }
     *     
     */
    public SecuredPartyTypeType getSecuredPartyType() {
        return securedPartyType;
    }

    /**
     * Sets the value of the securedPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredPartyTypeType }
     *     
     */
    public void setSecuredPartyType(SecuredPartyTypeType value) {
        this.securedPartyType = value;
    }

}
