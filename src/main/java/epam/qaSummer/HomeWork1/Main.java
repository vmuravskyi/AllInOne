package epam.qaSummer.HomeWork1;

public class Main {

    public static int task2(int n) {
        // hashed array to store count of digits
        int count[] = new int[100];

        // Converting given number to string
        String str = Integer.toString(n);

        // Updating the count array
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - '0']++;

        // result is to store the final number
        int result = 0, multiplier = 1;

        // Traversing the count array
        // to calculate the maximum number
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }
        // return the result
        return result;
    }

    public static void main(String[] args) {
        int res = task2(984);
        System.out.println(res);
    }

}


//    public static int task1(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n > 0) {
//            return n * n;
//        } else return Math.abs(n);
//    }
//
//
//
//
//    public static void main(String[] args) {
//
//        int result = task1(0);
//        System.out.println(result);
//    }
