package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:37
 * Describe:
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Linux操作中显示图像");
    }
}
