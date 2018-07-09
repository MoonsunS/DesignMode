package com.moonsuns.designmode.observer.subject;

import com.moonsuns.designmode.observer.observers.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable
{
    private List<Observer> observers;

    private boolean isChanged = false;

    @Getter
    private double temperature;

    @Getter
    private double humidity;

    @Getter
    private double pressure;

    public WeatherData()
    {
        observers = new ArrayList<>();

        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }

    @Override
    public void registerObserver(Observer observer)
    {
        if (observer != null)
        {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer)
    {
        if (observer != null)
        {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers()
    {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object args)
    {
        if(isChanged)
        {
            for(Observer observer : observers)
            {
                observer.update(this, args);
            }
            isChanged = false;
        }
    }

    private void setChanged()
    {
        isChanged = true;
    }

    public void setMeasurements(double temperature, double humidity, double pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }
}
