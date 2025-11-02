package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import util.Constants;

public class DBConnection {

    private static Connection connection = null;

    // Private constructor to prevent direct instantiation
    private DBConnection() {}

    // Method to get a single shared connection
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        Constants.DB_URL,
                        Constants.DB_USER,
                        Constants.DB_PASSWORD
                );
                System.out.println("✅ Database connected successfully!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("❌ MySQL JDBC Driver not found. Add the jar in lib folder.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Failed to connect to the database: " + e.getMessage());
        }
        return connection;
    }

    // Close the connection safely
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("🔒 Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
