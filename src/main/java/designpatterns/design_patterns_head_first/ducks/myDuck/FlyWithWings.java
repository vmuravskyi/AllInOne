package designpatterns.design_patterns_head_first.ducks.myDuck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
