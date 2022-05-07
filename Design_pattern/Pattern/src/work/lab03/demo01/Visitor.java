package work.lab03.demo01;

/**
 * Date: 2021/3/17 17:10
 */
public class Visitor {

    private static Visitor visit = new Visitor();
    private static int num = 0;

    private Visitor() {
    }

    public static Visitor getVisit() {
        num ++;
        System.out.println("欢迎用户光临本站！");
        return visit;
    }

    public int getNumber() {
        return Visitor.num;
    }
}
