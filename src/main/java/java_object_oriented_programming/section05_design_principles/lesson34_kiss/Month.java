package java_object_oriented_programming.section05_design_principles.lesson34_kiss;

import com.sun.javafx.iio.ImageLoadListener;

import java.util.ArrayList;
import java.util.List;

public class Month {

    public static void main(String[] args) {

        // violation of KISS principle
        String month = getMonth(3);
        System.out.println(month);

        // correct approach
        String month2 = getMonthName(4);
        System.out.println(month2);

    }

    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            // etc.
            default:
                throw new IllegalArgumentException("Incorrect input");
        }
    }

    public static String getMonthName(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Incorrect input");
        } else {
            String[] months = {"January", "February", "March", "April", "etc"};
            return months[month - 1];
        }
    }

}
