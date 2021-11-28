package jdbc.dao.impl;

import jdbc.dao.BooksDao;
import jdbc.dao.DaoException;
import jdbc.entity.BooksEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BooksDao {

    public static final Logger LOGGER = LogManager.getLogger();
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "pass";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/datatest";
    private static final String SQL_SELECT_ALL_BOOKS =
            "select * from books";
    private static final String SQL_SELECT_BOOK_BY_NAME =
            "select * from books where name =?";

    @Override
    public List<BooksEntity> findBookByName(String patternName) throws DaoException {
        List<BooksEntity> books = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.prepareStatement(SQL_SELECT_BOOK_BY_NAME);
            statement.setString(1, patternName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                BooksEntity booksEntity = new BooksEntity();
                booksEntity.setId(resultSet.getInt("id"));
                booksEntity.setName(resultSet.getString("name"));
                books.add(booksEntity);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Could not execute query");
            throw new DaoException(e);
        } finally {
            close(statement);
            close(connection);
        }
        return books;
    }

    @Override
    public List<BooksEntity> findAll() throws DaoException {
        List<BooksEntity> books = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_BOOKS);
            while (resultSet.next()) {
                BooksEntity booksEntity = new BooksEntity();
                booksEntity.setId(resultSet.getInt("id"));
                booksEntity.setName(resultSet.getString("name"));
                books.add(booksEntity);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.ERROR, "Could not execute query");
            throw new DaoException(e);
        } finally {
            close(statement);
            close(connection);
        }
        return books;
    }

    @Override
    public BooksEntity findEntityById(Long id) {
        return null;
    }

    @Override
    public boolean delete(BooksEntity booksEntity) {
        return false;
    }

    @Override
    public boolean deleteByKey(Long id) {
        return false;
    }

    @Override
    public boolean create(BooksEntity booksEntity) {
        return false;
    }

    @Override
    public BooksEntity update(BooksEntity booksEntity) {
        return null;
    }

}
