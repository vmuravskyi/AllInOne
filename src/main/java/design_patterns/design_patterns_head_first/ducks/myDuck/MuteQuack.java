package design_patterns.design_patterns_head_first.ducks.myDuck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("...Silence...");
    }
}
