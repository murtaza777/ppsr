
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveRegistrationHistoryDetailRequestTypeType;


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
 *         &lt;element name="RetrieveRegistrationHistoryDetailRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveRegistrationHistoryDetailRequestType" minOccurs="0"/>
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
    "retrieveRegistrationHistoryDetailRequest"
})
@XmlRootElement(name = "RetrieveRegistrationHistoryDetailRequestMessage")
public class RetrieveRegistrationHistoryDetailRequestMessage {

    @XmlElementRef(name = "RetrieveRegistrationHistoryDetailRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType> retrieveRegistrationHistoryDetailRequest;

    /**
     * Gets the value of the retrieveRegistrationHistoryDetailRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType> getRetrieveRegistrationHistoryDetailRequest() {
        return retrieveRegistrationHistoryDetailRequest;
    }

    /**
     * Sets the value of the retrieveRegistrationHistoryDetailRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveRegistrationHistoryDetailRequest(JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType> value) {
        this.retrieveRegistrationHistoryDetailRequest = ((JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType> ) value);
    }

}
