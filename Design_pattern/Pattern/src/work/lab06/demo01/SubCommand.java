package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:19
 */
public class SubCommand extends AbstractCommand{

    private Sub sub;
    private int value;

    public SubCommand() {
        sub = new Sub();
    }

    @Override
    public int execute(int value) {
        this.value = value;
        return sub.sub(value);
    }

    @Override
    public int undo() {
        return sub.sub(-value);
    }
}
