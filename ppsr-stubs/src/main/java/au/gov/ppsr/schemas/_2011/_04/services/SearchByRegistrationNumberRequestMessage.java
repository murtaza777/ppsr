
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchByRegistrationNumberRequestTypeType;


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
 *         &lt;element name="SearchByRegistrationNumberRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByRegistrationNumberRequestType" minOccurs="0"/>
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
    "searchByRegistrationNumberRequest"
})
@XmlRootElement(name = "SearchByRegistrationNumberRequestMessage")
public class SearchByRegistrationNumberRequestMessage {

    @XmlElementRef(name = "SearchByRegistrationNumberRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchByRegistrationNumberRequestTypeType> searchByRegistrationNumberRequest;

    /**
     * Gets the value of the searchByRegistrationNumberRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchByRegistrationNumberRequestTypeType> getSearchByRegistrationNumberRequest() {
        return searchByRegistrationNumberRequest;
    }

    /**
     * Sets the value of the searchByRegistrationNumberRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberRequestTypeType }{@code >}
     *     
     */
    public void setSearchByRegistrationNumberRequest(JAXBElement<SearchByRegistrationNumberRequestTypeType> value) {
        this.searchByRegistrationNumberRequest = ((JAXBElement<SearchByRegistrationNumberRequestTypeType> ) value);
    }

}
