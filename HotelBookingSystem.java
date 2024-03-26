import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the location where you want to book a hotel: ");
        String location = scanner.nextLine();

        // Now you can use the 'location' variable to search for hotels near that location
        System.out.println("Searching for hotels near " + location + "...");
        // Add your hotel search logic here

        scanner.close();
    }
}