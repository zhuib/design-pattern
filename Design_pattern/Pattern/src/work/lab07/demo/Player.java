package work.lab07.demo;


/**
 * Date: 2021/4/14 17:04
 */
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" +name + "救你！");
    }

    @Override
    public void beAttacked(AllControlCenter acc) {
        System.out.println(name + "被攻击！");
        acc.notifyObserver(name);
    }

}
