package designpatterns.design_patterns_head_first.ducks.myDuck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("I am model duck");
    }
}