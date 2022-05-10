package design_patterns.design_patterns__and_solid_principles.solid.openclose;

import java.util.List;

/**
 * Class is opened for modification
 */
public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData * baseRate / 100;
    }

}