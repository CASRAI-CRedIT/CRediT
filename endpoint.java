import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // URL and parameters
            URL url = new URL("https://tools.casrai.org/generate-metadata");
            String jsonInputString = "{\"text\": \"Your text here\"}";

            // Open connection
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            // Send the JSON input data
            try(OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read and output the response from the server
            // [Insert code to read the response, typically using InputStream]

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
