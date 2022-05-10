package old.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person person = new Person();


        Class personClass = Person.class;
//        Class personClass2 = personClass.getClass();
//        Class personClass3 = Class.forName("Person");

        List<Field> fields = List.of(personClass.getDeclaredFields()); // get private fields
        List<Method> methods = List.of(personClass.getMethods()); // get methods of Class

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("----------------------------------");

        for (Method method : methods) {
            System.out.println("Method name: " + method.getName()
                    + "\nReturn type: " + method.getReturnType()
                    + "\nParameter types: " + Arrays.toString(method.getParameterTypes()));
            System.out.println();
        }


    }
}
