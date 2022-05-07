package work.lab05.demo03;

/**
 * Date: 2021/3/31 23:35
 */
public class Client {

    public static void main(String[] args) {
        TVController controller=new TVController();
        controller.powerOn();
        controller.turnDown();
        controller.nextChannel();
        controller.powerOff();
    }
}
