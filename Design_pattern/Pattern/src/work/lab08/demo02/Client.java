package work.lab08.demo02;

/**
 * Date: 2021/4/21 17:43
 */
public class Client {
    public static void main(String[] args) {
        Account account;
        account = new CurrentAccount();
        account.handle("admin","123456");
    }
}
