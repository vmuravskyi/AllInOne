package designpatterns.headFirst.ducks.myDuck;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with a rocket");
    }
}
