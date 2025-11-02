package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingForm extends JFrame {

    public BookingForm() {
        setTitle("Book Your Travel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField originField = new JTextField();
        JTextField destinationField = new JTextField();
        JTextField dateField = new JTextField();
        JButton bookBtn = new JButton("Book Now");

        panel.add(new JLabel("Origin:"));
        panel.add(originField);
        panel.add(new JLabel("Destination:"));
        panel.add(destinationField);
        panel.add(new JLabel("Date (YYYY-MM-DD):"));
        panel.add(dateField);
        panel.add(new JLabel());
        panel.add(bookBtn);

        add(panel);

        bookBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Booking confirmed for " + destinationField.getText());
            dispose();
        });
    }
}
