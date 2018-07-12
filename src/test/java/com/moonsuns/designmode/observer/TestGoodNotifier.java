package com.moonsuns.designmode.observer;

import com.moonsuns.designmode.observer.notifier.GoodNotifier;
import com.moonsuns.designmode.observer.notifier.Notifier;
import com.moonsuns.designmode.observer.observers.CurrentConditionDisplay;
import com.moonsuns.designmode.observer.observers.Observer;
import com.moonsuns.designmode.observer.subject.Observable;
import com.moonsuns.designmode.observer.subject.WeatherData;

public class TestGoodNotifier
{
    public static void main(String[] args)
    {
        Notifier goodNotifier = new GoodNotifier();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();

        goodNotifier.addListener(currentConditionDisplay, "update", new Observable()
        {
            @Override
            public void addObserver(Observer observer)
            {

            }

            @Override
            public void removeObserver(Observer observer)
            {

            }

            @Override
            public void removeAllObserver()
            {

            }

            @Override
            public void notifyObservers()
            {

            }

            @Override
            public void notifyObservers(Object data)
            {

            }

            @Override
            public void notifyObserver(Observer observer)
            {

            }

            @Override
            public void notifyObserver(Observer observer, Object data)
            {

            }
        }, "s");

        goodNotifier.notifyX();
    }
}
