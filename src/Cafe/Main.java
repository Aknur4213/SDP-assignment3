package Cafe;

import Cafe.Desserts.Cake;
import Cafe.Desserts.Desserts;
import Cafe.Desserts.LemonPossete;
import Cafe.Drinks.Drinks;
import Cafe.Drinks.Lemonade;
import Cafe.Drinks.Coffee;

public class Main {
    public static void main(String[] args){
        Drinks lemonade = new Lemonade();
        Drinks coffee = new Coffee();

        Desserts cake = new Cake();
        Desserts lemonpossete = new LemonPossete();

        cake.setDrink(coffee);
        cake.chooseDrink();

        lemonpossete.setDrink(lemonade);
        lemonpossete.chooseDrink();

        cake.setDrink(lemonade);
        cake.chooseDrink();

        lemonpossete.setDrink(coffee);
        lemonpossete.chooseDrink();
    }
}