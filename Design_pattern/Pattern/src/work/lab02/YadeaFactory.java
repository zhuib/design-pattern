package work.lab02;

/**
 * Date: 2021/3/10 17:03
 */
public class YadeaFactory implements BicycleFactory{

    @Override
    public Bicycle produce() {
        return new Yadea();
    }

    @Override
    public void display() {
        System.out.println("雅迪自行车生产了！");
    }
}
