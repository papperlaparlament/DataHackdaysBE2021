package hack.data;


import ch.cmiag.cdws.geschaefte.Geschaeft;
import org.xml.sax.SAXException;
import ch.cmiag.cdws.dokumente.Dokument;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.net.MalformedURLException;
import java.net.URL;

public class MainApp {

    public static void main(String... args) throws JAXBException, SAXException, MalformedURLException {
        JAXBContext jc = JAXBContext.newInstance(Dokument.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        URL schemaURL = Utils.getUrl("Dokumente", ".xsd");
        Schema schema = sf.newSchema(schemaURL);
        unmarshaller.setSchema(schema);

        JAXBElement<Dokument> element = (JAXBElement<Dokument>) unmarshaller.unmarshal(Utils.getUrl("DokumenteOne", ".xml"));
        Dokument doc = element.getValue();
        int br = 0;
    }
}
