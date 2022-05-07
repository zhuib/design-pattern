package bridge.demo;

/**
 * Author: zhuib
 * Date: 2020/10/18 21:51
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
