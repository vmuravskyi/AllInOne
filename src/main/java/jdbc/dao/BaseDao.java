package jdbc.dao;

import jdbc.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface BaseDao <K, T extends Entity> {
    List<T> findAll() throws DaoException;
    T findEntityById(K id);
    boolean delete (T t);
    boolean deleteByKey(K id);
    boolean create(T t);
    T update(T t);

    default void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    default void close (Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
