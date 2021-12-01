package designpatterns.headFirst.ducks.myDuck;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
