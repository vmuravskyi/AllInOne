package functional_reactive_programming_java.section08.tail_call_optimization;

public class TailCallOptimization {

    public static void main(String[] args) {

        System.out.println(recursiveFactorial(4));
    }

    public static long recursiveFactorial(int n) {
        if (n <= 1) return 1;
        else
            return n * recursiveFactorial(n - 1);
    }

    public static long tailRecursiveFactorial(int n, int a) {
        if (n <= 1) return 1;
        else
            return tailRecursiveFactorial(n - 1, n * a);
    }

}
