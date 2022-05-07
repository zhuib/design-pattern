package work.lab04.demo02;

import java.util.ArrayList;

/**
 * Date: 2021/3/24 17:23
 */
public class Bags implements Articles {

    private String name;
    private ArrayList<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float total = 0;
        int size = bags.size();
        for (int i = 0; i < size; i++) {
            Articles articles = bags.get(i);
            total += articles.calculation();
        }
         return total;
    }

    @Override
    public void show() {
        bags.forEach((obj)->{
            ((Articles)obj).show();
        });
    }
}
