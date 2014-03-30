
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.UpdateSecuredPartyGroupRequestTypeType;


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
 *         &lt;element name="UpdateSecuredPartyGroupRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}UpdateSecuredPartyGroupRequestType" minOccurs="0"/>
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
    "updateSecuredPartyGroupRequest"
})
@XmlRootElement(name = "UpdateSecuredPartyGroupRequestMessage")
public class UpdateSecuredPartyGroupRequestMessage {

    @XmlElementRef(name = "UpdateSecuredPartyGroupRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<UpdateSecuredPartyGroupRequestTypeType> updateSecuredPartyGroupRequest;

    /**
     * Gets the value of the updateSecuredPartyGroupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<UpdateSecuredPartyGroupRequestTypeType> getUpdateSecuredPartyGroupRequest() {
        return updateSecuredPartyGroupRequest;
    }

    /**
     * Sets the value of the updateSecuredPartyGroupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public void setUpdateSecuredPartyGroupRequest(JAXBElement<UpdateSecuredPartyGroupRequestTypeType> value) {
        this.updateSecuredPartyGroupRequest = ((JAXBElement<UpdateSecuredPartyGroupRequestTypeType> ) value);
    }

}
