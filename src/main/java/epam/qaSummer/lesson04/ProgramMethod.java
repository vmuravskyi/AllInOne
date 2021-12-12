package epam.qaSummer.lesson04;

import epam.qaSummer.lesson04.util.MethodUtil;
import epam.qaSummer.lesson04.util.MyAB;

import java.util.Arrays;

public class ProgramMethod {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        MethodUtil.swap(a, b);
        System.out.println("After a = " + a + ", b= " + b);
        int[] arr = {a, b};
        System.out.println("Before swap arr = " + Arrays.toString(arr));
        MethodUtil.swap(arr);
        System.out.println("After swap arr = " + Arrays.toString(arr));
        MethodUtil.addElem(arr);
        System.out.println("After addElem arr = " + Arrays.toString(arr));
        arr = MethodUtil.getAddElem(arr);
        arr = Arrays.copyOf(arr, arr.length + 1); // То саме тільки через готовий метод
        System.out.println("After getAddElem arr = " + Arrays.toString(arr));


        MyAB myAB = new MyAB();
        myAB.a = 30;
        myAB.b = 45;
        MethodUtil.swap(myAB);
        System.out.println("After swap myAB: a = " + myAB.a + " b = " + myAB.b);
    }
}
