package java_object_oriented_programming.section05_design_principles.lesson37_delegation;

public class DelegationDemo {

    public static void main(String[] args) {

        TicketBookingByAgent agent = new TicketBookingByAgent(new FlightTicket());
        TicketBookingByAgent agent2 = new TicketBookingByAgent(new TrainTicket());

        agent.bookTicket();
        agent2.bookTicket();

    }

}
