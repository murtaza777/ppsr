
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchResultResponseTypeType;


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
 *         &lt;element name="RetrieveSearchResultResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchResultResponseType" minOccurs="0"/>
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
    "retrieveSearchResultResponse"
})
@XmlRootElement(name = "RetrieveSearchResultResponseMessage")
public class RetrieveSearchResultResponseMessage {

    @XmlElementRef(name = "RetrieveSearchResultResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchResultResponseTypeType> retrieveSearchResultResponse;

    /**
     * Gets the value of the retrieveSearchResultResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchResultResponseTypeType> getRetrieveSearchResultResponse() {
        return retrieveSearchResultResponse;
    }

    /**
     * Sets the value of the retrieveSearchResultResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchResultResponse(JAXBElement<RetrieveSearchResultResponseTypeType> value) {
        this.retrieveSearchResultResponse = ((JAXBElement<RetrieveSearchResultResponseTypeType> ) value);
    }

}
