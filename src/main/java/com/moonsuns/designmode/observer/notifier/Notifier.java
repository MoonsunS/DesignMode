package com.moonsuns.designmode.observer.notifier;

import lombok.Data;

@Data
public abstract class Notifier
{
    private EventHandler eventHandler = new EventHandler();

    public abstract void addListener(Object object, String methodName, Object... args);

    public abstract void notifyX();
}
