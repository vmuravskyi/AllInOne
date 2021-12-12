package epam.jdbc.dao.impl;

import epam.jdbc.dao.DaoException;
import epam.jdbc.dao.EcoNewsDao;
import epam.jdbc.entity.EcoNewsEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EcoNewsImpl extends EcoNewsDao {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String USER_NAME = "";
    private static final String PASSWORD = "";
    private static final String CONNECTION_URL =
            "";
    private static final String SQL_SELECT_ALL_ECONEWS =
            "select * from eco_news";
    private static final String SQL_SELECT_ECONEWS_BY_ID =
            "select * from eco_news where id =?";
    private final List<EcoNewsEntity> ecoNewsEntities = new ArrayList<>();
    private PreparedStatement statement = null;
    private ResultSet resultSet;

    @Override
    public List<EcoNewsEntity> findAll() throws DaoException {
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.prepareStatement(SQL_SELECT_ALL_ECONEWS);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                EcoNewsEntity ecoNewsEntity = new EcoNewsEntity();
                setEcoNewsEntity(ecoNewsEntity);
                ecoNewsEntities.add(ecoNewsEntity);
                ecoNewsEntities.add(ecoNewsEntity);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Could not execute query");
            throw new DaoException(e);
        } finally {
            close(statement);
            close(connection);
        }
        return ecoNewsEntities;
    }


    @Override
    public EcoNewsEntity findEntityById(Long id) throws DaoException {
        return null;
    }

    public EcoNewsEntity findEntityById(long id) throws DaoException {
        EcoNewsEntity ecoNewsEntity = new EcoNewsEntity();

        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.prepareStatement(SQL_SELECT_ECONEWS_BY_ID);
            statement.setLong(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                setEcoNewsEntity(ecoNewsEntity);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Could not execute query");
            throw new DaoException(e);
        } finally {
            close(statement);
            close(connection);
        }
        return ecoNewsEntity;
    }

    @Override
    public boolean delete(EcoNewsEntity ecoNewsEntity) {
        return false;
    }

    @Override
    public boolean deleteByKey(Long id) {
        return false;
    }

    @Override
    public boolean create(EcoNewsEntity ecoNewsEntity) {
        return false;
    }

    @Override
    public EcoNewsEntity update(EcoNewsEntity ecoNewsEntity) {
        return null;
    }

    private void setEcoNewsEntity(EcoNewsEntity ecoNewsEntity) throws SQLException {
        ecoNewsEntity.setId(resultSet.getInt("id"));
        ecoNewsEntity.setCreationDate(resultSet.getString("creation_date"));
        ecoNewsEntity.setImagePath(resultSet.getString("image_path"));
        ecoNewsEntity.setAuthorId(resultSet.getInt("author_id"));
        ecoNewsEntity.setText(resultSet.getString("text"));
        ecoNewsEntity.setTitle(resultSet.getString("title"));
        ecoNewsEntity.setSource(resultSet.getString("source"));
    }

}
