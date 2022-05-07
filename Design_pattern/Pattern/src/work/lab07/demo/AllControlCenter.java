package work.lab07.demo;

import java.util.ArrayList;

/**
 * Date: 2021/4/14 17:01
 */
public abstract class AllControlCenter {
    protected String allName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + allName + "战队");
        players.add(obs);
    }

    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + allName + "战队");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);

    public String getAllName() {
        return allName;
    }

    public void setAllName(String allName) {
        this.allName = allName;
    }
}
