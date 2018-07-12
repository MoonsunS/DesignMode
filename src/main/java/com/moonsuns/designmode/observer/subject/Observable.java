package com.moonsuns.designmode.observer.subject;

import com.moonsuns.designmode.observer.observers.Observer;

public interface Observable
{
    /***
     * 添加观察者
     * @param observer 指定的观察者
     * */
    void addObserver(Observer observer);

    /***
     * 移除指定的观察者
     * @param observer 指定的观察者
     */
    void removeObserver(Observer observer);

    /***
     * 移除所有观察者
     */
    void removeAllObserver();

    /***
     * 通知所有的观察者，使用"拉"的方式
     */
    void notifyObservers();

    /***
     * 通知所有的观察者
     * @param data 要通知给观察者的数据
     */
    void notifyObservers(Object data);

    /***
     * 单独通知某一个观察者
     * @param observer 指定的观察者
     */
    void notifyObserver(Observer observer);

    /***
     * 单独通知某一个观察者
     * @param observer 指定的观察者
     * @param data 要通知给观察者的数据
     */
    void notifyObserver(Observer observer, Object data);
}
