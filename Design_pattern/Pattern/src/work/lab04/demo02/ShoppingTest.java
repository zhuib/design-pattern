package work.lab04.demo02;

/**
 * Date: 2021/3/24 17:28
 */
public class ShoppingTest {

    public static void main(String[] args) {
        Goods gd;
        Bags red = new Bags("红色小袋");
        gd = new Goods("婺源特产", 2, 7.9f);
        red.add(gd);
        gd = new Goods("婺源地图", 1, 9.9f);
        red.add(gd);
        Bags write = new Bags("白色小袋");
        gd = new Goods("韶关香菇", 2, 68f);
        write.add(gd);
        gd = new Goods("韶关红茶", 3, 180f);
        write.add(gd);
        Bags middle = new Bags("中袋");
        middle.add(red);
        gd = new Goods("景德镇瓷器", 1, 380f);
        middle.add(gd);
        Bags big = new Bags("大袋");
        big.add(middle);
        big.add(write);
        gd = new Goods("李宁牌运动鞋", 1, 198f);
        big.add(gd);

        System.out.println("你选购的商品有：");
        System.out.println("商品名"+"\t\t\t数量"+"\t\t单价");
        big.show();
        System.out.println("要支付的总价是：" + big.calculation() + "元");

    }
}
