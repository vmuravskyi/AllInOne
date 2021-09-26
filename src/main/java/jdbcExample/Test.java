package jdbcExample;

import java.sql.*;

public class Test {

    private static final String URL = System.getenv("JDBC_UBS_URL");
    private static final String USERNAME = System.getenv("JDBC_UBS_USERNAME");
    private static final String PASSWORD = System.getenv("JDBC_UBS_PASSWORD");
    private static Connection con = null;

    public static void main(String[] args) throws SQLException {

        // Load the driver
        con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        if (con != null) {
            System.out.println("Connection successful");
        } else {
            System.out.println("Connection error \n");
        }

        String query = "select * from orders where id=606;";

        ResultSet resultSet;
        PreparedStatement statement;

        statement = con.prepareStatement(query);
        resultSet = statement.executeQuery();
        int columnCount = resultSet.getMetaData().getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i < columnCount; i++) {
                System.out.print(resultSet.getString(i) + " * ");
            }
            System.out.println();
        }

        // Get address (index=2) from orders table
//        if (resultSet.next())
//            System.out.println(resultSet.getString(2));

        System.out.println("Before close");
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("Done");
    }
}
