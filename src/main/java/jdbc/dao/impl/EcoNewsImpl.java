package jdbc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.dao.DaoException;
import jdbc.dao.EcoNewsDao;
import jdbc.entity.EcoNewsEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EcoNewsImpl extends EcoNewsDao {

    private static final Logger LOGGER = LogManager.getLogger();

    private final String USER_NAME = "";
    private final String PASSWORD = "";
    private final String CONNECTION_URL = "";
    private final String SQL_SELECT_ALL_ECONEWS =
        "select * from eco_news";
    private final String SQL_SELECT_BOOK_BY_ID =
        "select * from eco_news where id =?";

    @Override
    public List<EcoNewsEntity> findAll() throws DaoException {
        List<EcoNewsEntity> ecoNewsEntities = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.prepareStatement(SQL_SELECT_ALL_ECONEWS);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                EcoNewsEntity ecoNewsEntity = new EcoNewsEntity();
                ecoNewsEntity.setId(resultSet.getInt("id"));
                ecoNewsEntity.setCreationDate(resultSet.getString("creation_date"));
                ecoNewsEntity.setImagePath(resultSet.getString("image_path"));
                ecoNewsEntity.setAuthorId(resultSet.getInt("author_id"));
                ecoNewsEntity.setText(resultSet.getString("text"));
                ecoNewsEntity.setTitle(resultSet.getString("title"));
                ecoNewsEntity.setSource(resultSet.getString("source"));
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
    public EcoNewsEntity findEntityById(Long id) {
        return null;
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

}
