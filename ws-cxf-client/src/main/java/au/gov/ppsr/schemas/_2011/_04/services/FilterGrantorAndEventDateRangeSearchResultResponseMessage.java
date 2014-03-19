
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.FilterGrantorAndEventDateRangeSearchResultResponseTypeType;


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
 *         &lt;element name="FilterGrantorAndEventDateRangeSearchResultResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}FilterGrantorAndEventDateRangeSearchResultResponseType" minOccurs="0"/>
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
    "filterGrantorAndEventDateRangeSearchResultResponse"
})
@XmlRootElement(name = "FilterGrantorAndEventDateRangeSearchResultResponseMessage")
public class FilterGrantorAndEventDateRangeSearchResultResponseMessage {

    @XmlElementRef(name = "FilterGrantorAndEventDateRangeSearchResultResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType> filterGrantorAndEventDateRangeSearchResultResponse;

    /**
     * Gets the value of the filterGrantorAndEventDateRangeSearchResultResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType> getFilterGrantorAndEventDateRangeSearchResultResponse() {
        return filterGrantorAndEventDateRangeSearchResultResponse;
    }

    /**
     * Sets the value of the filterGrantorAndEventDateRangeSearchResultResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultResponseTypeType }{@code >}
     *     
     */
    public void setFilterGrantorAndEventDateRangeSearchResultResponse(JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType> value) {
        this.filterGrantorAndEventDateRangeSearchResultResponse = ((JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType> ) value);
    }

}
