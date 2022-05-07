package singletonPattern.lazy;

/**
 * Author: zhuib
 * Date: 2020/10/18 22:21
 * Describe:
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    public LazySingleton() {
    }

    // 使用synchronized 关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
