public class  VehicleRegistrationSystem {
    public static void main(String[] args) {
        vehicle v1 = new vehicle("John Doe", "Car", "REG123");
        vehicle v2 = new vehicle("Jane Smith", "Bike", "REG456");

        if (v1 instanceof vehicle) v1.displayRegistrationDetails();
        if (v2 instanceof vehicle) v2.displayRegistrationDetails();

        vehicle.updateRegistrationFee(200);
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}

class vehicle {
    private static int registrationFee = 100;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + 
                ", Registration Number: " + registrationNumber + ", Fee: $" + registrationFee);
    }
}
