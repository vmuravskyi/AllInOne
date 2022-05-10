package design_patterns.design_patterns_head_first.ducks.myDuck;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with a rocket");
    }
}
