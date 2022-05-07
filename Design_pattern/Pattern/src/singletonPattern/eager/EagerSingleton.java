package singletonPattern.eager;

/**
 * Author: zhuib
 * Date: 2020/10/18 22:19
 * Describe:
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
