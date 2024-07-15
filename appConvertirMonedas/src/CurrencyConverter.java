import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class CurrencyConverter {
    private static final String API_KEY = "bc23197c71f975cb22d959cf";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double convert(String fromCurrency, String toCurrency, double amount) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                ApiResponse apiResponse = new Gson().fromJson(response.toString(), ApiResponse.class);

                if (apiResponse != null && apiResponse.getConversion_rates() != null) {
                    Double rate = apiResponse.getConversion_rates().get(toCurrency);
                    if (rate != null) {
                        return amount * rate;
                    } else {
                        System.out.println("No se encontró la tasa de conversión para la moneda destino.");
                    }
                } else {
                    System.out.println("La respuesta de la API no contiene tasas de conversión válidas.");
                }
            } else {
                System.out.println("La solicitud HTTP no fue exitosa: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
