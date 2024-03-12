package DecoratorDesignPattern;

public class Chocloate extends IngredientDecorator {


    Beverage beverage;
    public Chocloate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 10;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " + chocolate";
    }
}
