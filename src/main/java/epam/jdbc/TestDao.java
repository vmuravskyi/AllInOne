package epam.jdbc;

import epam.jdbc.dao.impl.EcoNewsImpl;
import epam.jdbc.entity.EcoNewsEntity;
import epam.jdbc.dao.DaoException;

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
