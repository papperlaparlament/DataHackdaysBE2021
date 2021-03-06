//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:17:21 PM CET 
//


package ch.cmiag.cdws.dokumente;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dokument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dokument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dokument" type="{http://www.cmiag.ch/cdws/Dokumente}DocumentFieldType"/>
 *         &lt;element name="Titel" type="{http://www.cmiag.ch/cdws/Dokumente}MultiLangTextFieldType"/>
 *         &lt;element name="Geschaeftstitel" type="{http://www.cmiag.ch/cdws/Dokumente}MultiLangTextFieldType"/>
 *         &lt;element name="Datum" type="{http://www.cmiag.ch/cdws/Dokumente}DateTimeFieldType"/>
 *         &lt;element name="Dokumententyp" type="{http://www.cmiag.ch/cdws/Dokumente}MultiLangTextFieldType"/>
 *         &lt;element name="DokumentSortKey" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SprachePublikation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OBJ_GUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IDX" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dokument", propOrder = {
    "dokument",
    "titel",
    "geschaeftstitel",
    "datum",
    "dokumententyp",
    "dokumentSortKey",
    "sprachePublikation"
})
public class Dokument {

    @XmlElement(name = "Dokument", required = true)
    protected DocumentFieldType dokument;
    @XmlElement(name = "Titel", required = true)
    protected MultiLangTextFieldType titel;
    @XmlElement(name = "Geschaeftstitel", required = true)
    protected MultiLangTextFieldType geschaeftstitel;
    @XmlElement(name = "Datum", required = true)
    protected DateTimeFieldType datum;
    @XmlElement(name = "Dokumententyp", required = true)
    protected MultiLangTextFieldType dokumententyp;
    @XmlElement(name = "DokumentSortKey", required = true, nillable = true)
    protected BigDecimal dokumentSortKey;
    @XmlElement(name = "SprachePublikation", required = true)
    protected String sprachePublikation;
    @XmlAttribute(name = "OBJ_GUID", required = true)
    protected String objguid;
    @XmlAttribute(name = "SEQ")
    protected String seq;
    @XmlAttribute(name = "IDX")
    protected String idx;

    /**
     * Gets the value of the dokument property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFieldType }
     *     
     */
    public DocumentFieldType getDokument() {
        return dokument;
    }

    /**
     * Sets the value of the dokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFieldType }
     *     
     */
    public void setDokument(DocumentFieldType value) {
        this.dokument = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setTitel(MultiLangTextFieldType value) {
        this.titel = value;
    }

    /**
     * Gets the value of the geschaeftstitel property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getGeschaeftstitel() {
        return geschaeftstitel;
    }

    /**
     * Sets the value of the geschaeftstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setGeschaeftstitel(MultiLangTextFieldType value) {
        this.geschaeftstitel = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFieldType }
     *     
     */
    public DateTimeFieldType getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFieldType }
     *     
     */
    public void setDatum(DateTimeFieldType value) {
        this.datum = value;
    }

    /**
     * Gets the value of the dokumententyp property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getDokumententyp() {
        return dokumententyp;
    }

    /**
     * Sets the value of the dokumententyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setDokumententyp(MultiLangTextFieldType value) {
        this.dokumententyp = value;
    }

    /**
     * Gets the value of the dokumentSortKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDokumentSortKey() {
        return dokumentSortKey;
    }

    /**
     * Sets the value of the dokumentSortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDokumentSortKey(BigDecimal value) {
        this.dokumentSortKey = value;
    }

    /**
     * Gets the value of the sprachePublikation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprachePublikation() {
        return sprachePublikation;
    }

    /**
     * Sets the value of the sprachePublikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprachePublikation(String value) {
        this.sprachePublikation = value;
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

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQ() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQ(String value) {
        this.seq = value;
    }

    /**
     * Gets the value of the idx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDX() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDX(String value) {
        this.idx = value;
    }

}
