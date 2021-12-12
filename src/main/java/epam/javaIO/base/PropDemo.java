package epam.javaIO.base;

import java.util.Properties;

public class PropDemo {
    public static void main(String[] args) {

        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}