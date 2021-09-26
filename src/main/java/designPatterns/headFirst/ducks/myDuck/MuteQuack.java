package designPatterns.headFirst.ducks.myDuck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("...Silence...");
    }
}
