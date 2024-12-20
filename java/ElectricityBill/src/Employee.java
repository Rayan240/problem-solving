import java.util.Scanner;

public class Employee  {
    private String name;
    private int employeeId;
    private String department;
             private double salary;

    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated successfully.");
    }
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, employeeId, department, salary);

        emp.displayDetails();

        // Update salary
        System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();
        emp.updateSalary(newSalary);

        emp.displayDetails();

        scanner.close();
    }
}