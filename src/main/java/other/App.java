package other;


public class App {
    public static void main(String[] args) {
        String str = "Volodymyr";

        System.out.println(reverse(str));
    }

    private static String reverse(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 1; i <= arr.length; i++) {
            result = result.concat(String.valueOf(arr[arr.length - i]));
        }
        return result;
    }
}
