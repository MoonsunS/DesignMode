package com.moonsuns.designmode.factory.pizza;

import com.moonsuns.designmode.factory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
