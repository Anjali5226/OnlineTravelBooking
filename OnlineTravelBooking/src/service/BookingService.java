package service;

import model.Booking;
import java.util.*;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added successfully: " + booking.getBookingId());
    }

    public Booking getBookingById(int id) {
        for (Booking b : bookings) {
            if (b.getBookingId() == id) {
                return b;
            }
        }
        return null;
    }

    public void cancelBooking(int id) {
        bookings.removeIf(b -> b.getBookingId() == id);
        System.out.println("Booking cancelled: " + id);
    }
}
