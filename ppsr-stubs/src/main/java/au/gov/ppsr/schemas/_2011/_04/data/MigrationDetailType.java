
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MigrationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SourceRegister" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationDetail", propOrder = {
    "originalStartDate",
    "sourceRegister"
})
public class MigrationDetailType {

    @XmlElement(name = "OriginalStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalStartDate;
    @XmlElement(name = "SourceRegister", required = true, nillable = true)
    protected String sourceRegister;

    /**
     * Gets the value of the originalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalStartDate() {
        return originalStartDate;
    }

    /**
     * Sets the value of the originalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalStartDate(XMLGregorianCalendar value) {
        this.originalStartDate = value;
    }

    /**
     * Gets the value of the sourceRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRegister() {
        return sourceRegister;
    }

    /**
     * Sets the value of the sourceRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRegister(String value) {
        this.sourceRegister = value;
    }

}
