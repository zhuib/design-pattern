package work.lab05.demo;

/**
 * Date: 2021/3/31 17:16
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "加摩卡";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
