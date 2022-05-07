package work.lab08.demo;

/**
 * Date: 2021/4/21 17:06
 */
public class MovieTicket {

    private double price;
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
