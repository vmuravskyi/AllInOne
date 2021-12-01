package enumexample;

public enum TaxiService {
    UBER(4455), BOLT(7788), VIP(111), TAXI_CARGO(9999);

    private int phone;

    TaxiService(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
