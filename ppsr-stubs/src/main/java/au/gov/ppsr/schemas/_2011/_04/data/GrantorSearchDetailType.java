
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantorSearchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantorSearchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrantorType" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorType"/>
 *         &lt;element name="Individual" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorIndividualSearchDetail" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorOrganisation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantorSearchDetail", propOrder = {
    "grantorType",
    "individual",
    "organisation"
})
public class GrantorSearchDetailType {

    @XmlElement(name = "GrantorType", required = true)
    protected GrantorTypeType grantorType;
    @XmlElementRef(name = "Individual", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorIndividualSearchDetailType> individual;
    @XmlElementRef(name = "Organisation", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorOrganisationType> organisation;

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
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchDetailType }{@code >}
     *     
     */
    public JAXBElement<GrantorIndividualSearchDetailType> getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchDetailType }{@code >}
     *     
     */
    public void setIndividual(JAXBElement<GrantorIndividualSearchDetailType> value) {
        this.individual = ((JAXBElement<GrantorIndividualSearchDetailType> ) value);
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}
     *     
     */
    public JAXBElement<GrantorOrganisationType> getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}
     *     
     */
    public void setOrganisation(JAXBElement<GrantorOrganisationType> value) {
        this.organisation = ((JAXBElement<GrantorOrganisationType> ) value);
    }

}
