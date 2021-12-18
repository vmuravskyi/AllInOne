package Functional_Reactive_programming.generics.boundedType;


import java.util.List;

public class DataSorter<T extends Number> {

    private final List<T> list;

    public DataSorter(List<T> list) {
        this.list = list;
    }

    public void getSorterData() {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }
}
