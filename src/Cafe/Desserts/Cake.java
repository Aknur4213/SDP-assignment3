package Cafe.Desserts;

public class Cake extends Desserts {
    public Cake(){
        super("Sweet and tasty cake with");
    }
    @Override
    public void chooseDrink (){
        System.out.print(dessert);
        this.drink.drinking();
    }
}
