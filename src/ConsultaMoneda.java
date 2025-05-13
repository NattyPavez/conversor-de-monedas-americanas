import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    Moneda buscaMoneda(String monedaSeleccionada) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/23860c8d284a83356fab3ba1/latest/" + monedaSeleccionada);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
