package factoryPattern.demo01;

public class Client {

    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); // 可引入配置文件和反射机制实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
