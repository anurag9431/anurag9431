import java.util.Scanner;

public class VehicleBookingSysten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to book a car or a bike? (Type 'car' or 'bike'): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        if (vehicleType.equals("car")) {
            System.out.println("You chose to book a car.");
            System.out.println("Rate for car is $1200 per hour.");
        } else if (vehicleType.equals("bike")) {
            System.out.println("You chose to book a bike.");
            System.out.println("Rate for bike is $700 per hour.");
        } else {
            System.out.println("Invalid choice. Please enter 'car' or 'bike'.");
        }

        scanner.close();
    }
}