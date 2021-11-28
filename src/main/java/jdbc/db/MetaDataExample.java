package jdbc.db;

import jdbc.entity.BooksEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MetaDataExample {
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

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, prop);
             Statement statement = connection.createStatement()) {
            LOGGER.log(Level.INFO, "Executed query successfully");
            String sqlSelect = "Select * from books";
            ResultSet resultSet = statement.executeQuery(sqlSelect);
            List<BooksEntity> books = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                books.add(new BooksEntity(id, name));
            }

            // MetaData
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            System.out.println(rsMetaData.getColumnCount());
            System.out.println(rsMetaData.getColumnName(2));
            System.out.println(rsMetaData.getColumnType(1));
            System.out.println(rsMetaData.getColumnTypeName(2));
            System.out.println(rsMetaData.getTableName(1));

            System.out.println();
            // DataBase MetaData
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println(dbMetaData.getDatabaseProductName());
            System.out.println(dbMetaData.getDatabaseProductVersion());
            System.out.println(dbMetaData.getUserName());
            System.out.println(dbMetaData.getURL());
            System.out.println(dbMetaData.getCatalogs());

            System.out.println(books);
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Count not connect to database");
            e.printStackTrace();
        }

    }
}
