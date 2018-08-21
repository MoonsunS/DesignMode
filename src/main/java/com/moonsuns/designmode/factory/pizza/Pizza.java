package com.moonsuns.designmode.factory.pizza;

import com.moonsuns.designmode.factory.ingredient.Cheese;
import com.moonsuns.designmode.factory.ingredient.Dough;
import com.moonsuns.designmode.factory.ingredient.Sauce;
import lombok.Getter;
import lombok.Setter;

public abstract class Pizza
{
    @Setter
    @Getter
    String name;

    Dough dough;

    Sauce sauce;

    Cheese cheese;

    public abstract void prepare();

    public void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
