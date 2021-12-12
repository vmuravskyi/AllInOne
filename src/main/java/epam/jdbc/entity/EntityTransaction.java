package epam.jdbc.entity;

import java.sql.Connection;
import java.sql.SQLException;

import epam.jdbc.dao.AbstractDao;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityTransaction {

    public static final Logger LOGGER = LogManager.getLogger();

    private Connection connection;

    public void begin(AbstractDao dao, AbstractDao... daos) {
        if (connection == null) {
//            connection = // take connection
        }
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Failed to set AutoCommit: true -> false");
        }
        dao.setConnection(connection);
        for (AbstractDao daoElement : daos) {
            daoElement.setConnection(connection);
        }
    }

    public void end() {
        if (connection != null) {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                LOGGER.log(Level.ERROR, "Failed to set AutoCommit: false -> true");
                e.printStackTrace();
            }
        }
        connection = null;
    }

    public void commit() {
        try {
            connection.commit();
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Failed to commit transaction");
            e.printStackTrace();
        }
    }

    public void rollBack() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Failed to rollback commit ");
            e.printStackTrace();
        }
    }

}
