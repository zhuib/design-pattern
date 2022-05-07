package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:31
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm cal = new CalculatorForm();
        AddCommand addCommand = new AddCommand();
        cal.setCommand(addCommand);
        cal.compute(1);
        cal.compute(4);
        cal.undo();
        SubCommand subCommand = new SubCommand();
        cal.setCommand(subCommand);
        cal.compute(5);
        cal.compute(2);
        cal.compute(4);
        cal.undo();
    }
}
