import java.util.*;

public class HotelBookingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter guest name: ");
        String guestName = sc.nextLine();
        System.out.println("Enter room type: ");
        String roomType = sc.nextLine();
        System.out.println("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking obj1 = new HotelBooking();
        HotelBooking obj2 = new HotelBooking(guestName, roomType, nights);
        HotelBooking obj3 = new HotelBooking(obj2);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public String toString() {
        return "Hotel Booking - Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights;
    }
}
