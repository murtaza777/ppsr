
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.FilterGrantorAndEventDateRangeSearchResultRequestTypeType;


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
 *         &lt;element name="FilterGrantorAndEventDateRangeSearchResultRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}FilterGrantorAndEventDateRangeSearchResultRequestType" minOccurs="0"/>
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
    "filterGrantorAndEventDateRangeSearchResultRequest"
})
@XmlRootElement(name = "FilterGrantorAndEventDateRangeSearchResultRequestMessage")
public class FilterGrantorAndEventDateRangeSearchResultRequestMessage {

    @XmlElementRef(name = "FilterGrantorAndEventDateRangeSearchResultRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType> filterGrantorAndEventDateRangeSearchResultRequest;

    /**
     * Gets the value of the filterGrantorAndEventDateRangeSearchResultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType> getFilterGrantorAndEventDateRangeSearchResultRequest() {
        return filterGrantorAndEventDateRangeSearchResultRequest;
    }

    /**
     * Sets the value of the filterGrantorAndEventDateRangeSearchResultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultRequestTypeType }{@code >}
     *     
     */
    public void setFilterGrantorAndEventDateRangeSearchResultRequest(JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType> value) {
        this.filterGrantorAndEventDateRangeSearchResultRequest = ((JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType> ) value);
    }

}
