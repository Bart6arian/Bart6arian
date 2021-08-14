package com.kodilla.testing.stub;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() +1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double sum = 0.0;
        Double[]toCalc = {};
        temperatures.getTemperatures().entrySet().toArray(toCalc);
            for(Double eachOf : toCalc) {
                sum += eachOf;
        }
            return sum / toCalc.length;
    }

    public Double calcMedian() {
        Double[]list = {};
        temperatures.getTemperatures().entrySet().toArray(list);
        Arrays.sort(list);
        Double median;
        if(list.length % 2 == 0) {
            median = ((double) list[list.length / 2] + (double) list[list.length / 2 - 1]) / 2;
        } else {
            median = (double)list[list.length/2];
        }

    }
}
