package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:29
 */
public class Sub {
    private int num = 0;

    public int sub(int value){
//        num = value-num;
        num -= value;
        return num;
    }
}
