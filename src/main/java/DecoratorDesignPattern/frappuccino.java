package DecoratorDesignPattern;

public class frappuccino extends  Beverage {

    public frappuccino() {
        beverageName = "frappuccino Coffee";
    }

    @Override
    int getBeveragePrice() {
        return 15;
    }
}
