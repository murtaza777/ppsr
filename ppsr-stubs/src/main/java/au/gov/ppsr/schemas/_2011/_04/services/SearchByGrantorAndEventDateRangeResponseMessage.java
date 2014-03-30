
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchByGrantorAndEventDateRangeResponseTypeType;


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
 *         &lt;element name="SearchByGrantorAndEventDateRangeResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorAndEventDateRangeResponseType" minOccurs="0"/>
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
    "searchByGrantorAndEventDateRangeResponse"
})
@XmlRootElement(name = "SearchByGrantorAndEventDateRangeResponseMessage")
public class SearchByGrantorAndEventDateRangeResponseMessage {

    @XmlElementRef(name = "SearchByGrantorAndEventDateRangeResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType> searchByGrantorAndEventDateRangeResponse;

    /**
     * Gets the value of the searchByGrantorAndEventDateRangeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType> getSearchByGrantorAndEventDateRangeResponse() {
        return searchByGrantorAndEventDateRangeResponse;
    }

    /**
     * Sets the value of the searchByGrantorAndEventDateRangeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeResponseTypeType }{@code >}
     *     
     */
    public void setSearchByGrantorAndEventDateRangeResponse(JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType> value) {
        this.searchByGrantorAndEventDateRangeResponse = ((JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType> ) value);
    }

}
