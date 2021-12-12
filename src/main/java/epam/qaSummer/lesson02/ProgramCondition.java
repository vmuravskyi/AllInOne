package epam.qaSummer.lesson02;

import java.util.Scanner;

public class ProgramCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        int choice = 0;
        do {
            System.out.println("1. Sum");
            System.out.println("2. Multiply");
            System.out.println("3. Devide");
            System.out.println("4. Subtract");
            System.out.println("5. Count x");
            System.out.println("6. Count y");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            double result = getResult(x, y, choice);
            System.out.println(result);
        } while (choice != 0);

    }

    private static double getResult(int x, int y, int choice) {
        double result = 0;
        switch (choice) {
            case 1:
                result = (x + y);
                break;
            case 2:
                result = (x * y);
                break;
            case 3:
                result = ((double) x / y);
                break;
            case 4:
                result = (x - y);
                break;
            case 5:
                System.out.println("Count of numbers = " + getCount(x));
                break;
            case 6:
                System.out.println("Count of numbers = " + getCount(y));
                break;
            default:
                System.out.println("Exit");
        }
        return result;
    }

    private static int getCount(int x) {
        if (x < 0) {
            x = Math.abs(x);
        } else if (x == 0){
            System.out.println("Тут одна цифра вася");
        }
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }
}
