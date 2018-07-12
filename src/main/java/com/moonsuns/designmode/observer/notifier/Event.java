package com.moonsuns.designmode.observer.notifier;

import java.lang.reflect.Method;

public class Event
{
    // 要执行方法的对象
    private Object object;

    // 要执行的方法名称
    private String methodName;

    // 要执行方法的参数
    private Object[] params;

    // 要执行方法的参数类型
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... args)
    {
        this.object = object;
        this.methodName = methodName;
        this.params = args;

        if(params != null)
        {
            this.paramTypes = new Class[params.length];
            for (int i = 0; i < params.length; i++)
            {
                this.paramTypes[i] = params[i].getClass();
            }
        }
    }

    /***
     * 根据该对象的方法名，方法参数，利用反射机制，执行该方法
     * @throws Exception
     */
    public void invoke() throws Exception
    {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        if (method == null)
        {
            return;
        }
        method.invoke(this.object, this.params);
    }
}
