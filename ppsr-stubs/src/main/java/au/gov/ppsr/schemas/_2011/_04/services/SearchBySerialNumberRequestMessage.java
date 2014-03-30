
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.SearchBySerialNumberRequestTypeType;


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
 *         &lt;element name="SearchBySerialNumberRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberRequestType" minOccurs="0"/>
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
    "searchBySerialNumberRequest"
})
@XmlRootElement(name = "SearchBySerialNumberRequestMessage")
public class SearchBySerialNumberRequestMessage {

    @XmlElementRef(name = "SearchBySerialNumberRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<SearchBySerialNumberRequestTypeType> searchBySerialNumberRequest;

    /**
     * Gets the value of the searchBySerialNumberRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<SearchBySerialNumberRequestTypeType> getSearchBySerialNumberRequest() {
        return searchBySerialNumberRequest;
    }

    /**
     * Sets the value of the searchBySerialNumberRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchBySerialNumberRequestTypeType }{@code >}
     *     
     */
    public void setSearchBySerialNumberRequest(JAXBElement<SearchBySerialNumberRequestTypeType> value) {
        this.searchBySerialNumberRequest = ((JAXBElement<SearchBySerialNumberRequestTypeType> ) value);
    }

}
