package work.lab08.demo02;

/**
 * Date: 2021/4/21 17:15
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
