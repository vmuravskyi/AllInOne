package Functional_Reactive_programming.generics;

import org.openqa.selenium.WebElement;

public class GenericMethodDemo {

    public static <T> String concat(T data) {
        return "Data is: " + data;
    }

    public static void main(String[] args) {

        System.out.println(concat("Hello"));
        System.out.println(concat(123));

    }

}
