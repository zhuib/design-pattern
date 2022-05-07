package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:32
 * Describe:
 */
public class WindowsImp implements ImageImp {

    @Override
    public void doPaint(Matrix m) {
        // 调用Windows系统的绘制函数绘制像素矩阵
        System.out.println("在Windows操作中显示图像");
    }
}
