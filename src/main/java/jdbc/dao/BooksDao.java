package jdbc.dao;

import jdbc.entity.BooksEntity;

import java.util.List;

public interface BooksDao extends BaseDao <Long, BooksEntity>{
    List<BooksEntity> findBookByName(String patternName) throws DaoException;
}
