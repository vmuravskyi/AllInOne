package designpatterns.design_patterns__and_solid_principles.solid.openclose;

import java.util.List;

/**
 * Class is opened for modification
 */
public class PhoneSubscriber extends Subscriber {

    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * baseRate / 100;
    }

}