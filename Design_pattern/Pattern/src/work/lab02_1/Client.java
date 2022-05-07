package work.lab02_1;

/**
 * Date: 2021/3/14 15:23
 */
public class Client {
    public static void main(String[] args) {
        try {
            Animal animal;
            Plant plant;
            Farm bean = (Farm) XMLUtil.getBean();
            System.out.println("新类名：" + bean.getClass().getName());
            animal = bean.newAnimal();
            plant = bean.newPlant();
            animal.show();
            plant.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
