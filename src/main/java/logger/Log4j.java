package logger;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.log(Level.ERROR, "This is an error");
    }

}
