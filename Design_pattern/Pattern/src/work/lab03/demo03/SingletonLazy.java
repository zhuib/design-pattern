package work.lab03.demo03;

import java.lang.reflect.Constructor;

/**
 * Date: 2021/3/17 17:40
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President instance = President.getInstance();
        instance.getName();
        President instance2 = President.getInstance();
        instance2.getName();

        if (instance != instance2) {
            System.out.println("他们不是同一个人");
        }else {
            System.out.println("他们是同一个人");
        }

    }
}
