package com.moonsuns.designmode.decorator;

public class Espresso extends Beverage
{
    public Espresso()
    {
        setDescription("Espresso");
    }

    @Override
    public double cost()
    {
        return 1.99;
    }
}