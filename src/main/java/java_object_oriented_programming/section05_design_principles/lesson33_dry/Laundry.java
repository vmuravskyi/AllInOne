package java_object_oriented_programming.section05_design_principles.lesson33_dry;

public class Laundry {

    public void washWhiteClothes() {
        System.out.println("Putting in white clothes");
        performCommonTask();
    }

    public void washColoredClothes() {
        System.out.println("Putting in colored clothes");
        performCommonTask();
    }

    public void performCommonTask() {
        // filling water with washing machine, setting configuration
        // draining out water
    }

}
