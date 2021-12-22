package functional_reactive_programming_java.generics.boundedType;


import java.util.Arrays;
import java.util.List;

public class BoundedT {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,8,9);
        List<String> slist = Arrays.asList("hello, ", "there", "basic", "strong");
        List<Double> dlist = Arrays.asList(10.22, 12.33, 0.1);
        DataSorter<Integer> sorter1 = new DataSorter<>(list);
//        DataSorter<String> sorter2 = new DataSorter<>(slist);
        DataSorter<Double> sorter3 = new DataSorter<>(dlist);

        sorter1.getSorterData();
//        sorter2.getSorterData();
        sorter3.getSorterData();

        IBound b = new CBound();
        getSorterData(b);

    }

    public static <T extends IBound> void getSorterData(T list) {
//        list.sort(null);
//        for (T t : list) {
//            System.out.println(t);
//        }

    }
}

interface IBound {}

class CBound implements IBound {}