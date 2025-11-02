package model;

public class TravelItinerary {
    private int itineraryId;
    private int userId;
    private String details;
    private String createdDate;

    public TravelItinerary() {}

    public TravelItinerary(int itineraryId, int userId, String details, String createdDate) {
        this.itineraryId = itineraryId;
        this.userId = userId;
        this.details = details;
        this.createdDate = createdDate;
    }

    // Getters and Setters
    public int getItineraryId() { return itineraryId; }
    public void setItineraryId(int itineraryId) { this.itineraryId = itineraryId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    @Override
    public String toString() {
        return "TravelItinerary{" +
                "itineraryId=" + itineraryId +
                ", userId=" + userId +
                ", details='" + details + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
