package Java;
import java.util.Scanner;

public class Employee {
	 int id;
	    String name;
	    String address;
	    double salary;

	    void displayDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Salary: " + salary);
	    }
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = scanner.next();

        System.out.print("Enter Employee Address: ");
        String address = scanner.next();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.id = id;
        employee.name = name;
        employee.address = address;
        employee.salary = salary;

        System.out.println("\nEmployee Details:");
        employee.displayDetails();
    }



	}


