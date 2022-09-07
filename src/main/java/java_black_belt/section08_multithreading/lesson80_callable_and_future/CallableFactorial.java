package java_black_belt.section08_multithreading.lesson80_callable_and_future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get result");
            factorialResult = future.get();
            System.out.println("Got the result");
            System.out.println(future.isDone());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);

    }


}

class Factorial2 implements Callable<Integer> {

    Integer f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws IllegalArgumentException, InterruptedException {
        if (f <= 0) {
            throw new IllegalArgumentException("Cannot be 0 or negative");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }

}
