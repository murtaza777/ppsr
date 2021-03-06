
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSecuredPartyGroupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSecuredPartyGroupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReverifySecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfReverifySecuredParty" minOccurs="0"/>
 *         &lt;element name="SecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecuredPartyGroupVersionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdatedAddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}UpdatedAddressForService" minOccurs="0"/>
 *         &lt;element name="UpdatedSecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfUpdatedSecuredParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSecuredPartyGroupRequestType", propOrder = {
    "reverifySecuredParties",
    "securedPartyGroupAccessCode",
    "securedPartyGroupNumber",
    "securedPartyGroupVersionId",
    "updatedAddressForService",
    "updatedSecuredParties"
})
public class UpdateSecuredPartyGroupRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElementRef(name = "ReverifySecuredParties", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfReverifySecuredPartyType> reverifySecuredParties;
    @XmlElement(name = "SecuredPartyGroupAccessCode", required = true, nillable = true)
    protected String securedPartyGroupAccessCode;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;
    @XmlElement(name = "SecuredPartyGroupVersionId", required = true, nillable = true)
    protected String securedPartyGroupVersionId;
    @XmlElementRef(name = "UpdatedAddressForService", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<UpdatedAddressForServiceType> updatedAddressForService;
    @XmlElementRef(name = "UpdatedSecuredParties", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUpdatedSecuredPartyType> updatedSecuredParties;

    /**
     * Gets the value of the reverifySecuredParties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReverifySecuredPartyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReverifySecuredPartyType> getReverifySecuredParties() {
        return reverifySecuredParties;
    }

    /**
     * Sets the value of the reverifySecuredParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReverifySecuredPartyType }{@code >}
     *     
     */
    public void setReverifySecuredParties(JAXBElement<ArrayOfReverifySecuredPartyType> value) {
        this.reverifySecuredParties = ((JAXBElement<ArrayOfReverifySecuredPartyType> ) value);
    }

    /**
     * Gets the value of the securedPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupAccessCode() {
        return securedPartyGroupAccessCode;
    }

    /**
     * Sets the value of the securedPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupAccessCode(String value) {
        this.securedPartyGroupAccessCode = value;
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

    /**
     * Gets the value of the securedPartyGroupVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupVersionId() {
        return securedPartyGroupVersionId;
    }

    /**
     * Sets the value of the securedPartyGroupVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupVersionId(String value) {
        this.securedPartyGroupVersionId = value;
    }

    /**
     * Gets the value of the updatedAddressForService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdatedAddressForServiceType }{@code >}
     *     
     */
    public JAXBElement<UpdatedAddressForServiceType> getUpdatedAddressForService() {
        return updatedAddressForService;
    }

    /**
     * Sets the value of the updatedAddressForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdatedAddressForServiceType }{@code >}
     *     
     */
    public void setUpdatedAddressForService(JAXBElement<UpdatedAddressForServiceType> value) {
        this.updatedAddressForService = ((JAXBElement<UpdatedAddressForServiceType> ) value);
    }

    /**
     * Gets the value of the updatedSecuredParties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatedSecuredPartyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdatedSecuredPartyType> getUpdatedSecuredParties() {
        return updatedSecuredParties;
    }

    /**
     * Sets the value of the updatedSecuredParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatedSecuredPartyType }{@code >}
     *     
     */
    public void setUpdatedSecuredParties(JAXBElement<ArrayOfUpdatedSecuredPartyType> value) {
        this.updatedSecuredParties = ((JAXBElement<ArrayOfUpdatedSecuredPartyType> ) value);
    }

}
