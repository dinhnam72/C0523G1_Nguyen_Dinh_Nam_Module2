package case_study.model.booking;

public class Booking {
    private int id;
    private String dateBooking;
    private String startDay;
    private String stopDay;
    private int customerId;
    private int serviceId;

    public Booking() {
    }

    public Booking(int id, String dateBooking, String startDay, String stopDay, int customerId, int serviceId) {
        this.id = id;
        this.dateBooking = dateBooking;
        this.startDay = startDay;
        this.stopDay = stopDay;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }
}
