package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:19
 */
public class AddCommand extends AbstractCommand{

    private Adder adder;
    private int value;

    public AddCommand() {
        adder = new Adder();
    }

    @Override
    public int execute(int value) {
        this.value =value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
