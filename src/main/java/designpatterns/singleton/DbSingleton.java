package designpatterns.singleton;

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
