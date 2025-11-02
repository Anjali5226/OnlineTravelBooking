package model;

public class SystemSetting {
    private int settingId;
    private String key;
    private String value;

    public SystemSetting() {}

    public SystemSetting(int settingId, String key, String value) {
        this.settingId = settingId;
        this.key = key;
        this.value = value;
    }

    // Getters and Setters
    public int getSettingId() { return settingId; }
    public void setSettingId(int settingId) { this.settingId = settingId; }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "SystemSetting{" +
                "settingId=" + settingId +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
