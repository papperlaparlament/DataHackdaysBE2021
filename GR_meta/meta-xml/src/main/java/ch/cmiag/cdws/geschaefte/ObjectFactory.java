//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:20:22 PM CET 
//


package ch.cmiag.cdws.geschaefte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.cmiag.cdws.geschaefte package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Geschaeft_QNAME = new QName("http://www.cmiag.ch/cdws/Geschaefte", "Geschaeft");
    private final static QName _DateTimeFieldTypeEnd_QNAME = new QName("http://www.cmiag.ch/cdws/Geschaefte", "End");
    private final static QName _DateTimeFieldTypeStart_QNAME = new QName("http://www.cmiag.ch/cdws/Geschaefte", "Start");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.cmiag.cdws.geschaefte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Geschaeft }
     * 
     */
    public Geschaeft createGeschaeft() {
        return new Geschaeft();
    }

    /**
     * Create an instance of {@link EingereichtVon }
     * 
     */
    public EingereichtVon createEingereichtVon() {
        return new EingereichtVon();
    }

    /**
     * Create an instance of {@link GeschaeftAuf }
     * 
     */
    public GeschaeftAuf createGeschaeftAuf() {
        return new GeschaeftAuf();
    }

    /**
     * Create an instance of {@link MultiLangTextFieldType }
     * 
     */
    public MultiLangTextFieldType createMultiLangTextFieldType() {
        return new MultiLangTextFieldType();
    }

    /**
     * Create an instance of {@link Vorstoesser }
     * 
     */
    public Vorstoesser createVorstoesser() {
        return new Vorstoesser();
    }

    /**
     * Create an instance of {@link ch.cmiag.cdws.geschaefte.Themen }
     * 
     */
    public ch.cmiag.cdws.geschaefte.Themen createThemen() {
        return new ch.cmiag.cdws.geschaefte.Themen();
    }

    /**
     * Create an instance of {@link DateTimeFieldType }
     * 
     */
    public DateTimeFieldType createDateTimeFieldType() {
        return new DateTimeFieldType();
    }

    /**
     * Create an instance of {@link Traktandum }
     * 
     */
    public Traktandum createTraktandum() {
        return new Traktandum();
    }

    /**
     * Create an instance of {@link VorstoesserParteiSuche }
     * 
     */
    public VorstoesserParteiSuche createVorstoesserParteiSuche() {
        return new VorstoesserParteiSuche();
    }

    /**
     * Create an instance of {@link Gremium }
     * 
     */
    public Gremium createGremium() {
        return new Gremium();
    }

    /**
     * Create an instance of {@link Dokument }
     * 
     */
    public Dokument createDokument() {
        return new Dokument();
    }

    /**
     * Create an instance of {@link GremiumKommission }
     * 
     */
    public GremiumKommission createGremiumKommission() {
        return new GremiumKommission();
    }

    /**
     * Create an instance of {@link Geschaeft.EingereichtVon }
     * 
     */
    public Geschaeft.EingereichtVon createGeschaeftEingereichtVon() {
        return new Geschaeft.EingereichtVon();
    }

    /**
     * Create an instance of {@link Geschaeft.Themen }
     * 
     */
    public Geschaeft.Themen createGeschaeftThemen() {
        return new Geschaeft.Themen();
    }

    /**
     * Create an instance of {@link Geschaeft.VerwendetGeschaeftAuf }
     * 
     */
    public Geschaeft.VerwendetGeschaeftAuf createGeschaeftVerwendetGeschaeftAuf() {
        return new Geschaeft.VerwendetGeschaeftAuf();
    }

    /**
     * Create an instance of {@link Geschaeft.VerwendetGeschaeftVon }
     * 
     */
    public Geschaeft.VerwendetGeschaeftVon createGeschaeftVerwendetGeschaeftVon() {
        return new Geschaeft.VerwendetGeschaeftVon();
    }

    /**
     * Create an instance of {@link Geschaeft.Traktandierungen }
     * 
     */
    public Geschaeft.Traktandierungen createGeschaeftTraktandierungen() {
        return new Geschaeft.Traktandierungen();
    }

    /**
     * Create an instance of {@link Geschaeft.ErgaenzendeDokumente }
     * 
     */
    public Geschaeft.ErgaenzendeDokumente createGeschaeftErgaenzendeDokumente() {
        return new Geschaeft.ErgaenzendeDokumente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geschaeft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Geschaefte", name = "Geschaeft")
    public JAXBElement<Geschaeft> createGeschaeft(Geschaeft value) {
        return new JAXBElement<Geschaeft>(_Geschaeft_QNAME, Geschaeft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Geschaefte", name = "End", scope = DateTimeFieldType.class)
    public JAXBElement<XMLGregorianCalendar> createDateTimeFieldTypeEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeFieldTypeEnd_QNAME, XMLGregorianCalendar.class, DateTimeFieldType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Geschaefte", name = "Start", scope = DateTimeFieldType.class)
    public JAXBElement<XMLGregorianCalendar> createDateTimeFieldTypeStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeFieldTypeStart_QNAME, XMLGregorianCalendar.class, DateTimeFieldType.class, value);
    }

}
