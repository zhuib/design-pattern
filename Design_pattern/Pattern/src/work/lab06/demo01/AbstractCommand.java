package work.lab06.demo01;

/**
 * Date: 2021/4/7 17:19
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
