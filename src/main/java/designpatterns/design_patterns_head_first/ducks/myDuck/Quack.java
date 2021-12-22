package designpatterns.design_patterns_head_first.ducks.myDuck;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
