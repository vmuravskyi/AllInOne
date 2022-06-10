package reflections_and_annotation.section05_hibarnate_like_orm;

import reflections_and_annotation.section05_hibarnate_like_orm.annotations.Column;
import reflections_and_annotation.section05_hibarnate_like_orm.annotations.PrimaryKey;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Hibernate<T> {

    Connection con;

    private Hibernate() {
//        try {
//            this.con = DriverManager.getConnection("");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public static <T> Hibernate<T> getConnection() {
        return new Hibernate<T>();
    }

    public void write(T t) throws IllegalAccessException {
        Class<?> clazz = t.getClass();
        var declaredFields = clazz.getDeclaredFields();

        String primaryKey = "";

        List<Field> columns = new ArrayList<>();

        StringJoiner joiner = new StringJoiner(",");

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(PrimaryKey.class)) {
                primaryKey = field.getName();
                System.out.println("The Primary Key is: " + field.getName() + " value is: " + field.get(t));
            } else if (field.isAnnotationPresent(Column.class)) {
                joiner.add(field.getName());
                columns.add(field);
                System.out.println("The Column is: " + field.getName() + " value is: " + field.get(t));
            }
        }

        String sql = "insert into " + clazz.getSimpleName() + "( " +  + ") " + "values (" + +")";

    }
}
