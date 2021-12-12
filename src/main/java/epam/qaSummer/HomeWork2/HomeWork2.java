package epam.qaSummer.HomeWork2;

public class HomeWork2 {
    private HomeWork2() {
    }

    public static int task1(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Positive numbers");
        }
        int k = 0;
        for (; n > 0; n /= 10) {
            int z = n % 10;
            if (z % 2 == 1) {
                k = k + z;
            }
        }
        return k;
    }
//    public static int task1(int n) {
//        if (n <= 0) throw new IllegalArgumentException();
//        int count = countNumberOfCyfra(n);
//        int[] arr = putNumbersIntoArray(n, count);
//        int[] reverseArr = reverseToNormal(arr);
//        return getSumOfOdds(reverseArr);
//    }

    private static int countNumberOfCyfra(int n) {
        int count = 0;
        int n1 = n;
        while (n1 > 0) {
            n1 /= 10;
            count++;
        }
        return count;
    }

    private static int[] putNumbersIntoArray(int n, int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++, n = n / 10) {
            arr[i] = n % 10;
        }
        return arr;
    }

    private static int[] reverseToNormal(int[] arr) {
        int[] reverseArr = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[k] = arr[i];
            k++;
        }
        return reverseArr;
    }

    private static int getSumOfOdds(int[] reverseArr) {
        int sum = 0;
        for (int i = 0; i < reverseArr.length; i++) {
            int cyfra = reverseArr[i];
            if (cyfra == 1) {
                sum = sum + reverseArr[i];
            }
            while (cyfra > 2) {
                cyfra = cyfra % 2;
                if (cyfra == 1) {
                    sum = sum + reverseArr[i];
                }
            }
        }
        return sum;
    }


    public static int task2(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int res = 0;
        while (n > 0) {
            int j = n % 2;
            n >>= 1;
            if (j > 0) {
                res++;
            }
        }
        return res;
    }

    public static int task3(int n) {
        if (n > 1) {
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;

            return fibonacciSum(n, arr);
        } else if (n == 1) {
            return 0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static int fibonacciSum(int n, int[] arr) {
        int sum = arr[0] + arr[1];

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(task1(35791));

        System.out.println(task2(1));

        System.out.println(task3(22));
    }
}
