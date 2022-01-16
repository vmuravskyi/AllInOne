package functional_reactive_programming_java.section12.terminal_collectors_1;

import functional_reactive_programming_java.section10.filter.Printer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src/main/java/functional_reactive_programming_java/section12/terminal_collectors_1/EmployeeData.txt");
        Stream<String> lines = Files.lines(path);
        Stream<String> words = lines.flatMap(s -> Arrays.stream(s.split(",")));
        Spliterator<String> wordSpliterator = words.spliterator();
        Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

        Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);
        List<Employee> employees = employeeStream.collect(Collectors.toList());

        List<Employee> employeeList = employees
                .stream()
                .collect(Collectors.toUnmodifiableList());

        List<String> employeeNames = employeeList
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        employeeNames.forEach(System.out::println);

        Map<String, String> employeeMap = new HashMap<>();

        employeeList.forEach(employee -> employeeMap.put(employee.getName(), employee.getDesignation()));
        Printer.print(employeeMap);
    }
}
