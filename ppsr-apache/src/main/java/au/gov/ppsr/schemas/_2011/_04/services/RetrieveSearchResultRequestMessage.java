
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchResultRequestTypeType;


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
 *         &lt;element name="RetrieveSearchResultRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchResultRequestType" minOccurs="0"/>
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
    "retrieveSearchResultRequest"
})
@XmlRootElement(name = "RetrieveSearchResultRequestMessage")
public class RetrieveSearchResultRequestMessage {

    @XmlElementRef(name = "RetrieveSearchResultRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchResultRequestTypeType> retrieveSearchResultRequest;

    /**
     * Gets the value of the retrieveSearchResultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchResultRequestTypeType> getRetrieveSearchResultRequest() {
        return retrieveSearchResultRequest;
    }

    /**
     * Sets the value of the retrieveSearchResultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchResultRequest(JAXBElement<RetrieveSearchResultRequestTypeType> value) {
        this.retrieveSearchResultRequest = ((JAXBElement<RetrieveSearchResultRequestTypeType> ) value);
    }

}
