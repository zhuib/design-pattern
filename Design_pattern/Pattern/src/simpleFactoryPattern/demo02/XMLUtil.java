package simpleFactoryPattern.demo02;


import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;


public class XMLUtil {

    public static String getChartType() {
        String path = XMLUtil.class.getClassLoader().getResource("config.xml").getPath();
        System.out.println(path);
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;

//            doc = builder.parse(new File("src//simpleFactoryPattern//demo02//config.xml"));
            doc = builder.parse(new File(path));

            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
