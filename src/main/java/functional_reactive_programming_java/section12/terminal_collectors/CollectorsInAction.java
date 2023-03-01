package functional_reactive_programming_java.section12.terminal_collectors;

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

        Path path = Path.of(
                "src/main/java/functional_reactive_programming_java/section12/terminal_collectors/EmployeeData.txt");
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
        employeeNames.forEach(Printer::print);

        Printer.print("********************  get designations ***********************");
        // get designations
        Set<String> designations = employeeList.stream()
                .map(Employee::getDesignation)
                .collect(Collectors.toUnmodifiableSet());
        Printer.print(designations);

        Printer.print("********************  toMap Collector ***********************");
        // toMap Collector
        Map<String, String> toMapCollector = employeeList.stream()
                .collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getDesignation()));
        Printer.print(toMapCollector);

        Printer.print(
                "********************  Collectors to new TreeMap to get a sorted collection ***********************");
        // Collectors to new TreeMap to get a sorted collection
        TreeSet<Employee> employeeSorted = new TreeSet<>(employeeList);
        for (Employee employee : employeeSorted) {
            Printer.print(employee);
        }

        Printer.print("********************  SORTED ***********************");

        LinkedList<Employee> collected = employeeSorted.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toCollection(LinkedList::new));
        for (Employee employee : collected) {
            Printer.print(employee);
        }

        Printer.print("********************  PARTITIONED ***********************");

        Map<Boolean, List<Employee>> partitioned = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getGender() == 'M'));
        partitioned.entrySet().forEach(Printer::print);
        List<Employee> employeesMale = partitioned.get(true); // get only Male employees
        Printer.print(employeesMale);

        Printer.print("********************  GROUPING ***********************");
        Map<String, List<Employee>> groupedData = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation));
        Printer.print(groupedData);

        Printer.print("********************  Joining Collector ***********************");
        String joiningCollector = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        Printer.print(joiningCollector);
    }

}
