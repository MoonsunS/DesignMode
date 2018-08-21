package com.moonsuns.designmode.factory;

import com.moonsuns.designmode.factory.pizza.Pizza;
import com.moonsuns.designmode.factory.pizza.PizzaType;
import com.moonsuns.designmode.factory.store.ChicagoStylePizzaStore;
import com.moonsuns.designmode.factory.store.NYStylePizzaStore;
import com.moonsuns.designmode.factory.store.PizzaStore;

public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
