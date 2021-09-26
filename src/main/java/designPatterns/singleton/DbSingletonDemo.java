package designPatterns.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(instance == anotherInstance);
    }
}
