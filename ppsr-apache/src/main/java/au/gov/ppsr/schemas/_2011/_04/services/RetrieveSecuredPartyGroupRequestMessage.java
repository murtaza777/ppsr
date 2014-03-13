
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSecuredPartyGroupRequestTypeType;


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
 *         &lt;element name="RetrieveSecuredPartyGroupRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSecuredPartyGroupRequestType" minOccurs="0"/>
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
    "retrieveSecuredPartyGroupRequest"
})
@XmlRootElement(name = "RetrieveSecuredPartyGroupRequestMessage")
public class RetrieveSecuredPartyGroupRequestMessage {

    @XmlElementRef(name = "RetrieveSecuredPartyGroupRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSecuredPartyGroupRequestTypeType> retrieveSecuredPartyGroupRequest;

    /**
     * Gets the value of the retrieveSecuredPartyGroupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSecuredPartyGroupRequestTypeType> getRetrieveSecuredPartyGroupRequest() {
        return retrieveSecuredPartyGroupRequest;
    }

    /**
     * Sets the value of the retrieveSecuredPartyGroupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSecuredPartyGroupRequest(JAXBElement<RetrieveSecuredPartyGroupRequestTypeType> value) {
        this.retrieveSecuredPartyGroupRequest = ((JAXBElement<RetrieveSecuredPartyGroupRequestTypeType> ) value);
    }

}
