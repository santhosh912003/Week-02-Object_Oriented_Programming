import java.util.*;

public class CarRentalSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.println("Enter car model: ");
        String carModel = sc.nextLine();
        System.out.println("Enter rental days: ");
        int rentalDays = sc.nextInt();
        System.out.println("Enter daily rate: ");
        double dailyRate = sc.nextDouble();

        CarRental obj1 = new CarRental();
        CarRental obj2 = new CarRental(customerName, carModel, rentalDays, dailyRate);

        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    CarRental() {
        this("Unknown", "Unknown", 1, 50);
    }

    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double totalCost() {
        return rentalDays * dailyRate;
    }

    public String toString() {
        return "Car Rental - Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + totalCost();
    }
}
