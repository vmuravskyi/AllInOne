package design_patterns.design_patterns_head_first.ducks.myDuck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
