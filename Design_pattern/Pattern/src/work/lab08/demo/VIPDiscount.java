package work.lab08.demo;

/**
 * Date: 2021/4/21 17:07
 */
public class VIPDiscount implements Discount {
    private final double DISCOUNT = 0.5;
    @Override
    public double calculate(double price) {
        System.out.println("VIP用户");
        System.out.println("积分模式");
        return price * DISCOUNT;
    }
}
