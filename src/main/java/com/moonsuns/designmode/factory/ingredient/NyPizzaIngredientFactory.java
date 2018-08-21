package com.moonsuns.designmode.factory.ingredient;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese()
    {
        return new ReggianoCheese();
    }
}
