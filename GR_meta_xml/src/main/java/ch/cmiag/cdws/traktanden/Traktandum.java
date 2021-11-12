//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:19:37 PM CET 
//


package ch.cmiag.cdws.traktanden;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Traktandum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Traktandum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gremium">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="Sitzung" type="{http://www.cmiag.ch/cdws/Traktanden}Gremium"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sitzung">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="Sitzung" type="{http://www.cmiag.ch/cdws/Traktanden}Sitzung"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Unterlagen">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Unterlage" type="{http://www.cmiag.ch/cdws/Traktanden}Unterlage"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Geschaeft">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="Geschaeft" type="{http://www.cmiag.ch/cdws/Traktanden}Geschaeft"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ja" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Nein" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Enthaltungen" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GRBeschluss" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Traktandierungscode" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Beschlussdetail" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="AntragRR" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Traktandierungsvermerk" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Protokollvermerk" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Datum" type="{http://www.cmiag.ch/cdws/Traktanden}DateTimeFieldType"/>
 *         &lt;element name="Antragsdetail" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Traktandentitel" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="Traktandennummer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BeschlussRR" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
 *         &lt;element name="BeschlussdetailRR" type="{http://www.cmiag.ch/cdws/Traktanden}MultiLangTextFieldType"/>
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
@XmlType(name = "Traktandum", propOrder = {
    "gremium",
    "sitzung",
    "unterlagen",
    "geschaeft",
    "ja",
    "nein",
    "enthaltungen",
    "grBeschluss",
    "traktandierungscode",
    "beschlussdetail",
    "antragRR",
    "traktandierungsvermerk",
    "protokollvermerk",
    "datum",
    "antragsdetail",
    "traktandentitel",
    "traktandennummer",
    "beschlussRR",
    "beschlussdetailRR"
})
public class Traktandum {

    @XmlElement(name = "Gremium", required = true)
    protected Traktandum.Gremium gremium;
    @XmlElement(name = "Sitzung", required = true)
    protected Traktandum.Sitzung sitzung;
    @XmlElement(name = "Unterlagen", required = true)
    protected Traktandum.Unterlagen unterlagen;
    @XmlElement(name = "Geschaeft", required = true)
    protected Traktandum.Geschaeft geschaeft;
    @XmlElement(name = "Ja", required = true, nillable = true)
    protected BigDecimal ja;
    @XmlElement(name = "Nein", required = true, nillable = true)
    protected BigDecimal nein;
    @XmlElement(name = "Enthaltungen", required = true, nillable = true)
    protected BigDecimal enthaltungen;
    @XmlElement(name = "GRBeschluss", required = true)
    protected MultiLangTextFieldType grBeschluss;
    @XmlElement(name = "Traktandierungscode", required = true)
    protected MultiLangTextFieldType traktandierungscode;
    @XmlElement(name = "Beschlussdetail", required = true)
    protected MultiLangTextFieldType beschlussdetail;
    @XmlElement(name = "AntragRR", required = true)
    protected MultiLangTextFieldType antragRR;
    @XmlElement(name = "Traktandierungsvermerk", required = true)
    protected MultiLangTextFieldType traktandierungsvermerk;
    @XmlElement(name = "Protokollvermerk", required = true)
    protected MultiLangTextFieldType protokollvermerk;
    @XmlElement(name = "Datum", required = true)
    protected DateTimeFieldType datum;
    @XmlElement(name = "Antragsdetail", required = true)
    protected MultiLangTextFieldType antragsdetail;
    @XmlElement(name = "Traktandentitel", required = true)
    protected MultiLangTextFieldType traktandentitel;
    @XmlElement(name = "Traktandennummer", required = true, nillable = true)
    protected BigDecimal traktandennummer;
    @XmlElement(name = "BeschlussRR", required = true)
    protected MultiLangTextFieldType beschlussRR;
    @XmlElement(name = "BeschlussdetailRR", required = true)
    protected MultiLangTextFieldType beschlussdetailRR;
    @XmlAttribute(name = "OBJ_GUID", required = true)
    protected String objguid;
    @XmlAttribute(name = "SEQ")
    protected String seq;
    @XmlAttribute(name = "IDX")
    protected String idx;

    /**
     * Gets the value of the gremium property.
     * 
     * @return
     *     possible object is
     *     {@link Traktandum.Gremium }
     *     
     */
    public Traktandum.Gremium getGremium() {
        return gremium;
    }

    /**
     * Sets the value of the gremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Traktandum.Gremium }
     *     
     */
    public void setGremium(Traktandum.Gremium value) {
        this.gremium = value;
    }

    /**
     * Gets the value of the sitzung property.
     * 
     * @return
     *     possible object is
     *     {@link Traktandum.Sitzung }
     *     
     */
    public Traktandum.Sitzung getSitzung() {
        return sitzung;
    }

    /**
     * Sets the value of the sitzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Traktandum.Sitzung }
     *     
     */
    public void setSitzung(Traktandum.Sitzung value) {
        this.sitzung = value;
    }

    /**
     * Gets the value of the unterlagen property.
     * 
     * @return
     *     possible object is
     *     {@link Traktandum.Unterlagen }
     *     
     */
    public Traktandum.Unterlagen getUnterlagen() {
        return unterlagen;
    }

    /**
     * Sets the value of the unterlagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Traktandum.Unterlagen }
     *     
     */
    public void setUnterlagen(Traktandum.Unterlagen value) {
        this.unterlagen = value;
    }

    /**
     * Gets the value of the geschaeft property.
     * 
     * @return
     *     possible object is
     *     {@link Traktandum.Geschaeft }
     *     
     */
    public Traktandum.Geschaeft getGeschaeft() {
        return geschaeft;
    }

    /**
     * Sets the value of the geschaeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Traktandum.Geschaeft }
     *     
     */
    public void setGeschaeft(Traktandum.Geschaeft value) {
        this.geschaeft = value;
    }

    /**
     * Gets the value of the ja property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJa() {
        return ja;
    }

    /**
     * Sets the value of the ja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJa(BigDecimal value) {
        this.ja = value;
    }

    /**
     * Gets the value of the nein property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNein() {
        return nein;
    }

    /**
     * Sets the value of the nein property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNein(BigDecimal value) {
        this.nein = value;
    }

    /**
     * Gets the value of the enthaltungen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnthaltungen() {
        return enthaltungen;
    }

    /**
     * Sets the value of the enthaltungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnthaltungen(BigDecimal value) {
        this.enthaltungen = value;
    }

    /**
     * Gets the value of the grBeschluss property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getGRBeschluss() {
        return grBeschluss;
    }

    /**
     * Sets the value of the grBeschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setGRBeschluss(MultiLangTextFieldType value) {
        this.grBeschluss = value;
    }

    /**
     * Gets the value of the traktandierungscode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getTraktandierungscode() {
        return traktandierungscode;
    }

    /**
     * Sets the value of the traktandierungscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setTraktandierungscode(MultiLangTextFieldType value) {
        this.traktandierungscode = value;
    }

    /**
     * Gets the value of the beschlussdetail property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getBeschlussdetail() {
        return beschlussdetail;
    }

    /**
     * Sets the value of the beschlussdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setBeschlussdetail(MultiLangTextFieldType value) {
        this.beschlussdetail = value;
    }

    /**
     * Gets the value of the antragRR property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getAntragRR() {
        return antragRR;
    }

    /**
     * Sets the value of the antragRR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setAntragRR(MultiLangTextFieldType value) {
        this.antragRR = value;
    }

    /**
     * Gets the value of the traktandierungsvermerk property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getTraktandierungsvermerk() {
        return traktandierungsvermerk;
    }

    /**
     * Sets the value of the traktandierungsvermerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setTraktandierungsvermerk(MultiLangTextFieldType value) {
        this.traktandierungsvermerk = value;
    }

    /**
     * Gets the value of the protokollvermerk property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getProtokollvermerk() {
        return protokollvermerk;
    }

    /**
     * Sets the value of the protokollvermerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setProtokollvermerk(MultiLangTextFieldType value) {
        this.protokollvermerk = value;
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
     * Gets the value of the antragsdetail property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getAntragsdetail() {
        return antragsdetail;
    }

    /**
     * Sets the value of the antragsdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setAntragsdetail(MultiLangTextFieldType value) {
        this.antragsdetail = value;
    }

    /**
     * Gets the value of the traktandentitel property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getTraktandentitel() {
        return traktandentitel;
    }

    /**
     * Sets the value of the traktandentitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setTraktandentitel(MultiLangTextFieldType value) {
        this.traktandentitel = value;
    }

    /**
     * Gets the value of the traktandennummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraktandennummer() {
        return traktandennummer;
    }

    /**
     * Sets the value of the traktandennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraktandennummer(BigDecimal value) {
        this.traktandennummer = value;
    }

    /**
     * Gets the value of the beschlussRR property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getBeschlussRR() {
        return beschlussRR;
    }

    /**
     * Sets the value of the beschlussRR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setBeschlussRR(MultiLangTextFieldType value) {
        this.beschlussRR = value;
    }

    /**
     * Gets the value of the beschlussdetailRR property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getBeschlussdetailRR() {
        return beschlussdetailRR;
    }

    /**
     * Sets the value of the beschlussdetailRR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setBeschlussdetailRR(MultiLangTextFieldType value) {
        this.beschlussdetailRR = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="Geschaeft" type="{http://www.cmiag.ch/cdws/Traktanden}Geschaeft"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geschaeft"
    })
    public static class Geschaeft {

        @XmlElement(name = "Geschaeft")
        protected ch.cmiag.cdws.traktanden.Geschaeft geschaeft;

        /**
         * Gets the value of the geschaeft property.
         * 
         * @return
         *     possible object is
         *     {@link ch.cmiag.cdws.traktanden.Geschaeft }
         *     
         */
        public ch.cmiag.cdws.traktanden.Geschaeft getGeschaeft() {
            return geschaeft;
        }

        /**
         * Sets the value of the geschaeft property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.cmiag.cdws.traktanden.Geschaeft }
         *     
         */
        public void setGeschaeft(ch.cmiag.cdws.traktanden.Geschaeft value) {
            this.geschaeft = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="Sitzung" type="{http://www.cmiag.ch/cdws/Traktanden}Gremium"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sitzung"
    })
    public static class Gremium {

        @XmlElement(name = "Sitzung")
        protected ch.cmiag.cdws.traktanden.Gremium sitzung;

        /**
         * Gets the value of the sitzung property.
         * 
         * @return
         *     possible object is
         *     {@link ch.cmiag.cdws.traktanden.Gremium }
         *     
         */
        public ch.cmiag.cdws.traktanden.Gremium getSitzung() {
            return sitzung;
        }

        /**
         * Sets the value of the sitzung property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.cmiag.cdws.traktanden.Gremium }
         *     
         */
        public void setSitzung(ch.cmiag.cdws.traktanden.Gremium value) {
            this.sitzung = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="Sitzung" type="{http://www.cmiag.ch/cdws/Traktanden}Sitzung"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sitzung"
    })
    public static class Sitzung {

        @XmlElement(name = "Sitzung")
        protected ch.cmiag.cdws.traktanden.Sitzung sitzung;

        /**
         * Gets the value of the sitzung property.
         * 
         * @return
         *     possible object is
         *     {@link ch.cmiag.cdws.traktanden.Sitzung }
         *     
         */
        public ch.cmiag.cdws.traktanden.Sitzung getSitzung() {
            return sitzung;
        }

        /**
         * Sets the value of the sitzung property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.cmiag.cdws.traktanden.Sitzung }
         *     
         */
        public void setSitzung(ch.cmiag.cdws.traktanden.Sitzung value) {
            this.sitzung = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Unterlage" type="{http://www.cmiag.ch/cdws/Traktanden}Unterlage"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unterlage"
    })
    public static class Unterlagen {

        @XmlElement(name = "Unterlage")
        protected List<Unterlage> unterlage;

        /**
         * Gets the value of the unterlage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unterlage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnterlage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Unterlage }
         * 
         * 
         */
        public List<Unterlage> getUnterlage() {
            if (unterlage == null) {
                unterlage = new ArrayList<Unterlage>();
            }
            return this.unterlage;
        }

    }

}
