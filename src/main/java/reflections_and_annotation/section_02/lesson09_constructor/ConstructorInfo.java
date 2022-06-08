package reflections_and_annotation.section_02.lesson09_constructor;

import reflections_and_annotation.section_02.lesson07_fields.Entity;

import java.lang.reflect.Constructor;

public class ConstructorInfo {

    public static void main(String[] args) throws Exception {

        Class<?> clss = Class.forName("reflections_and_annotation.section_02.lesson07_fields.Entity");
        Constructor<?>[] constructors = clss.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor); // print public constructors & their arguments only of this class
        }

        System.out.println("----------------------------------------------------------------------------------");

        Constructor<?>[] declaredConstructors = clss.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor); // get all (private and public) constructors of this class
        }

        System.out.println("----------------------------------------------------------------------------------");

        Constructor<?> publicConstructor = clss.getConstructor(int.class, String.class); // get constructor instance by sending constructor's args as params
        System.out.println(publicConstructor);

        Entity studentId = (Entity) publicConstructor.newInstance(10, "StudentId"); // create new instance from 'Constructor' instance
        System.out.println(studentId.getVal() + " : " + studentId.getType());

        Constructor<?> privateConstructor = clss.getDeclaredConstructor(); // get private constructor
        privateConstructor.setAccessible(true);
        Entity privateConstInstance = (Entity) privateConstructor.newInstance();
        System.out.println(privateConstInstance.getVal() + " : " + privateConstInstance.getType());

        System.out.println("----------------------------------------------------------------------------------");


    }

}
