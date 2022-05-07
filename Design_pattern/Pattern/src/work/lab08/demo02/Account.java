package work.lab08.demo02;

/**
 * Date: 2021/4/21 17:15
 */
public abstract class Account {

    public boolean validate(String account,String password){
        if ("admin".equals(account) && "123456".equals(password)) {
            return true;
        }else {
            return false;
        }
    }

    public abstract void calculateInterest();

    public void display(){
        System.out.println("系统显示利息");
    }

    public void handle(String account,String password) {
        if (validate(account,password)) {
            calculateInterest();
            display();
        }else {
            System.out.println("账号或密码错误！！！");
        }
    }
}
