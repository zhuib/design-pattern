package work.lab07.demo02;

import java.util.Scanner;

/**
 * Date: 2021/4/14 18:02
 */
public class Client {

    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        context.add(78);
        context.add(-48);
        context.add(98);
        context.add(-58);
        context.add(-28);
        context.add(18);
    }
}
