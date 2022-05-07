package work.lab04.demo02;

/**
 * Date: 2021/3/24 17:21
 */
public class Goods implements Articles{

    private String name;
    private int quantity;
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {

        System.out.println(name + "\t\t\t"+ quantity+"\t\t"+ unitPrice);
    }
}
