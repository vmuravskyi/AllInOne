//package javaEE.patterns.abstractFactory.jdbc;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DriverManager {
//
//
//    private static List<Driver> drivers = new ArrayList<>();
//
//    public synchronized static Connection getConnection(String url) throws SQLException {
//        for (Driver driver : drivers) {
//            if (driver.acceptsUrl(url)) {
//                return driver.connect(url);
//            }
//        }
//        throw new SQLException("Couldn't accept url");
//    }
//
//    public synchronized static void registerDriver(Driver driver) {
//        drivers.add(driver);
//    }
//}
