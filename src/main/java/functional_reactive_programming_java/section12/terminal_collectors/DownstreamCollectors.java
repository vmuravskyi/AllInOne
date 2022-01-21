package functional_reactive_programming_java.section12.terminal_collectors;

import functional_reactive_programming_java.section10.filter.Printer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownstreamCollectors {

    public static void main(String[] args) throws IOException {

        Path path = Path.of(
            "src/main/java/functional_reactive_programming_java/section12/terminal_collectors/EmployeeData.txt");
        Stream<String> lines = Files.lines(path);
        Stream<String> words = lines.flatMap(s -> Arrays.stream(s.split(",")));
        Spliterator<String> wordSpliterator = words.spliterator();
        Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

        List<Employee> employeeList = StreamSupport.stream(employeeSpliterator, false)
            .collect(Collectors.toList());

        Printer.print("********************  GROUPING ***********************");
        Map<String, Long> countByDesignation = employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
        Printer.print(countByDesignation);

        Printer.print("*********************************************");

        Map<String, Double> fundDistribution = employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDesignation,
                Collectors.summingDouble(Employee::getSalary)));
        System.out.println(fundDistribution);

        Printer.print("*********************************************");

        Map<String, Optional<Double>> maxSalaries =
            employeeList.stream()
                .collect(
                    Collectors.groupingBy(
                        Employee::getDesignation,
                        Collectors.mapping(
                            Employee::getSalary,
                            Collectors.maxBy(Comparator.comparing(Function.identity()))
                        )
                    )
                );
        System.out.println(maxSalaries);
    }

}
