package hack.data.pdf.read.stub;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        BodyContentHandler handler = new BodyContentHandler(-1);
        Metadata metadata = new Metadata();
        String filePath = "C:\\Users\\User\\home\\parser-inbox\\" + "test.pdf";
        FileInputStream inputstream = new FileInputStream(filePath);
        ParseContext pcontext = new ParseContext();

        //parsing the document using PDF parser
        PDFParser pdfparser = new PDFParser();
        pdfparser.parse(inputstream, handler, metadata,pcontext);

        //getting the content of the document
        System.out.println("Contents of the PDF :" + handler.toString());

        //getting metadata of the document
        System.out.println("Metadata of the PDF:");
        String[] metadataNames = metadata.names();

        for(String name : metadataNames) {
            System.out.println(name+ " : " + metadata.get(name));
        }

        TextExtractor textExtractor = new TextExtractor();
        textExtractor.process(filePath);
        textExtractor.getString();
    }
}
