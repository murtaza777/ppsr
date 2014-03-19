
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.DeleteReportResponseTypeType;


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
 *         &lt;element name="DeleteReportResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}DeleteReportResponseType" minOccurs="0"/>
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
    "deleteReportResponse"
})
@XmlRootElement(name = "DeleteReportResponseMessage")
public class DeleteReportResponseMessage {

    @XmlElementRef(name = "DeleteReportResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<DeleteReportResponseTypeType> deleteReportResponse;

    /**
     * Gets the value of the deleteReportResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeleteReportResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<DeleteReportResponseTypeType> getDeleteReportResponse() {
        return deleteReportResponse;
    }

    /**
     * Sets the value of the deleteReportResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeleteReportResponseTypeType }{@code >}
     *     
     */
    public void setDeleteReportResponse(JAXBElement<DeleteReportResponseTypeType> value) {
        this.deleteReportResponse = ((JAXBElement<DeleteReportResponseTypeType> ) value);
    }

}
