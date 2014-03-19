
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchCertificateResponseTypeType;


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
 *         &lt;element name="RetrieveSearchCertificateResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchCertificateResponseType" minOccurs="0"/>
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
    "retrieveSearchCertificateResponse"
})
@XmlRootElement(name = "RetrieveSearchCertificateResponseMessage")
public class RetrieveSearchCertificateResponseMessage {

    @XmlElementRef(name = "RetrieveSearchCertificateResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchCertificateResponseTypeType> retrieveSearchCertificateResponse;

    /**
     * Gets the value of the retrieveSearchCertificateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchCertificateResponseTypeType> getRetrieveSearchCertificateResponse() {
        return retrieveSearchCertificateResponse;
    }

    /**
     * Sets the value of the retrieveSearchCertificateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchCertificateResponse(JAXBElement<RetrieveSearchCertificateResponseTypeType> value) {
        this.retrieveSearchCertificateResponse = ((JAXBElement<RetrieveSearchCertificateResponseTypeType> ) value);
    }

}
