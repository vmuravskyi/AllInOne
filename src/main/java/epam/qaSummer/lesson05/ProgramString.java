package epam.qaSummer.lesson05;

import java.util.Scanner;

public class ProgramString {
    public static void main(String[] args) {
        String str = getStringFromConsole();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            for (int j = 0; j < words[i].length(); j++) {
                System.out.println(words[i].charAt(j));
            }
            }
        }



//        System.out.println(Arrays.toString(words));
//        int count = 0;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equals("mama")){
//                count++;
//            }
//            }
//        System.out.println(count);
//        String strTato = str.replace("mama", "tato");
//        System.out.println(strTato);
//        }

    private static String getStringFromConsole() {
        System.out.println("Enter words: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
