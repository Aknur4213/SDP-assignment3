package Cafe.Desserts;

public class LemonPossete extends Desserts {
    public LemonPossete (){
        super("Nice but a bit bitter Lemon Possete with");
    }
    @Override
    public void chooseDrink (){
        System.out.print(dessert);
        this.drink.drinking();
    }
}
