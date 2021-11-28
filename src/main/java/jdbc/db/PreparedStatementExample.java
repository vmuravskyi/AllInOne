package jdbc.db;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.Properties;

public class PreparedStatementExample {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "pass";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/datatest";
    private static final String SQL_INSERT = "insert into books (id, name) values (?, ?)";


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

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, prop);
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setInt(1, 33);
            preparedStatement.setString(2, "BookNumber33");
            int rowsUpdated = preparedStatement.executeUpdate();
            LOGGER.log(Level.INFO, "{} rows have been updated", rowsUpdated);
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Count not connect to database");
            e.printStackTrace();
        }

    }
}
