package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int res = e.execute(10, 15);
        System.out.println(res);
    }
}

public class Test {
    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x + y;
            }
        });
        runner.run((x, y) -> x + y);

        // Comparator

//        List<String> list = new ArrayList<>();
//
//        list.add("Hellooo");
//        list.add("Goodbye");
//        list.add("ac");
//        list.add("a");
//        list.add("ab");

//        list.sort((o1, o2) -> o1.length() - o2.length());
//        System.out.println(list);

//        list.sort((s1, s2) -> s1.length() - s2.length());
//        System.out.println(list);

        System.out.println("------------------------------------------------------");


        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        // map method
        arr1 = Arrays.stream(arr1)
                .map(i -> i * 2)
                .toArray();
        list1 = list1.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());


        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);


        // filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);


        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        System.out.println("-----------------------------------------------");


        // reduce
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum = Arrays.stream(arr3)
                .reduce((accumulator, karetka) -> accumulator += karetka)
                .getAsInt();
        int sum2 = list3.stream()
                .reduce((summa, value) -> summa * value)
                .get();
        System.out.println(sum);
        System.out.println(sum2);


    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
