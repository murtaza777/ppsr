
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchBySerialNumberSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBySerialNumberSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NevdisData" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisData" minOccurs="0"/>
 *         &lt;element name="ResultDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfResultDetail" minOccurs="0"/>
 *         &lt;element name="SearchResultRetrievedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransitionalPeriodMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBySerialNumberSearchResult", propOrder = {
    "nevdisData",
    "resultDetails",
    "searchResultRetrievedDateTime",
    "transitionalPeriodMessage"
})
public class SearchBySerialNumberSearchResultType {

    @XmlElementRef(name = "NevdisData", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<NevdisDataType> nevdisData;
    @XmlElementRef(name = "ResultDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfResultDetailType> resultDetails;
    @XmlElement(name = "SearchResultRetrievedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchResultRetrievedDateTime;
    @XmlElementRef(name = "TransitionalPeriodMessage", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> transitionalPeriodMessage;

    /**
     * Gets the value of the nevdisData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NevdisDataType }{@code >}
     *     
     */
    public JAXBElement<NevdisDataType> getNevdisData() {
        return nevdisData;
    }

    /**
     * Sets the value of the nevdisData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NevdisDataType }{@code >}
     *     
     */
    public void setNevdisData(JAXBElement<NevdisDataType> value) {
        this.nevdisData = ((JAXBElement<NevdisDataType> ) value);
    }

    /**
     * Gets the value of the resultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResultDetailType> getResultDetails() {
        return resultDetails;
    }

    /**
     * Sets the value of the resultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}
     *     
     */
    public void setResultDetails(JAXBElement<ArrayOfResultDetailType> value) {
        this.resultDetails = ((JAXBElement<ArrayOfResultDetailType> ) value);
    }

    /**
     * Gets the value of the searchResultRetrievedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchResultRetrievedDateTime() {
        return searchResultRetrievedDateTime;
    }

    /**
     * Sets the value of the searchResultRetrievedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchResultRetrievedDateTime(XMLGregorianCalendar value) {
        this.searchResultRetrievedDateTime = value;
    }

    /**
     * Gets the value of the transitionalPeriodMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransitionalPeriodMessage() {
        return transitionalPeriodMessage;
    }

    /**
     * Sets the value of the transitionalPeriodMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransitionalPeriodMessage(JAXBElement<String> value) {
        this.transitionalPeriodMessage = ((JAXBElement<String> ) value);
    }

}
