package java_object_oriented_programming.section05_design_principles.lesson42_dependency_inversion_principle;

interface iLogger {

    public void logInfo(String info);

}

class Logger implements iLogger {

    @Override
    public void logInfo(String log) {
        System.out.println(log);
    }

}

class LoggingToFile {

    private final iLogger logger;

    public LoggingToFile(iLogger logger) {
        this.logger = logger;
    }

    public void logging() {
        logger.logInfo("Printing logs to the file");
    }

}

class LoggingToDb {

    private final iLogger logger;

    public LoggingToDb(iLogger logger) {
        this.logger = logger;
    }

    public void logging() {
        logger.logInfo("Saving logs to the database");
    }

}

public class DipExecutor {

    public static void main(String[] args) {

        LoggingToFile loggingToFile = new LoggingToFile(new Logger());
        loggingToFile.logging();

        LoggingToDb loggingToDb = new LoggingToDb(new Logger());
        loggingToDb.logging();

    }

}
