package work.lab05.demo;

/**
 * Date: 2021/3/31 17:16
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso 咖啡";
    }

    @Override
    public double getCost() {
        return 25.00;
    }
}
