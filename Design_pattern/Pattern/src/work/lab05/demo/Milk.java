package work.lab05.demo;

/**
 * Date: 2021/3/31 17:16
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "加牛奶";
    }

    @Override
    public double getCost() {
        return super.getCost() + 6.0;
    }
}
