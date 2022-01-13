package functional_reactive_programming_java.section10.parallel;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {

        long startTime;
        long endTime;

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Employee("John", 20000));
            list.add(new Employee("Rohn", 3000));
            list.add(new Employee("Tom", 15000));
            list.add(new Employee("Bheem", 8000));
            list.add(new Employee("Shiva", 200));
            list.add(new Employee("Krishna", 50000));
        }

        // Sequential
        startTime = System.currentTimeMillis();

        long count = list.stream()
            .filter(employee -> employee.getSalary() > 1000)
            .count();
        Printer.print("Performing sequential " + count);

        endTime = System.currentTimeMillis();
        Printer.print("Time taken with sequential " + (endTime - startTime));

        // Parallel
        startTime = System.currentTimeMillis();

        count = list.stream()
            .parallel()
            .filter(employee -> employee.getSalary() > 1000)
            .count();
        Printer.print("Performing parallel " + count);

        endTime = System.currentTimeMillis();
        Printer.print("Time taken with parallel " + (endTime - startTime));

    }

}
