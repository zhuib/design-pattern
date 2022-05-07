package work.lab04.demo01;

/**
 * Date: 2021/3/24 17:09
 */
public class Client {

    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean();
        car.move();
        car.phonate();
        car.twinkle();
    }
}
