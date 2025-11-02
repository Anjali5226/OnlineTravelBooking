package dao;
import java.sql.*;
import java.util.*;
import model.Flight;

public class FlightDAO {

    public List<Flight> getAllFlights() {
        List<Flight> list = new ArrayList<>();
        String sql = "SELECT * FROM flights";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Flight f = new Flight(rs.getString("flight_no"),
                                      rs.getString("origin"),
                                      rs.getString("destination"),
                                      rs.getDouble("price"));
                list.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addFlight(Flight flight) {
        String sql = "INSERT INTO flights (flight_no, origin, destination, price) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, flight.getFlightNo());
            ps.setString(2, flight.getOrigin());
            ps.setString(3, flight.getDestination());
            ps.setDouble(4, flight.getPrice());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
