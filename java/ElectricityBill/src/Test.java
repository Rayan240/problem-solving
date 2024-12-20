import java.util.Scanner;

class Name {
    private String name;
    private int rollNumber;
    private double Math1, English1;

    // Setters
    public void set1(String name, int rollNumber, double Math1,double English1){
        this.name = name;
        this.rollNumber = rollNumber;
        this.Math1 = Math1;
        this.English1 = English1;

    }

    // Method to calculate average
    public double calculate_average() {
        return (Math1 + English1) / 2.0;
    }

    // Method to get grade
    public String get_grade() {
        double average_grade = calculate_average();
        return average_grade >= 40 ? "Pass" : "Fail";
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the name:");
        String name = scanner.nextLine();

        System.out.println("Enter the Roll number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter your Math mark:");
        double Math1 = scanner.nextDouble();

        System.out.println("Enter your English mark:");
        double English1 = scanner.nextDouble();

        // Object of Name class
        Name s2 = new Name();
        s2.set1(name,rollNumber,Math1,English1);
        

        // Output
        System.out.println("Average mark: " + s2.calculate_average());
        System.out.println("Result: " + s2.get_grade());

        scanner.close();
    }
}
