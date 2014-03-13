
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.CreateSecuredPartyGroupRequestTypeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateSecuredPartyGroupRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}CreateSecuredPartyGroupRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createSecuredPartyGroupRequest"
})
@XmlRootElement(name = "CreateSecuredPartyGroupRequestMessage")
public class CreateSecuredPartyGroupRequestMessage {

    @XmlElementRef(name = "CreateSecuredPartyGroupRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<CreateSecuredPartyGroupRequestTypeType> createSecuredPartyGroupRequest;

    /**
     * Gets the value of the createSecuredPartyGroupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<CreateSecuredPartyGroupRequestTypeType> getCreateSecuredPartyGroupRequest() {
        return createSecuredPartyGroupRequest;
    }

    /**
     * Sets the value of the createSecuredPartyGroupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public void setCreateSecuredPartyGroupRequest(JAXBElement<CreateSecuredPartyGroupRequestTypeType> value) {
        this.createSecuredPartyGroupRequest = ((JAXBElement<CreateSecuredPartyGroupRequestTypeType> ) value);
    }

}
