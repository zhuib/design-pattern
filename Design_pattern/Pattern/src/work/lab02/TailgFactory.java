package work.lab02;

/**
 * Date: 2021/3/10 17:03
 */
public class TailgFactory implements BicycleFactory{
    @Override
    public Bicycle produce() {
        return new Tailg();
    }

    @Override
    public void display() {
        System.out.println("台铃自行车生产了！");
    }

}
