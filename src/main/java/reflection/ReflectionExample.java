package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        // name_class1 name_class2 name_of_method
        Class classObj1 = Class.forName(scanner.next());
        Class classObj2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObj1.getMethod(methodName, classObj2);
        Object o1 = classObj1.newInstance();
        Object o2 = classObj2.getConstructor(String.class).newInstance("String value");


        m.invoke(o1, o2);
        System.out.println(o1);
    }
}
