package singleton_design_pattern;

public class SingletonDesignPattern {

    //1. Singleton Design Pattern
    //Problem:
    //Design a Logger class that ensures only one instance is created.
    // It should have methods like log(message: str) to add logs and getLogs() -> List[str] to return all logs.

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Check if both references point to the same object
        System.out.println("Are both instances the same? " + (logger1 == logger2));

        System.out.println("Logs:");
        for (String log : logger1.getLogs()) {
            System.out.println(log);
        }
        for (String log : logger2.getLogs()) {
            System.out.println(log);
        }
    }
}
