package old.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "vladi" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = sc.nextLine();
        String[] numbersInString = line.split(" ");
        int[] numbers = new int[numbersInString.length];
        int counter = 0;
        for (String num : numbersInString) {
            numbers[counter] = Integer.valueOf(num);
            counter++;
        }

        System.out.println(Arrays.toString(numbers));

        sc.close();


    }
}
