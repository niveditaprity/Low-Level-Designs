package Design_Pattern.Creational.Singleton;

public class Logger {
    public static Logger logger;
    public static Logger getInstance() {
        if(logger == null) {
            return new Logger();
        }
        return logger;
    }
    public void log(String message) {
        System.out.println("Log: "+message);
    }
}
