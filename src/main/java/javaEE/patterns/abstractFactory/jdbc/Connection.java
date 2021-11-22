package javaEE.patterns.abstractFactory.jdbc;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;

public interface Connection {

    public Statement createStatement();

    public PreparedStatement prepareStatement(String sql);

    public CallableStatement prepareCall(String sql);

}
