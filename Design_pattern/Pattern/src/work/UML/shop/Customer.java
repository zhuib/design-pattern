package work.UML.shop;

/**
 * Date: 2021/3/3 18:03
 */
public class Customer {

    public void shopping(Shop shop) {
        System.out.println(shop.sell());
    }

    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("顾客购买以下商品：");
        customer.shopping(new ShaoguanShop());
        customer.shopping(new WuyuanShop());
    }
}
