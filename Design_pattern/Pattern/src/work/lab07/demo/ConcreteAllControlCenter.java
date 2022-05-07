package work.lab07.demo;



/**
 * Date: 2021/4/14 17:02
 */
public class ConcreteAllControlCenter extends AllControlCenter {


    public ConcreteAllControlCenter(String allName) {
        super.allName = allName;
        System.out.println(allName+"战队组建成功！");
        System.out.println("------------------------------");
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(allName + "战队紧急通知，盟友" + name +"遭受敌人攻击！");
        for(Object obs : players) {
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
                ((Observer) obs).help();
            }
        }
    }
}
