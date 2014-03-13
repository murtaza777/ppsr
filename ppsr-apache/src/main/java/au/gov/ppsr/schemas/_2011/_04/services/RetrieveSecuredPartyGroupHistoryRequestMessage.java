
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSecuredPartyGroupHistoryRequestTypeType;


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
 *         &lt;element name="RetrieveSecuredPartyGroupHistoryRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSecuredPartyGroupHistoryRequestType" minOccurs="0"/>
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
    "retrieveSecuredPartyGroupHistoryRequest"
})
@XmlRootElement(name = "RetrieveSecuredPartyGroupHistoryRequestMessage")
public class RetrieveSecuredPartyGroupHistoryRequestMessage {

    @XmlElementRef(name = "RetrieveSecuredPartyGroupHistoryRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType> retrieveSecuredPartyGroupHistoryRequest;

    /**
     * Gets the value of the retrieveSecuredPartyGroupHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType> getRetrieveSecuredPartyGroupHistoryRequest() {
        return retrieveSecuredPartyGroupHistoryRequest;
    }

    /**
     * Sets the value of the retrieveSecuredPartyGroupHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSecuredPartyGroupHistoryRequest(JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType> value) {
        this.retrieveSecuredPartyGroupHistoryRequest = ((JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType> ) value);
    }

}
