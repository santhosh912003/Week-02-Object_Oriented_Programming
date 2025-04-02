public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "ON", 22);
        thermostat.displayStatus();
    }
}

class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        System.out.println("Thermostat ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }
}
