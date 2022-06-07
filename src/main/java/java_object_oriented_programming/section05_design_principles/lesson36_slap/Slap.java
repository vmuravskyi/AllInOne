package java_object_oriented_programming.section05_design_principles.lesson36_slap;

public class Slap {

    // Single Level of Abstraction Principle (SLAP)

    public static void main(String[] args) {

        getDetailsAndMail();

        getDetailsAndMailRefactored();

    }

    // broken 'Slap' principle
    public static void getDetailsAndMail() {
        // code to fetch details from database
        System.out.println("Fetching details from database");

        // code to email the user
        System.out.println("Mailing to the user");
    }

    // Refactored
    public static void getDetailsAndMailRefactored() {
        // code to fetch details from database
        System.out.println("Fetching details from database");

        // code to email the user
        emailTheUser();
    }

    public static void emailTheUser() {
        System.out.println("Mailing to the user");
    }


}
