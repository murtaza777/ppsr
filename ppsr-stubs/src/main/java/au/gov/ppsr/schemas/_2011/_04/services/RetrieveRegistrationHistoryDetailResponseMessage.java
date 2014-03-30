
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveRegistrationHistoryDetailResponseTypeType;


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
 *         &lt;element name="RetrieveRegistrationHistoryDetailResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveRegistrationHistoryDetailResponseType" minOccurs="0"/>
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
    "retrieveRegistrationHistoryDetailResponse"
})
@XmlRootElement(name = "RetrieveRegistrationHistoryDetailResponseMessage")
public class RetrieveRegistrationHistoryDetailResponseMessage {

    @XmlElementRef(name = "RetrieveRegistrationHistoryDetailResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType> retrieveRegistrationHistoryDetailResponse;

    /**
     * Gets the value of the retrieveRegistrationHistoryDetailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType> getRetrieveRegistrationHistoryDetailResponse() {
        return retrieveRegistrationHistoryDetailResponse;
    }

    /**
     * Sets the value of the retrieveRegistrationHistoryDetailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveRegistrationHistoryDetailResponse(JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType> value) {
        this.retrieveRegistrationHistoryDetailResponse = ((JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType> ) value);
    }

}
