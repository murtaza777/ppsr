
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.DeleteReportRequestTypeType;


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
 *         &lt;element name="DeleteReportRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}DeleteReportRequestType" minOccurs="0"/>
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
    "deleteReportRequest"
})
@XmlRootElement(name = "DeleteReportRequestMessage")
public class DeleteReportRequestMessage {

    @XmlElementRef(name = "DeleteReportRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<DeleteReportRequestTypeType> deleteReportRequest;

    /**
     * Gets the value of the deleteReportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeleteReportRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<DeleteReportRequestTypeType> getDeleteReportRequest() {
        return deleteReportRequest;
    }

    /**
     * Sets the value of the deleteReportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeleteReportRequestTypeType }{@code >}
     *     
     */
    public void setDeleteReportRequest(JAXBElement<DeleteReportRequestTypeType> value) {
        this.deleteReportRequest = ((JAXBElement<DeleteReportRequestTypeType> ) value);
    }

}
