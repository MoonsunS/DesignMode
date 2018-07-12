package com.moonsuns.designmode.observer.notifier;

public class GoodNotifier extends Notifier
{
    @Override
    public void addListener(Object object, String methodName, Object... args)
    {
        EventHandler handler = getEventHandler();
        handler.addEvent(object, methodName, args);
    }

    @Override
    public void notifyX()
    {
        try
        {
            getEventHandler().notifyX();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
