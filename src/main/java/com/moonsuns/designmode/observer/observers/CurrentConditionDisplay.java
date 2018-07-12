package com.moonsuns.designmode.observer.observers;

import com.moonsuns.designmode.observer.subject.Observable;
import com.moonsuns.designmode.observer.subject.WeatherData;

public class CurrentConditionDisplay implements Observer
{
    private Observable weatherCenter;

    private double temperature;

    private double humidity;

    public CurrentConditionDisplay(Observable observable)
    {
        this.weatherCenter = observable;
        weatherCenter.addObserver(this);
    }

    public void unregisterObserver()
    {
        weatherCenter.removeObserver(this);
    }

    @Override
    public void update(Observable observable, Object args)
    {
        //可以选择"推"的方式，读取args
        //也可以选择"拉"的方式，读取observable
        if(observable instanceof WeatherData)
        {
            WeatherData center = (WeatherData) observable;
            this.temperature = center.getTemperature();
            this.humidity = center.getHumidity();
            display();
        }
    }

    private void display()
    {
        System.out.println("Current conditions: " + this.temperature + "degrees and " + this.humidity + "% humidity");
    }
}
