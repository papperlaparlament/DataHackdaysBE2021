package hack.data;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Utils {

    public static URL getUrl(String type, String suffix) throws MalformedURLException {
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\GR\\";
        File file = new File(path+ type + suffix);
        return file.toURI().toURL();
    }
}
