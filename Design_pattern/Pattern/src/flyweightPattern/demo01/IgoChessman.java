package flyweightPattern.demo01;

/**
 * Date: 2020/11/9 11:23
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色 ： " + this.getColor());
    }
}
