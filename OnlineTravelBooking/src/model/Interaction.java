package model;

public class Interaction {
    private int interactionId;
    private int userId;
    private int agentId;
    private String message;
    private String date;

    public Interaction() {}

    public Interaction(int interactionId, int userId, int agentId, String message, String date) {
        this.interactionId = interactionId;
        this.userId = userId;
        this.agentId = agentId;
        this.message = message;
        this.date = date;
    }

    // Getters and Setters
    public int getInteractionId() { return interactionId; }
    public void setInteractionId(int interactionId) { this.interactionId = interactionId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getAgentId() { return agentId; }
    public void setAgentId(int agentId) { this.agentId = agentId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Interaction{" +
                "interactionId=" + interactionId +
                ", userId=" + userId +
                ", agentId=" + agentId +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
