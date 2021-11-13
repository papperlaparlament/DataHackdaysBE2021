package ch.opendata.hackdaysbe;

import org.apache.tika.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ivan@olexyn.com
 */
public class Utils {

    public static String filePath(String type, String suffix) {
        String path = System.getProperty("user.dir") + "\\meta-xml\\src\\main\\resources\\GR\\";
        return path + type + suffix;
    }

    public static URL getUrl(String type, String suffix) throws MalformedURLException {
        File file = new File(filePath(type, suffix));
        return file.toURI().toURL();
    }

    public static List<String> readPayloads(String fileName) throws IOException {
        List<String> rawLines = Files.readAllLines(Paths.get(fileName));
        List<String> cleanLines = rawLines.stream()
            .filter(
                line -> !line.contains("<SearchDetailResponse")
                && !line.contains("<Hit")
                    && !line.contains("xml version="))
            .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String line : cleanLines) {
            sb.append(line);
        }
        String[] payloads = sb.toString().split("<Snippet/>");
        return Arrays.stream(payloads)
            .map(payload -> payload.replace("</Hit>", ""))
            .map(payload -> payload.replace("</SearchDetailResponse>", ""))
            .map(payload -> payload.replace(" xsi:nil=\"true\"", ""))
            .map(payload -> payload.replace(" xsi:nil=\"false\"", ""))
            .filter(payload -> !StringUtils.isBlank(payload))
            .collect(Collectors.toList());
    }

}
