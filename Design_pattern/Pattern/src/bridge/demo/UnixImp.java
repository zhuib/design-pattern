package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:37
 * Describe:
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Unix操作中显示图像");
    }
}
