package old.rest.exampleReadJson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Appl {

    public String getJson() throws IOException {
        String gitHub = "https://api.github.com/users/vmuravskyi";

        URL url = new URL(gitHub);
        URLConnection connection = url.openConnection();
        HttpURLConnection httpConnection = (HttpURLConnection) connection;


        httpConnection.setRequestMethod("GET");
//        httpConnection.setRequestMethod("POST");
//        httpConnection.setRequestMethod("DELETE");
//        httpConnection.setRequestMethod("UPDATE");

        connection.setReadTimeout(15000);

        // Якісь інші додаткові параметри
        httpConnection.setRequestProperty("lgn", "en");
        httpConnection.setRequestProperty("changed", "1403802820");
        httpConnection.setRequestProperty("token", "askdaslkdjalksjlkdajsl");
        httpConnection.setRequestProperty("name", "Petro");
        httpConnection.setRequestProperty("password", "qwerty");


        String resultString;

        int responseCode = httpConnection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream in = httpConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8); // or "windows-1251"
            StringBuilder data = new StringBuilder();
            int c;
            while ((c = isr.read()) != -1) {
                data.append((char) c);
            }
            resultString = data.toString();
        } else {
            resultString = "Server does not respond";
        }
        httpConnection.disconnect();
        return resultString;
    }


    public static void main(String[] args) {
        Appl appl = new Appl();
        try {
            System.out.println(appl.getJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
