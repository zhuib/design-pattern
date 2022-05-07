package simpleFactoryPattern.demo02;

public class Client {

    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
