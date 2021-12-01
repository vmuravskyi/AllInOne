package designpatterns.headFirst.ducks.myDuck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
