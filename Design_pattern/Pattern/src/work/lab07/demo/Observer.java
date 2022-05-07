package work.lab07.demo;


/**
 * Date: 2021/4/14 17:03
 */

public interface Observer {

    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(AllControlCenter acc);
}

