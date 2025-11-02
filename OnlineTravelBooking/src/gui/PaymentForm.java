package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")
public class PaymentForm extends JFrame {

    public PaymentForm() {
        setTitle("Payment Form");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField amountField = new JTextField();
        JComboBox<String> methodBox = new JComboBox<>(new String[]{"Credit Card", "UPI", "Net Banking"});
        JButton payBtn = new JButton("Pay");

        panel.add(new JLabel("Amount (₹):"));
        panel.add(amountField);
        panel.add(new JLabel("Method:"));
        panel.add(methodBox);
        panel.add(new JLabel());
        panel.add(payBtn);

        add(panel);

        payBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Payment of ₹" + amountField.getText() + " successful via " + methodBox.getSelectedItem());
            dispose();
        });
    }
}
