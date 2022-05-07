package work.lab03.demo02;

/**
 * Date: 2021/3/17 17:18
 */
public class ProtoTypeCitation {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三", "软件系", "华软");
        citation.display();
        System.out.println("hash值：" + citation.hashCode());
        Citation  clone = (Citation) citation.clone();
        clone.setName("李四");
        clone.display();
        System.out.println("hash值：" + clone.hashCode());
    }
}
