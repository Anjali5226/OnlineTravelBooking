package model;

public class Booking {
    private int bookingId;
    private int userId;
    private String bookingType; // Flight, Hotel, Car
    private int referenceId; // ID of the booked entity
    private String date;
    private String status; // Confirmed, Pending, Cancelled

    public Booking() {}

    public Booking(int bookingId, int userId, String bookingType, int referenceId, String date, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.bookingType = bookingType;
        this.referenceId = referenceId;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getBookingType() { return bookingType; }
    public void setBookingType(String bookingType) { this.bookingType = bookingType; }

    public int getReferenceId() { return referenceId; }
    public void setReferenceId(int referenceId) { this.referenceId = referenceId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", bookingType='" + bookingType + '\'' +
                ", referenceId=" + referenceId +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
