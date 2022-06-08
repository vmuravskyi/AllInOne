package java_object_oriented_programming.section05_design_principles.lesson41_interface_segregation_principle;

interface Worker {

    void work();

}

interface Sleeper {

    void sleep();
}

class Human implements Worker, Sleeper {

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}

class Robot implements Worker {

    @Override
    public void work() {

    }

}

public class InsExecutor {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        human.sleep();
        human.work();

        robot.work();

    }

}
