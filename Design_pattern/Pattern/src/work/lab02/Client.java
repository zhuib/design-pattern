package work.lab02;

/**
 * Date: 2021/3/10 17:09
 */
public class Client {

    public static void main(String[] args) {
        try {
            BicycleFactory factory;
            Bicycle produce;
            factory = (BicycleFactory) XMLUtil.getBean();
            produce = factory.produce();
            System.out.println("新类名：" + produce.getClass().getName());
            factory.display();
            produce.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
