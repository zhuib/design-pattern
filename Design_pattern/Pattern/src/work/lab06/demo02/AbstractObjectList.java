package work.lab06.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2021/4/11 22:01
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List<Object> getObjects() {
        return objects;
    }

    public abstract AbstractIterator createIterator();
}
