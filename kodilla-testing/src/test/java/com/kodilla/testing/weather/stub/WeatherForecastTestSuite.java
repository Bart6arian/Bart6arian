package com.kodilla.testing.weather.stub;
import com.kodilla.testing.stub.Temperatures;
import com.kodilla.testing.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class WeatherForecastTestSuite {
    @Test
    void testCalculateWeatherForecastWithStub() {
        Temperatures temperatures = new TempsStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //when
        int quantityOfSensors = temperatures.getTemperatures().size();
        //then
        Assertions.assertEquals(4, quantityOfSensors);
    }
}
