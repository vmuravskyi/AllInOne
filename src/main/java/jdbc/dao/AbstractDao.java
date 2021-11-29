package jdbc.dao;

import jdbc.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDao<K, T extends Entity> {

    protected Connection connection;

    public abstract List<T> findAll() throws DaoException;
    public abstract T findEntityById(K id);
    public abstract boolean delete (T t);
    public abstract boolean deleteByKey(K id);
    public abstract boolean create(T t);
    public abstract T update(T t);

    public void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close (Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void setConnection (Connection connection) {
        this.connection = connection;
    }
}
