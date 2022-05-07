package work.lab03.demo01;

/**
 * Date: 2021/3/17 17:13
 */
public class Client {

    public static void main(String[] args) {
        Visitor v1,v2;
        v1 = Visitor.getVisit();
        v2 = Visitor.getVisit();
        System.out.println(v1 == v2);
        int n = v2.getNumber();
        System.out.println("总的访问人数是：" + n);
    }
}
