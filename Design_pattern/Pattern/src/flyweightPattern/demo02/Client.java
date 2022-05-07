package flyweightPattern.demo02;

/**
 * Date: 2020/11/9 11:31
 *
 * 有外部状态的享元模式
 */
public class Client {

    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory;

        // 获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();

        // 通常享元工厂获取3颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" +  (black1 == black2));

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" +  (white1 == white2));

        // 显示棋子
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        black3.display(new Coordinates(1,3));
        white2.display(new Coordinates(2,5));
        white1.display(new Coordinates(2,4));
    }
}
