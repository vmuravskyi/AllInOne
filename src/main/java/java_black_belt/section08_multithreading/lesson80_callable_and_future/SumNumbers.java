package java_black_belt.section08_multithreading.lesson80_callable_and_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {

    private static long value = 1_000_000_000;
    private static long sum = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long timeBefore = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureList = new ArrayList<>();
        long valueDividedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            Future<Long> partialResult = executorService.submit(new PartialSum(from, to));
            futureList.add(partialResult);
        }
        for (Future<Long> partialResult : futureList) {
            sum += partialResult.get();
        }
        executorService.shutdown();
        System.out.println("Total sum: " + sum);

        long timeAfter = System.currentTimeMillis();
        System.out.println("Time was: " + (timeAfter - timeBefore));
    }

}

class PartialSum implements Callable<Long> {

    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.printf("Sum from %d to %d = %d%n", from, to, localSum);
        return localSum;
    }

}
