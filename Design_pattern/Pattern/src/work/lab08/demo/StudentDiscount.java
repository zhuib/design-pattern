package work.lab08.demo;

/**
 * Date: 2021/4/21 17:07
 */
public class StudentDiscount implements Discount {
    private final double DISCOUNT = 0.8;
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
       return price * DISCOUNT;
    }
}
