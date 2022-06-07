package java_object_oriented_programming.section05_design_principles.lesson38_single_responsibility_principle;

// Each class has single responsibility, and only one reason to change.

class Compute {

    public String compute() {
        return "Computing data based on user input";
    }

}

class Save {

    public String save() {
        return "Save the object to database";
    }

}

class Notification {

    public String sendNotification() {
        return "Send notification to user that the data was saved";
    }

}

class SchedulingApplication {

    Compute compute;
    Save save;
    Notification notification;

    public SchedulingApplication(Compute compute, Save save, Notification notification) {
        this.compute = compute;
        this.save = save;
        this.notification = notification;
    }

    public void schedule() {
        System.out.println(compute.compute());
        System.out.println(save.save());
        System.out.println(notification.sendNotification());
    }

}

public class TaskExecutor {

    public static void main(String[] args) {

        SchedulingApplication app = new SchedulingApplication(new Compute(), new Save(), new Notification());

        app.schedule();

    }

}
