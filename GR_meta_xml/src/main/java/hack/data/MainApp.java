package hack.data;

import ch.cmiag.cdws.dokumente.Dokument;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class  MainApp {

    public static final Map<Class<?>, Unmarshaller> UNMARSHALLER_MAP = new HashMap<>();

    static {
        try {
            UNMARSHALLER_MAP.put(Dokument.class, JAXBContext.newInstance(Dokument.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Geschaeft.class, JAXBContext.newInstance(Geschaeft.class).createUnmarshaller());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) throws JAXBException, SAXException, MalformedURLException {

        Dokument dokument =  unmarshall(Dokument.class, "DokumenteOne").getValue();
        Geschaeft geschaeft =  unmarshall(Geschaeft.class, "GeschaefteOne").getValue();
        int br = 0;
    }

    public static <T> JAXBElement<T> unmarshall(Class<T> t, String name) throws MalformedURLException, JAXBException {
        return  (JAXBElement<T>) UNMARSHALLER_MAP.get(t).unmarshal(Utils.getUrl(name, ".xml"));
    }
}
