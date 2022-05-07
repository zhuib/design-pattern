package work.lab07.demo;

/**
 * Date: 2021/4/14 17:15
 */
public class Client {

    public static void main(String[] args) {
        AllControlCenter acc,acc2;
        acc = new ConcreteAllControlCenter("金庸群侠1");
        acc2 = new ConcreteAllControlCenter("金庸群侠2");
        Observer yg, lhc,zwj,dy,hr,xln,gj;

        yg = new Player("杨过");
        acc.join(yg);
        lhc = new Player("令狐冲");
        acc.join(lhc);
        zwj = new Player("张无忌");
        acc.join(zwj);
        dy = new Player("段誉");
        acc.join(dy);
        hr = new Player("黄蓉");
        acc2.join(hr);
        xln = new Player("小龙女");
        acc2.join(xln);
        gj = new Player("郭靖");
        acc2.join(gj);

        yg.beAttacked(acc);

        gj.beAttacked(acc2);










    }
}
