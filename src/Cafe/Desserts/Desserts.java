package Cafe.Desserts;

import Cafe.Drinks.Drinks;

public abstract class Desserts {
    protected String dessert;
    protected Drinks drink;

    public Desserts(String dessert){
        this.dessert = dessert;
    }
    public void setDrink (Drinks drink){
        this.drink = drink;
    }
    public abstract void chooseDrink();
}
