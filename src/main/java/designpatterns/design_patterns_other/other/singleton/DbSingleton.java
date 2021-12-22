package designpatterns.design_patterns_other.other.singleton;

public class DbSingleton {
    private static DbSingleton instance = null;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
