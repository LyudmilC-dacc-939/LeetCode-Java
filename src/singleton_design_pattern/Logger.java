package singleton_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private final List<String> logs;

    // Private constructor to prevent instantiation
    private Logger() {
        logs = new ArrayList<>();
    }

    // Static inner class - loaded only when getInstance() is called
    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    protected void log(String addMessage) {
        logs.add(addMessage);
    }

    public List<String> getLogs() {
        return logs;
    }

    //Alternatively:
    //import java.util.ArrayList;
    //import java.util.List;
    //
    //public class Logger {
    //    private static Logger instance;
    //    private final List<String> logs;
    //
    //    private Logger() {
    //        logs = new ArrayList<>();
    //    }
    //
    //    public static Logger getInstance() {
    //        if (instance == null) {
    //            instance = new Logger();
    //        }
    //        return instance;
    //    }
    //
    //    public void log(String message) {
    //        logs.add(message);
    //        System.out.println("Log added: " + message);
    //    }
    //
    //    public List<String> getLogs() {
    //        return logs;
    //    }
    //}

}
