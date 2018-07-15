package com.moonsuns.designmode.observer;

import com.moonsuns.designmode.observer.notifier.GoodNotifier;
import com.moonsuns.designmode.observer.notifier.Notifier;
import com.moonsuns.designmode.observer.observers.CurrentConditionDisplay;

public class TestGoodNotifier
{
    public static void main(String[] args)
    {
        Notifier goodNotifier = new GoodNotifier();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();

        goodNotifier.addListener(currentConditionDisplay, "display", (Object[]) null);

        goodNotifier.notifyX();
    }
}
