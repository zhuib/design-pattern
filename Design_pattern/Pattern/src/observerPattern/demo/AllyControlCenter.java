package observerPattern.demo;

import java.util.ArrayList;

/**
 * Author: zhuib
 * Date: 2020/10/12 11:25
 * Describe:
 */
public abstract class AllyControlCenter {

    protected String allyName; // 战队名称
    protected ArrayList<Observer> players = new ArrayList<>(); // 定义一个集合用于存储战队成员

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    // 注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" +this.allyName + "战队！");
        players.add(obs);
    }

    // 注销方法
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" +this.allyName + "战队！");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}
