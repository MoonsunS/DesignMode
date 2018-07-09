package com.moonsuns.designmode.observer.subject;

import com.moonsuns.designmode.observer.observers.Observer;

public interface Observable
{
    /***
     * 用于注册为观察者
     * */
    void registerObserver(Observer observer);

    /***
     * 用于撤销观察者
     */
    void removeObserver(Observer observer);

    /***
     * 当通知时调用的方法
     */
    void notifyObservers();

    void notifyObservers(Object args);
}
