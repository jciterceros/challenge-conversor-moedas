package org.jciterceros;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ExchangeRateApiService implements CurrencyApiService {
    private final String baseUrl;
    private final OkHttpClient client;

    public ExchangeRateApiService(String baseUrl) {
        this.baseUrl = baseUrl;
        this.client = new OkHttpClient();
    }

    @Override
    public String getExchangeRates(String fromCurrency) throws IOException {
        String url = baseUrl + fromCurrency;
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erro na resposta da API: " + response);
            }
            return response.body().string();
        }
    }
}
