
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchByGrantorAndEventDateRangeRequestTypeType;


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
 *         &lt;element name="SearchByGrantorAndEventDateRangeRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorAndEventDateRangeRequestType" minOccurs="0"/>
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
    "searchByGrantorAndEventDateRangeRequest"
})
@XmlRootElement(name = "SearchByGrantorAndEventDateRangeRequestMessage")
public class SearchByGrantorAndEventDateRangeRequestMessage {

    @XmlElementRef(name = "SearchByGrantorAndEventDateRangeRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType> searchByGrantorAndEventDateRangeRequest;

    /**
     * Gets the value of the searchByGrantorAndEventDateRangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType> getSearchByGrantorAndEventDateRangeRequest() {
        return searchByGrantorAndEventDateRangeRequest;
    }

    /**
     * Sets the value of the searchByGrantorAndEventDateRangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeRequestTypeType }{@code >}
     *     
     */
    public void setSearchByGrantorAndEventDateRangeRequest(JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType> value) {
        this.searchByGrantorAndEventDateRangeRequest = ((JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType> ) value);
    }

}
