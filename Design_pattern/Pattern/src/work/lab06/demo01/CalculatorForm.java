package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:21
 */
public class CalculatorForm {
    private AbstractCommand command;

    public void compute(int value) {
        int execute = command.execute(value);
        System.out.println("执行运算，运算结果为：" + execute);
    }

    public void undo(){
        int undo = command.undo();
        System.out.println("执行撤销，运算结果为：" +  undo);
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }
}
