package com.moonsuns.designmode.factory.ingredient;

public interface PizzaIngredientFactory
{
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();
}
