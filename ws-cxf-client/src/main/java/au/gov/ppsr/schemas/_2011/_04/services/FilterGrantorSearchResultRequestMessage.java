
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.FilterGrantorSearchResultRequestTypeType;


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
 *         &lt;element name="FilterGrantorSearchResultRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}FilterGrantorSearchResultRequestType" minOccurs="0"/>
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
    "filterGrantorSearchResultRequest"
})
@XmlRootElement(name = "FilterGrantorSearchResultRequestMessage")
public class FilterGrantorSearchResultRequestMessage {

    @XmlElementRef(name = "FilterGrantorSearchResultRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<FilterGrantorSearchResultRequestTypeType> filterGrantorSearchResultRequest;

    /**
     * Gets the value of the filterGrantorSearchResultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorSearchResultRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<FilterGrantorSearchResultRequestTypeType> getFilterGrantorSearchResultRequest() {
        return filterGrantorSearchResultRequest;
    }

    /**
     * Sets the value of the filterGrantorSearchResultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterGrantorSearchResultRequestTypeType }{@code >}
     *     
     */
    public void setFilterGrantorSearchResultRequest(JAXBElement<FilterGrantorSearchResultRequestTypeType> value) {
        this.filterGrantorSearchResultRequest = ((JAXBElement<FilterGrantorSearchResultRequestTypeType> ) value);
    }

}
