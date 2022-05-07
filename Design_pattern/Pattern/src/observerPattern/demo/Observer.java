package observerPattern.demo;

/**
 * Author: zhuib
 * Date: 2020/10/12 11:31
 * Describe:
 */
public interface Observer {

    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(AllyControlCenter acc);
}
