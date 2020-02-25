package HTTPURLConnections;

import java.io.*;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://google.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        StringBuilder htmlOutput = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            while((line = bufferedReader.readLine()) != null) {
                htmlOutput.append(line + "\n");
            }
            bufferedReader.close();
        } catch(Exception e) {
            System.out.println("Website " + url + " not reached.");
        } finally {
            urlConnection.disconnect();
        }

        System.out.println(htmlOutput);
    }
}
