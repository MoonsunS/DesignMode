package com.moonsuns.designmode.observer.notifier;

import java.util.ArrayList;
import java.util.List;

public class EventHandler
{
    private List<Event> events;

    public EventHandler()
    {
        events = new ArrayList<>();
    }

    /***
     * 添加某个对象要执行的事件，及需要的参数
     * @param object 执行方法的对象
     * @param methodName 执行的方法名称
     * @param args 执行的方法参数
     */
    public void addEvent(Object object, String methodName, Object... args)
    {
        events.add(new Event(object, methodName, args));
    }

    /***
     * 通知所有的对象执行指定的事件
     * @throws Exception
     */
    public void notifyX() throws Exception
    {
        for (Event e : events)
        {
            e.invoke();
        }
    }
}
