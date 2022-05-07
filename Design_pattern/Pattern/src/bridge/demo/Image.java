package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:38
 * Describe:
 */
public abstract class Image {
    protected ImageImp imp;

    // 注入实现类接口对象

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
