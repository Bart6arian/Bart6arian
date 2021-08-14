package com.kodilla.testing.weather.stub;
import com.kodilla.testing.stub.Temperatures;

import java.util.Map;
import java.util.HashMap;

public class TempsStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();
        stubResult.put("Gdynia", 22.1);
        stubResult.put("Wrocław", 25.3);
        stubResult.put("Rzeszów", 24.4);
        stubResult.put("Gdańsk", 26.6);

        return stubResult;
    }
}
