package DecoratorDesignPattern;

public class StarBucksMain {

    public static void main(String[] args) {
        Beverage beverage = new Cappuccino();

        System.out.println(beverage.getBeverageName() + " is " + beverage.getBeveragePrice() + " Dollars");

       beverage = new Milk(beverage);
        System.out.println(beverage.getBeverageName() + " is " + beverage.getBeveragePrice() + " Dollars");

        beverage = new Chocloate(beverage);
        System.out.println(beverage.getBeverageName() + " is "+ beverage.getBeveragePrice() + " Dollars");
    }
}
