package work.lab05.demo02;

/**
 * Date: 2021/3/31 23:18
 */
public class Client {
    public static void main(String args[]) {

        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("pattern/src/work/lab05/demo02/src.txt","pattern/src/work/lab05/demo02/des.txt");
    }
}
