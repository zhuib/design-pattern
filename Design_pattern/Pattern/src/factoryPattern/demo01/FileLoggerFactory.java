package factoryPattern.demo01;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 创建文件日志记录器对象
        FileLogger logger = new FileLogger();
        // 创建文件，代码省略
        return logger;
    }
}
