package com.moonsuns.designmode.factory.store;

import com.moonsuns.designmode.factory.pizza.Pizza;
import com.moonsuns.designmode.factory.pizza.PizzaType;

public abstract class PizzaStore
{
    public Pizza orderPizza(PizzaType type)
    {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);
}
