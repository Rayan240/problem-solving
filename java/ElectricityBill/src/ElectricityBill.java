
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        int previousReading = scanner.nextInt();
        System.out.print("Enter Current Month Reading: ");
        int currentReading = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        // Calculate units consumed
        int unitsConsumed = currentReading - previousReading;

        // Initialize bill amount
        double billAmount = 0;

        // Bill calculation based on connection type
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1.0 + (unitsConsumed - 100) * 2.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1.0 + 100 * 2.5 + (unitsConsumed - 200) * 4.0;
            } else {
                billAmount = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (unitsConsumed - 500) * 6.0;
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 2.0 + (unitsConsumed - 100) * 4.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 2.0 + 100 * 4.5 + (unitsConsumed - 200) * 6.0;
            } else {
                billAmount = 100 * 2.0 + 100 * 4.5 + 300 * 6.0 + (unitsConsumed - 500) * 7.0;
            }
        }
        System.out.println("\nConsumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill: Rs. " + billAmount);

        scanner.close();
    }
}