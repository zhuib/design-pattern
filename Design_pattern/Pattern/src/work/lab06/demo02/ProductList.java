package work.lab06.demo02;

import java.util.List;

/**
 * Date: 2021/4/11 22:01
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> product) {
        super(product);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
