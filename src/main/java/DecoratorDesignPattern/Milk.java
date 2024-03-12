package DecoratorDesignPattern;

public class Milk extends IngredientDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 5;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " + Milk";
    }
}
