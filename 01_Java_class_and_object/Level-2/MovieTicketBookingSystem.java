import java.util.Scanner;
public class MovieTicketBookingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.println("Enter ticket price: ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, price);

        System.out.println("Enter seat number to book: ");
        int seatNumber = sc.nextInt();
        ticket.bookTicket(seatNumber);

        ticket.displayTicket();

        sc.close();
    }
}

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber) {
        if (isBooked) {
            System.out.println("Seat " + this.seatNumber + " is already booked.");
        } else {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket successfully booked!");
        }
    }

    public void displayTicket() {
        if (isBooked) {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

