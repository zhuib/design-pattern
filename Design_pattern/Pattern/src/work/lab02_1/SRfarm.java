package work.lab02_1;

/**
 * Date: 2021/3/10 18:17
 */
public class SRfarm implements Farm {
    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成!");
        return new Vegetables();
    }

    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生!");
        return new Cow();
    }
}
