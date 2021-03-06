
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReverifySecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverifySecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganisationNumberType" type="{http://schemas.ppsr.gov.au/2011/04/data}OrganisationNumberType"/>
 *         &lt;element name="ReverifySecuredPartySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverifySecuredParty", propOrder = {
    "organisationNumber",
    "organisationNumberType",
    "reverifySecuredPartySequenceNumber"
})
public class ReverifySecuredPartyType {

    @XmlElement(name = "OrganisationNumber", required = true, nillable = true)
    protected String organisationNumber;
    @XmlElement(name = "OrganisationNumberType", required = true)
    protected OrganisationNumberTypeType organisationNumberType;
    @XmlElement(name = "ReverifySecuredPartySequenceNumber")
    protected short reverifySecuredPartySequenceNumber;

    /**
     * Gets the value of the organisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNumber() {
        return organisationNumber;
    }

    /**
     * Sets the value of the organisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNumber(String value) {
        this.organisationNumber = value;
    }

    /**
     * Gets the value of the organisationNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationNumberTypeType }
     *     
     */
    public OrganisationNumberTypeType getOrganisationNumberType() {
        return organisationNumberType;
    }

    /**
     * Sets the value of the organisationNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationNumberTypeType }
     *     
     */
    public void setOrganisationNumberType(OrganisationNumberTypeType value) {
        this.organisationNumberType = value;
    }

    /**
     * Gets the value of the reverifySecuredPartySequenceNumber property.
     * 
     */
    public short getReverifySecuredPartySequenceNumber() {
        return reverifySecuredPartySequenceNumber;
    }

    /**
     * Sets the value of the reverifySecuredPartySequenceNumber property.
     * 
     */
    public void setReverifySecuredPartySequenceNumber(short value) {
        this.reverifySecuredPartySequenceNumber = value;
    }

}
