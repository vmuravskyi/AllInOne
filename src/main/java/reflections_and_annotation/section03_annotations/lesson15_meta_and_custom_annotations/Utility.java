package reflections_and_annotation.section03_annotations.lesson15_meta_and_custom_annotations;

@MostUsed
public class Utility {

    void doStaff() {
        System.out.println("Doing something");
    }

    @MostUsed("Python")
    void doStaff(String arg) {
        System.out.println("Operation on: " + arg);
    }

    void doStaff(int i) {
        System.out.println("Operation on: " + i);
    }

}

class SubUtility extends Utility {
    // by default this class inherits the @MostUsed annotation because its parent class has it
}
