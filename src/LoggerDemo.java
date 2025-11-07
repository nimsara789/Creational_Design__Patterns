class Logger {
    private static Logger instance = new Logger(); // only one instance

    private Logger() {} // private constructor

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

public class LoggerDemo {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();
        a.log("Hello");
        b.log("World");
        System.out.println(a == b); // true
    }
}