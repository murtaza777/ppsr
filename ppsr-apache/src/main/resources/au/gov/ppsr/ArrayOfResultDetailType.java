//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.23 at 05:12:29 PM EST 
//


package au.gov.ppsr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResultDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}ResultDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResultDetail", propOrder = {
    "resultDetail"
})
public class ArrayOfResultDetailType {

    @XmlElement(name = "ResultDetail", nillable = true)
    protected List<ResultDetailType> resultDetail;

    /**
     * Gets the value of the resultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultDetailType }
     * 
     * 
     */
    public List<ResultDetailType> getResultDetail() {
        if (resultDetail == null) {
            resultDetail = new ArrayList<ResultDetailType>();
        }
        return this.resultDetail;
    }

}
