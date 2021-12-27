package functional_reactive_programming_java.section04;

public class LambdaPractice3 {

    public static void main(String[] args) {


        LengthOfString len = String::length;
        int length = len.length("BasicStrong");
        System.out.println(length);

        LengthOfString unique = s -> (int) s.chars()
                .distinct()
                .count();

        int count = unique.length("Java");
        System.out.println(count);


        // multiline functions
        LengthOfString lengthOfString = s -> {
            int l = s.length();
            System.out.format("The length if the string [%s] is " + l, s);
            return l;
        };
        lengthOfString.length("Java");
    }
}
