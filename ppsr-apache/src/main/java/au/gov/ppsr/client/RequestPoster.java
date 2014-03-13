package au.gov.ppsr.client;

import com.google.common.io.ByteStreams;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 24/02/2014
 * Time: 10:35 PM
 */
public class RequestPoster {
    private static final String ENDPOINT_URL = "https://b2g-disc.ppsr.gov.au/PpsrB2GService/2011/04/RegisterOperations.svc/soap11";
    private static final String SOAP_ACTION = "http://schemas.ppsr.gov.au/2011/04/services/RegisterOperationsService/ChangeB2GPassword";

    public static void main(String[] args) {
        String input;
        /*File file = new File("soap/ChangeB2GPasswordRequest.xml");
        InputStream inputStream = new FileInputStream(file);*/
        try {
            /*ResourceLoader resourceLoader = new FileSystemResourceLoader();
            Resource resource = resourceLoader.getResource("classpath:soap/ChangeB2GPasswordRequest.xml");
            InputStream in = resource.getInputStream();*/
            File file = new File("soap/ChangeB2GPasswordRequest.xml");
            InputStream in = new FileInputStream(file);
            HttpURLConnection httpConn = createConnection();
            byte[] b = ByteStreams.toByteArray(in);
            httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
            httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            // Used in SOAP1.1
            httpConn.setRequestProperty("SOAPAction", SOAP_ACTION);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            OutputStream out = httpConn.getOutputStream();
            out.write(b);
            out.close();
            int responseCode = httpConn.getResponseCode();
            BufferedReader bufferedReader = getBufferedReader(httpConn, responseCode);
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }
            bufferedReader.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private static BufferedReader getBufferedReader(HttpURLConnection httpConn, int responseCode) throws IOException {
        if (responseCode == 200) {
           return new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        } else {
            return new BufferedReader(new InputStreamReader(httpConn.getErrorStream()));
        }
    }

    private static HttpURLConnection createConnection() throws IOException {
        URL url = new URL(ENDPOINT_URL);
        URLConnection connection = url.openConnection();
        return  (HttpURLConnection) connection;
    }
}
