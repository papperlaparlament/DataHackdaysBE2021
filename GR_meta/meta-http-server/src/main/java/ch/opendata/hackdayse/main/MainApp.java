package ch.opendata.hackdayse.main;

import ch.opendata.hackdaysbe.DataLoader;
import com.olexyn.min.http.server.MinJettyServer;
import com.olexyn.min.http.server.servlets.AsyncServlet;
import com.olexyn.min.http.server.servlets.BlockingServlet;
import com.olexyn.min.http.server.servlets.MitgliedServlet;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class MainApp {

    public static void main(String... args) throws InterruptedException, JAXBException, IOException, SAXException {
        DataLoader.loadData();
        startServer();
        while (true) {
            Thread.sleep(1000L);
        }
    }

    public static void startServer() {
        MinJettyServer server = new MinJettyServer();

        server.PORT = 8090;
        server.MAX_THREADS = 100;
        server.MIN_THREADS = 10;
        server.IDLE_TIMEOUT = 120;

        server.addServletWithMapping("/status", BlockingServlet.class);
        server.addServletWithMapping("/heavy/async", AsyncServlet.class);
        server.addServletWithMapping("/member", MitgliedServlet.class);

        server.start();
    }

}
