
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralRegistrationSecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralRegistrationSecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Individual" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredPartyIndividual" minOccurs="0"/>
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
@XmlType(name = "CollateralRegistrationSecuredParty", propOrder = {
    "individual",
    "organisation",
    "securedPartyType"
})
public class CollateralRegistrationSecuredPartyType {

    @XmlElementRef(name = "Individual", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SecuredPartyIndividualType> individual;
    @XmlElementRef(name = "Organisation", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SecuredPartyOrganisationType> organisation;
    @XmlElement(name = "SecuredPartyType", required = true)
    protected SecuredPartyTypeType securedPartyType;

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
