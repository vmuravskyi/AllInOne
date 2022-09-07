package java_black_belt.section08_multithreading.lesson84_exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> myActionList = new ArrayList<>();
        myActionList.add(Action.ROCK);
        myActionList.add(Action.PAPER);
        myActionList.add(Action.PAPER);

        List<Action> friendsActionList = new ArrayList<>();
        friendsActionList.add(Action.PAPER);
        friendsActionList.add(Action.ROCK);
        friendsActionList.add(Action.SCISSORS);

        var myself = new Player("Myself", myActionList, exchanger);
        var yourself = new Player("Yourself", friendsActionList, exchanger);

        myself.start();
        yourself.start();

    }

}

enum Action {
    ROCK,
    PAPER,
    SCISSORS
}

class Player extends Thread {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.ROCK && friendsAction == Action.SCISSORS)
        || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
        || (myAction == Action.PAPER && friendsAction == Action.ROCK)) {
            System.out.println(name + " WON!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
