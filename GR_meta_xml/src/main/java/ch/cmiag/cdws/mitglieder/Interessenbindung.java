//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:19:02 PM CET 
//


package ch.cmiag.cdws.mitglieder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interessenbindung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interessenbindung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.cmiag.ch/cdws/Mitglieder}MultiLangTextFieldType"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Funktion" type="{http://www.cmiag.ch/cdws/Mitglieder}MultiLangTextFieldType"/>
 *         &lt;element name="Gremium" type="{http://www.cmiag.ch/cdws/Mitglieder}MultiLangTextFieldType"/>
 *         &lt;element name="Dauer" type="{http://www.cmiag.ch/cdws/Mitglieder}DateTimeFieldType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OBJ_GUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interessenbindung", propOrder = {
    "type",
    "name",
    "funktion",
    "gremium",
    "dauer"
})
public class Interessenbindung {

    @XmlElement(name = "Type", required = true)
    protected MultiLangTextFieldType type;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Funktion", required = true)
    protected MultiLangTextFieldType funktion;
    @XmlElement(name = "Gremium", required = true)
    protected MultiLangTextFieldType gremium;
    @XmlElement(name = "Dauer", required = true)
    protected DateTimeFieldType dauer;
    @XmlAttribute(name = "OBJ_GUID", required = true)
    protected String objguid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setType(MultiLangTextFieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the funktion property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getFunktion() {
        return funktion;
    }

    /**
     * Sets the value of the funktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setFunktion(MultiLangTextFieldType value) {
        this.funktion = value;
    }

    /**
     * Gets the value of the gremium property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getGremium() {
        return gremium;
    }

    /**
     * Sets the value of the gremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setGremium(MultiLangTextFieldType value) {
        this.gremium = value;
    }

    /**
     * Gets the value of the dauer property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFieldType }
     *     
     */
    public DateTimeFieldType getDauer() {
        return dauer;
    }

    /**
     * Sets the value of the dauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFieldType }
     *     
     */
    public void setDauer(DateTimeFieldType value) {
        this.dauer = value;
    }

    /**
     * Gets the value of the objguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJGUID() {
        return objguid;
    }

    /**
     * Sets the value of the objguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJGUID(String value) {
        this.objguid = value;
    }

}
