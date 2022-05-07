package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:41
 * Describe:
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        // 模拟解析BMP文件并获得一个像素矩阵对象m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ", 格式为BMP");
    }
}
