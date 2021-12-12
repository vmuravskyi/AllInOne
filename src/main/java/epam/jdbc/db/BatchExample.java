package epam.jdbc.db;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchExample {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "pass";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/datatest";


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.ERROR, "Could not initiate mysql driver");
            e.printStackTrace();
        }

        Properties prop = new Properties();
        prop.put("user", USER_NAME);
        prop.put("password", PASSWORD);
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");

        Connection connection = null;
        Statement statement;
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, prop);
            statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.addBatch("insert into books values (11, 'SomeBook')");
            statement.addBatch("insert into locations values (1, 'Lviv')");
            statement.addBatch("insert into locations values (2, 'Kyiv')");
            int[] updateCounts = statement.executeBatch();
            connection.commit();
            LOGGER.log(Level.INFO, "Batch queries {} committed", updateCounts);
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    LOGGER.log(Level.ERROR, "Failed to rollback commit");
                    ex.printStackTrace();
                }
            }
            LOGGER.log(Level.ERROR, "Count not connect to database");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
