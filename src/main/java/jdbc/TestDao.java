package jdbc;

import jdbc.dao.impl.BookDaoImpl;
import jdbc.dao.DaoException;
import jdbc.entity.BooksEntity;

import java.util.List;

public class TestDao {
    public static void main(String[] args) throws DaoException {
        BookDaoImpl bookDao = new BookDaoImpl();
        List<BooksEntity> bookByName = bookDao.findBookByName("Java");
        System.out.println(bookByName);
        System.out.println();

        List<BooksEntity> books = bookDao.findAll();
        System.out.println(books);
    }
}
