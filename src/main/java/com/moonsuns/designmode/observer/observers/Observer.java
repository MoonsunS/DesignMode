package com.moonsuns.designmode.observer.observers;

import com.moonsuns.designmode.observer.subject.Observable;

public interface Observer
{
    /***
     * 当通知时调用的方法
     */
    void update(Observable observable, Object args);
}
