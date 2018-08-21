package com.moonsuns.designmode.factory.store;

import com.moonsuns.designmode.factory.ingredient.NyPizzaIngredientFactory;
import com.moonsuns.designmode.factory.ingredient.PizzaIngredientFactory;
import com.moonsuns.designmode.factory.pizza.NYStyleCheesePizza;
import com.moonsuns.designmode.factory.pizza.Pizza;
import com.moonsuns.designmode.factory.pizza.PizzaType;

public class NYStylePizzaStore extends PizzaStore
{
    private PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

    @Override
    Pizza createPizza(PizzaType type)
    {
        Pizza pizza = null;

        if(PizzaType.CHEESE.equals(type))
        {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        // other type ...
        else
        {
            throw new IllegalArgumentException("Unsupport pizza type " + type.name());
        }

        return pizza;
    }
}
