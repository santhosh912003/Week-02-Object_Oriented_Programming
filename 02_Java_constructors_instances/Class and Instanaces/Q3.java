import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the owner's name: ");
        String owner1 = sc.nextLine();
        System.out.println("Enter the vehicle type: ");
        String type1 = sc.nextLine();
        Vehicle v1 = new Vehicle(owner1, type1);

        System.out.println("Enter the owner's name: ");
        String owner2 = sc.nextLine();
        System.out.println("Enter the vehicle type: ");
        String type2 = sc.nextLine();
        Vehicle v2 = new Vehicle(owner2, type2);

        System.out.println("\nVehicle Details Before Fee Update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.println("\nEnter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        System.out.println("\nVehicle Details After Fee Update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        sc.close();
    }
}
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}


