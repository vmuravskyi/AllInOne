package designpatterns.design_patterns_head_first.ducks.myDuck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
