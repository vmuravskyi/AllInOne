package reflections_and_annotation.section02_reflections.lesson07_fields;

import java.lang.reflect.Field;
import java.util.Arrays;

public class FieldInfo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Entity entity = new Entity(10, "id");
        Class<? extends Entity> clss = entity.getClass();

        Field[] fields = clss.getFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

        Field[] declaredFields = clss.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> System.out.println(field.getName()));

        // non-declared fields: all the public elements in that class and its super class
        // declared: all the elements present in the class only

        Field type = clss.getField("type");
//        Field val = clss.getField("val"); -> Exception, because 'val' field is private
        Field val = clss.getDeclaredField("val");
        type.set(entity, "rollNo.");

//        val.set(entity, 123); Exception, because cannot set value to private field. Should make the field accessible first
        val.setAccessible(true);
        val.set(entity, 123);

        System.out.println(entity.getType());
        System.out.println(entity.getVal());

    }

}
