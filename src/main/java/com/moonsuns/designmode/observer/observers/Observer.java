package com.moonsuns.designmode.observer.observers;

import com.moonsuns.designmode.observer.subject.Observable;

public interface Observer
{
    /***
     *
     * @param observable 通知者
     * @param data 通知者传递给观察者的数据
     */
    void update(Observable observable, Object data);
}
