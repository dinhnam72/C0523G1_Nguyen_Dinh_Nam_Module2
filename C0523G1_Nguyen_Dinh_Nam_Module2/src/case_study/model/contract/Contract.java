package case_study.model.contract;

public class Contract {
    private int id;
    private int bookingId;
    private double deposit;
    private double payments;

    public Contract() {
    }

    public Contract(int id, int bookingId, double deposit, double payments) {
        this.id = id;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.payments = payments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", payments=" + payments +
                '}';
    }
}
