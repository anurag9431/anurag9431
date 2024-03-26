import java.util.Scanner;

public class HotelBookingSysten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your purpose of visit: ");
        String purposeOfVisit = scanner.nextLine();

        System.out.println("Your purpose of visit is: " + purposeOfVisit);

        scanner.close();
    }
}