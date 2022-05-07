package work.lab05.demo;

/**
 * Date: 2021/3/31 17:15
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage;
        double cost;
        String description;

        beverage = new Espresso();
        description = beverage.getDescription();
        cost = beverage.getCost();
        System.out.println("饮料：" + description);
        System.out.println("价格：" + cost);
        System.out.println("-----------------------------");

        Beverage beverage_m;
        beverage_m = new Milk(beverage);
        description = beverage_m.getDescription();
        cost = beverage_m.getCost();
        System.out.println("饮料："  + description);
        System.out.println("价格：" + cost);
        System.out.println("-----------------------------");

        Beverage beverage_mo;
        beverage_mo = new Mocha(beverage_m);
        description = beverage_mo.getDescription();
        cost = beverage_mo.getCost();
        System.out.println("饮料："  + description);
        System.out.println("价格：" + cost);
    }
}
