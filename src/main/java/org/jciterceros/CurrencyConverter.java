package org.jciterceros;

import org.json.JSONObject;

public class CurrencyConverter {
    private final CurrencyApiService apiService;

    public CurrencyConverter(CurrencyApiService apiService) {
        this.apiService = apiService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        String jsonResponse = apiService.getExchangeRates(fromCurrency);
        JSONObject json = new JSONObject(jsonResponse);
        double exchangeRate = json.getJSONObject("conversion_rates").getDouble(toCurrency);
        return amount * exchangeRate;
    }
}
