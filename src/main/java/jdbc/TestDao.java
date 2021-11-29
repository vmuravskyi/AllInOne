package jdbc;

import jdbc.dao.impl.BookDaoImpl;
import jdbc.dao.DaoException;
import jdbc.dao.impl.EcoNewsImpl;
import jdbc.entity.BooksEntity;

import java.util.List;
import jdbc.entity.EcoNewsEntity;

public class TestDao {
    public static void main(String[] args) throws DaoException {
        EcoNewsImpl ecoNewsImpl = new EcoNewsImpl();
//        List<EcoNewsEntity> ecoNewsEntities = ecoNewsImpl.findAll();
//        System.out.println(ecoNewsEntities);
//        System.out.println();

        EcoNewsEntity ecoNewsEntity = ecoNewsImpl.findEntityById(13638);
        System.out.println(ecoNewsEntity);
    }
}
