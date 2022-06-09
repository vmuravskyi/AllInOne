package reflections_and_annotation.section02_reflections.lesson05_class_object;

class MyClass {

    public MyClass() {
        System.out.println("My class is created");
    }

}

public class GettingClassObject {

    public static void main(String[] args) throws ClassNotFoundException {

        // forName()
        Class<?> class1 = Class.forName("java.lang.String");
        Class<?> class2 = Class.forName("java.lang.String");

        System.out.println(class1 == class2); // true

        // Classname.class
        Class<?> intClass = int.class;
        Class<Void> voidClass = void.class;

        // obj.getClass()
        MyClass m = new MyClass();
        Class<? extends MyClass> myClass1 = m.getClass();

        // super class &  interfaces
        Class<?> superclass = myClass1.getSuperclass();
        Class<?>[] interfaces = myClass1.getInterfaces();

        // getName()
        System.out.println(myClass1.getName());

    }
}
