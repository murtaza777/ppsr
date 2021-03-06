
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantorOrganisationWithVerificationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantorOrganisationWithVerificationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganisationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganisationNumberType" type="{http://schemas.ppsr.gov.au/2011/04/data}OrganisationNumberType" minOccurs="0"/>
 *         &lt;element name="OrganisationNumberVerificationStatus" type="{http://schemas.ppsr.gov.au/2011/04/data}IdentifierVerificationStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantorOrganisationWithVerificationStatus", propOrder = {
    "organisationName",
    "organisationNumber",
    "organisationNumberType",
    "organisationNumberVerificationStatus"
})
public class GrantorOrganisationWithVerificationStatusType {

    @XmlElementRef(name = "OrganisationName", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> organisationName;
    @XmlElementRef(name = "OrganisationNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> organisationNumber;
    @XmlElementRef(name = "OrganisationNumberType", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<OrganisationNumberTypeType> organisationNumberType;
    @XmlElementRef(name = "OrganisationNumberVerificationStatus", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<IdentifierVerificationStatusTypeType> organisationNumberVerificationStatus;

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationName(JAXBElement<String> value) {
        this.organisationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationNumber() {
        return organisationNumber;
    }

    /**
     * Sets the value of the organisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationNumber(JAXBElement<String> value) {
        this.organisationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organisationNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}
     *     
     */
    public JAXBElement<OrganisationNumberTypeType> getOrganisationNumberType() {
        return organisationNumberType;
    }

    /**
     * Sets the value of the organisationNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}
     *     
     */
    public void setOrganisationNumberType(JAXBElement<OrganisationNumberTypeType> value) {
        this.organisationNumberType = ((JAXBElement<OrganisationNumberTypeType> ) value);
    }

    /**
     * Gets the value of the organisationNumberVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierVerificationStatusTypeType }{@code >}
     *     
     */
    public JAXBElement<IdentifierVerificationStatusTypeType> getOrganisationNumberVerificationStatus() {
        return organisationNumberVerificationStatus;
    }

    /**
     * Sets the value of the organisationNumberVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierVerificationStatusTypeType }{@code >}
     *     
     */
    public void setOrganisationNumberVerificationStatus(JAXBElement<IdentifierVerificationStatusTypeType> value) {
        this.organisationNumberVerificationStatus = ((JAXBElement<IdentifierVerificationStatusTypeType> ) value);
    }

}
