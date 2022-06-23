package java_programming_masterclass.section_12_java_collections.lesson154_binary_search;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian2", 8, 12);

//        theatre.getSeats();

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }

}
