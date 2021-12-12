package epam.qaSummer.lesson03;

public class ExtendableArray {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i*i;
        }


        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas["+i+"]="+mas[i]);
        }
    }
}
