package org.jciterceros;

import java.io.IOException;

public interface CurrencyApiService {
    String getExchangeRates(String fromCurrency) throws IOException;
}
