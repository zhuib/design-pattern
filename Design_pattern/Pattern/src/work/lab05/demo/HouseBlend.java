package work.lab05.demo;

/**
 * Date: 2021/3/31 17:15
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend 咖啡";
    }

    @Override
    public double getCost() {
        return 30.00;
    }
}
