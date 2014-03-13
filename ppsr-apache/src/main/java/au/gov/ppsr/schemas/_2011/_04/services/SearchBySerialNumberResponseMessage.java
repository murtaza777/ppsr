
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchBySerialNumberResponseTypeType;


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
 *         &lt;element name="SearchBySerialNumberResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberResponseType" minOccurs="0"/>
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
    "searchBySerialNumberResponse"
})
@XmlRootElement(name = "SearchBySerialNumberResponseMessage")
public class SearchBySerialNumberResponseMessage {

    @XmlElementRef(name = "SearchBySerialNumberResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchBySerialNumberResponseTypeType> searchBySerialNumberResponse;

    /**
     * Gets the value of the searchBySerialNumberResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchBySerialNumberResponseTypeType> getSearchBySerialNumberResponse() {
        return searchBySerialNumberResponse;
    }

    /**
     * Sets the value of the searchBySerialNumberResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberResponseTypeType }{@code >}
     *     
     */
    public void setSearchBySerialNumberResponse(JAXBElement<SearchBySerialNumberResponseTypeType> value) {
        this.searchBySerialNumberResponse = ((JAXBElement<SearchBySerialNumberResponseTypeType> ) value);
    }

}
