
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchByRegistrationNumberResponseTypeType;


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
 *         &lt;element name="SearchByRegistrationNumberResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByRegistrationNumberResponseType" minOccurs="0"/>
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
    "searchByRegistrationNumberResponse"
})
@XmlRootElement(name = "SearchByRegistrationNumberResponseMessage")
public class SearchByRegistrationNumberResponseMessage {

    @XmlElementRef(name = "SearchByRegistrationNumberResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchByRegistrationNumberResponseTypeType> searchByRegistrationNumberResponse;

    /**
     * Gets the value of the searchByRegistrationNumberResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchByRegistrationNumberResponseTypeType> getSearchByRegistrationNumberResponse() {
        return searchByRegistrationNumberResponse;
    }

    /**
     * Sets the value of the searchByRegistrationNumberResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberResponseTypeType }{@code >}
     *     
     */
    public void setSearchByRegistrationNumberResponse(JAXBElement<SearchByRegistrationNumberResponseTypeType> value) {
        this.searchByRegistrationNumberResponse = ((JAXBElement<SearchByRegistrationNumberResponseTypeType> ) value);
    }

}
