package com.moonsuns.designmode.observer;

import com.moonsuns.designmode.observer.observers.CurrentConditionDisplay;
import com.moonsuns.designmode.observer.subject.WeatherData;

import java.util.concurrent.TimeUnit;

public class TestWeatherData
{
    public static void main(String[] args) throws InterruptedException
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(37.5, 60, 100);
        TimeUnit.SECONDS.sleep(5);
        weatherData.setMeasurements(36, 8, 200);

        currentConditionDisplay.unregisterObserver();
    }
}
