package gui;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JFrame {

    public AdminPanel() {
        setTitle("Admin Control Panel");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns = {"User ID", "Name", "Email", "Role"};
        Object[][] data = {
                {1, "Anjali", "anjali@example.com", "Traveler"},
                {2, "Ravi", "ravi@travel.com", "Agent"}
        };

        JTable userTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(userTable);

        JButton approveBtn = new JButton("Approve Listing");
        JButton rejectBtn = new JButton("Reject Listing");

        JPanel btnPanel = new JPanel();
        btnPanel.add(approveBtn);
        btnPanel.add(rejectBtn);

        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
    }
}
