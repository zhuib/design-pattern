package work.lab02;

/**
 * Date: 2021/3/10 17:03
 */
public class AimaFactory implements BicycleFactory{
    @Override
    public Bicycle produce() {
        return new Aima();
    }

    @Override
    public void display() {
        System.out.println("爱玛自行车生产了！");
    }
}
