package java_object_oriented_programming.section05_design_principles.lesson37_delegation;

public interface TravelBooking {

    public void bookTicket();

}

class TicketBookingByAgent implements TravelBooking {

    private TravelBooking t;

    public TicketBookingByAgent(TravelBooking t) {
        this.t = t;
    }

    @Override
    public void bookTicket() {
        t.bookTicket();
    }

}

class TrainTicket implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Train ticket is booked!");
    }

}

class FlightTicket implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Flight ticker is booked!");
    }

}