package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }


    public double calculateAverage(){
        List<Double> resultTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultTemperatures.add(temperature.getValue());
        }
        double sum = 0;
        for (int i = 0; i <resultTemperatures.size() ; i++) {
            sum += resultTemperatures.get(i);
        }
        double average = sum / resultTemperatures.size();
        System.out.println(average);

        return average;
    }

    public double calculateMedian() {
        List<Double> resultTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultTemperatures.add(temperature.getValue());
        }
        Collections.sort(resultTemperatures);
        double median;
        if (resultTemperatures.size() % 2 != 0) {
            median = resultTemperatures.get((resultTemperatures.size() -1) / 2);
        }else{
            median = resultTemperatures.get((resultTemperatures.size() /2 ) -1 ) +
                    resultTemperatures.get((resultTemperatures.size() / 2))/2;
        }
        return median;
    }
}