package functional_reactive_programming_java.section09.iterator;

public class IteratorPattern {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(new Object[] {1,2,3,4,5});

        myArrayList.forEach(System.out::println);


    }
}
