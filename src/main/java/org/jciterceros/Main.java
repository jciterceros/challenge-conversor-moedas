package org.jciterceros;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("API_KEY");
        String baseUrl = dotenv.get("BASE_URL") + apiKey + "/latest/";

        CurrencyApiService apiService = new ExchangeRateApiService(baseUrl);
        CurrencyConverter converter = new CurrencyConverter(apiService);
        CurrencyConverterApp app = new CurrencyConverterApp(converter);

        app.run();
    }
}