package com.kodilla.testing.weather.mock;

import com.kodilla.testing.stub.Temperatures;
import com.kodilla.testing.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    @Test
    void testCalculateForecastWithMock() {
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Gdynia", 22.1);
        temperaturesMap.put("Wrocław", 25.3);
        temperaturesMap.put("Rzeszów", 24.4);
        temperaturesMap.put("Gdańsk", 26.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //then
        Assertions.assertEquals(4, quantityOfSensors);
    }
    @Test
    void testCalculateAverage() {
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Gdynia", 22.1);
        temperaturesMap.put("Wrocław", 25.3);
        temperaturesMap.put("Rzeszów", 24.4);
        temperaturesMap.put("Gdańsk", 26.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //when
        double average = weatherForecast.calculateAverage();
        //then
        Assertions.assertEquals(average, weatherForecast.calculateAverage());
    }
    @Test
    void testCalcMedian() {
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Gdynia", 22.1);
        temperaturesMap.put("Wrocław", 25.3);
        temperaturesMap.put("Rzeszów", 24.4);
        temperaturesMap.put("Gdańsk", 26.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //when
        Double median = weatherForecast.calcMedian();
        //then
        Assertions.assertEquals(median, temperaturesMap.size());
    }
}
