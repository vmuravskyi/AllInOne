package epam.jdbc.dao;

import epam.jdbc.entity.BooksEntity;

import java.util.List;

public abstract class BooksDao extends AbstractDao<Long, BooksEntity> {

    public abstract List<BooksEntity> findBookByName(String patternName) throws DaoException;

}
