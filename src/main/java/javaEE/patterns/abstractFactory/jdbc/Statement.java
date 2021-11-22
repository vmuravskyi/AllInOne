package javaEE.patterns.abstractFactory.jdbc;


public interface Statement {

    public ResultSet executeQuery(String sql);
}
