package epam.qaSummer.Trash;

public class task3 {
    public static int task3(int n) {
	if (n <= 0)
	    return 0;

	int[] arr = new int[n];
	arr[0] = 0;
	arr[1] = 1;

	return FibonacciSum(n, arr);
    }

    private static int FibonacciSum(int n, int[] arr) {
	int sum = arr[0] + arr[1];

	for (int i = 2; i < n; i++) {
	    arr[i] = arr[i - 1] + arr[i - 2];
	    sum += arr[i];
	}
	return sum;
    }

//    private static int countOfCyfra(int n) {
//        int count = 0;
//        int n1 = n;
//        while (n1 > 0) {
//            n1 /= 10;
//            count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {
	System.out.println(task3(10));
    }
}
