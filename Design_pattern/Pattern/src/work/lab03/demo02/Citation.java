package work.lab03.demo02;

/**
 * Date: 2021/3/17 17:18
 */
public class Citation implements Cloneable {

    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("原型已经创建好！");
    }

    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Citation) object;
    }

    public void display() {
        System.out.println(name + " 是 " + info + " 系的学生，该生在本年度获得 " + college + " 大学的三好学生奖");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
