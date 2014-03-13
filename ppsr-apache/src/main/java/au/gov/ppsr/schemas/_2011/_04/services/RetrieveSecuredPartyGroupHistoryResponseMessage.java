
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSecuredPartyGroupHistoryResponseTypeType;


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
 *         &lt;element name="RetrieveSecuredPartyGroupHistoryResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSecuredPartyGroupHistoryResponseType" minOccurs="0"/>
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
    "retrieveSecuredPartyGroupHistoryResponse"
})
@XmlRootElement(name = "RetrieveSecuredPartyGroupHistoryResponseMessage")
public class RetrieveSecuredPartyGroupHistoryResponseMessage {

    @XmlElementRef(name = "RetrieveSecuredPartyGroupHistoryResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType> retrieveSecuredPartyGroupHistoryResponse;

    /**
     * Gets the value of the retrieveSecuredPartyGroupHistoryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType> getRetrieveSecuredPartyGroupHistoryResponse() {
        return retrieveSecuredPartyGroupHistoryResponse;
    }

    /**
     * Sets the value of the retrieveSecuredPartyGroupHistoryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveSecuredPartyGroupHistoryResponse(JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType> value) {
        this.retrieveSecuredPartyGroupHistoryResponse = ((JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType> ) value);
    }

}
