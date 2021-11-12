package hack.data;

import ch.cmiag.cdws.dokumente.Dokument;
import org.xml.sax.SAXException;

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


        JAXBElement<Dokument> element = (JAXBElement<Dokument>) unmarshaller.unmarshal(Utils.getUrl("DokumenteOne", ".xml"));
        Dokument doc = element.getValue();
        int br = 0;
    }
}
