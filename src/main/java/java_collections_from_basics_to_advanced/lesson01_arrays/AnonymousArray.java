package java_collections_from_basics_to_advanced.lesson01_arrays;

public class AnonymousArray {

    public static void main(String[] args) {

        sum(new int[]{1, 2, 3});

    }

    private static void sum(int[] ints) {
        int total = 0;
        for (int i : ints) {
            total += i;
        }
        System.out.println(total);
    }

}
