package Functional_Reactive_programming.generics;

public class GenericsDemo {

    public static void main(String[] args) {

        Bin<String, Integer> bin = new Bin<>();

        bin.setDryTrash("asddsfdfdsfsfs");
        bin.setWetTrash(123453636);

        System.out.println(bin.getDryTrash());
        System.out.println(bin.getWetTrash());

    }
}

