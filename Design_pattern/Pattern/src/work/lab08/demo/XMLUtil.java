package work.lab08.demo;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XMLUtil {

    public static Object getBean() {

        String path = XMLUtil.class.getClassLoader().getResource("config.xml").getPath();
        try {
//            创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));
            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            // 遍历所有
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue().trim();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
