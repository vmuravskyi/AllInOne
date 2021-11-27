package jdbc;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

    private static final Logger LOGGER = LogManager.getLogger();
    private static String USER_NAME = "root";
    private static String PASSWORD = "pass";
    private static String CONNECTION_URL = "jdbc:mysql://localhost:3306";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            LOGGER.log(Level.DEBUG, "Successfully used jdbc driver");
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.ERROR, "Could not find mysql driver");
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD)) {
            LOGGER.log(Level.DEBUG, "Successfully connected to database");
        } catch (SQLException throwables) {
            LOGGER.log(Level.ERROR, "Could not connect to database");
            throwables.printStackTrace();
        }

    }

}
