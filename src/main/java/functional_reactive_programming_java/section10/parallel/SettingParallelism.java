package functional_reactive_programming_java.section10.parallel;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");

        System.out.println(ForkJoinPool.getCommonPoolParallelism());

        ForkJoinPool pool = new ForkJoinPool(2);

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Employee("John", 20000));
            list.add(new Employee("Rohn", 3000));
            list.add(new Employee("Tom", 15000));
            list.add(new Employee("Bheem", 8000));
            list.add(new Employee("Shiva", 200));
            list.add(new Employee("Krishna", 50000));
        }

        long count = pool.submit(() -> list
            .parallelStream()
            .filter(employee -> employee.getSalary() > 1000)
            .count()).get();

        Printer.print(count);

    }

}
