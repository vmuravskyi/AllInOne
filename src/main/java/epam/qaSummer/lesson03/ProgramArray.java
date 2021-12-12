package epam.qaSummer.lesson03;

import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {

//        int n = 1234567890;
//        int [] mas = FillMasCyfraOfValue(n);
//        printMas(mas);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        while (true){
            if (count == arr.length){
                System.out.println("Array is full");
                break;
            }
            System.out.println("Enter value :");
            arr[count] = sc.nextInt();
            count++;
            System.out.println("Enter again [y]");
            String answer= sc.next();
            if (!(answer.equals("y") || !answer.equals("Y"))){
                break;
            }
            printMas(arr);
        }


    }

    private static int[] FillMasCyfraOfValue(int n) {
        int [] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = n%10;
            n = n/10;
        }
        return mas;
    }

    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas["+i+"]= "+ mas[i]);
        }
    }
}
