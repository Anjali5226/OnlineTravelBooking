package model;

public class CarRental {
    private int carId;
    private String company;
    private String location;
    private double pricePerDay;
    private String status;

    public CarRental() {}

    public CarRental(int carId, String company, String location, double pricePerDay, String status) {
        this.carId = carId;
        this.company = company;
        this.location = location;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    // Getters and Setters
    public int getCarId() { return carId; }
    public void setCarId(int carId) { this.carId = carId; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "CarRental{" +
                "carId=" + carId +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", status='" + status + '\'' +
                '}';
    }
}
