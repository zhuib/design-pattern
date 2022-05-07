package work.lab02_1;

/**
 * Date: 2021/3/10 18:17
 */
public class SGfarm implements Farm{

    public Plant newPlant() {
        System.out.println("水果长成!");
        return new Fruits();
    }
    public Animal newAnimal() {
        System.out.println("新马出生!");
        return new Horse();
    }
}
