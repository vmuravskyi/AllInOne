package Design_Patterns.creational.abstractfactory;

//Represents an abstract product
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
