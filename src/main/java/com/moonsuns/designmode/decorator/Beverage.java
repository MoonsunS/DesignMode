package com.moonsuns.designmode.decorator;

import lombok.Data;

@Data
public abstract class Beverage
{
    private String description = "Unknown Beverage";

    public abstract double cost();
}
