package reflections_and_annotation.section02_reflections.lesson04_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyClass {

    private MyClass() {
        System.out.println("MyClass is created");
    }

}

public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        MyClass obj = new MyClass();
        Class<?> clss = Class.forName("reflections_and_annotation.section02_reflections.lesson04_reflection.MyClass");
        Constructor<?> declaredConstructor = clss.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        MyClass instance = (MyClass) declaredConstructor.newInstance();


        // 3 way to get .class object to get class metadata
        Class<?> clss1 = Class.forName("reflections_and_annotation.section02_reflections.lesson04_reflection.ClassDemo");
        Class<ClassDemo> clss2 = ClassDemo.class;
        Class<? extends ClassDemo> clss3 = new ClassDemo().getClass();
    }

}
