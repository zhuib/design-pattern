package work.lab03.demo03;

/**
 * Date: 2021/3/17 17:39
 */
public class President {

    private static volatile President instance = null;
    private President() {
        System.out.println("产生一位美国总统");
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        }else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }

    public void getName() {
        System.out.println("美国总统的是 奥巴马");
    }
}
