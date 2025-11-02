package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Traveler Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton bookFlightBtn = new JButton("Book Flight");
        JButton bookingFormBtn = new JButton("My Bookings");
        JButton paymentBtn = new JButton("Make Payment");

        JPanel panel = new JPanel();
        panel.add(bookFlightBtn);
        panel.add(bookingFormBtn);
        panel.add(paymentBtn);

        add(panel, BorderLayout.CENTER);

        bookFlightBtn.addActionListener(e -> new BookingForm().setVisible(true));
        paymentBtn.addActionListener(e -> new PaymentForm().setVisible(true));
    }
}
