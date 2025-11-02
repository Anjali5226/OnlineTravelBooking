package dao;
import java.sql.*;
import java.util.*;
import model.Hotel;

public class HotelDAO {

    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = new ArrayList<>();
        String sql = "SELECT * FROM hotels";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Hotel h = new Hotel(rs.getInt("id"),
                                    rs.getString("name"),
                                    rs.getString("location"),
                                    rs.getDouble("pricePerNight"));
                hotels.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotels;
    }

    public boolean addHotel(Hotel hotel) {
        String sql = "INSERT INTO hotels (id, name, location, pricePerNight) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, hotel.getId());
            ps.setString(2, hotel.getName());
            ps.setString(3, hotel.getLocation());
            ps.setDouble(4, hotel.getPricePerNight());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
