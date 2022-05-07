package work.lab06.demo02;

/**
 * Date: 2021/4/11 22:01
 */
public interface AbstractIterator {

    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public Object getNextItem();
    public Object getPreviousItem();
}
