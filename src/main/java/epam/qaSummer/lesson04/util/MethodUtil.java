package epam.qaSummer.lesson04.util;

import java.util.Arrays;

public class MethodUtil {
     public static void swap(MyAB myAB) {
        int temp = myAB.a;
        myAB.a = myAB.b;
        myAB.b = temp;
    }

    public static void swap(int a, int b) {
        System.out.println("Before in method a = " + a + ", b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After in method a = " + a + ", b= " + b);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void addElem(int[] arr) {
        System.out.println("Before inside addElem arr = " + Arrays.toString(arr));
        int[] tempArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        arr[2] = 50;
        System.out.println("After inside addElem arr = " + Arrays.toString(arr));
    }

    public static int[] getAddElem(int[] arr) {
        System.out.println("Before inside getAddElem arr = " + Arrays.toString(arr));
        int[] tempArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        arr[2] = 50;
        System.out.println("After inside getAddElem arr = " + Arrays.toString(arr));
        return arr;
    }
}
