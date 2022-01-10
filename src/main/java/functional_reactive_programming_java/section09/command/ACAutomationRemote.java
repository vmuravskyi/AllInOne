package functional_reactive_programming_java.section09.command;

public class ACAutomationRemote {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
