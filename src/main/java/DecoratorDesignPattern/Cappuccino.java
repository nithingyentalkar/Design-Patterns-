package DecoratorDesignPattern;

public class Cappuccino extends Beverage {

    public Cappuccino() {
        beverageName = "Cappuccino Coffee";
    }

    @Override
    int getBeveragePrice() {
        return 10;
    }
}
