//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:17:21 PM CET 
//


package ch.cmiag.cdws.dokumente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Extension" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Ansicht" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenditionType")
public class RenditionType {

    @XmlAttribute(name = "Extension", required = true)
    protected String extension;
    @XmlAttribute(name = "Ansicht", required = true)
    protected String ansicht;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the ansicht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsicht() {
        return ansicht;
    }

    /**
     * Sets the value of the ansicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsicht(String value) {
        this.ansicht = value;
    }

}
