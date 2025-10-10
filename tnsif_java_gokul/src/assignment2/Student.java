package assignment2;

import java.util.Scanner;

	// Class Student with Default Constructor
	class Student {
	    // Default constructor
	    Student() {
	        System.out.println("Student object is created");
	    }
	}

	// Class Commission
	class Commission {
	    // Data Members
	    String name;
	    String address;
	    String phone;
	    double salesAmount;

	    // Method (i): To accept details of the sales employee
	    void getDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Address: ");
	        address = sc.nextLine();

	        System.out.print("Enter Phone Number: ");
	        phone = sc.nextLine();

	        System.out.print("Enter Sales Amount: ");
	        salesAmount = sc.nextDouble();
	    }

	    // Method (ii): To calculate and display commission
	    void calculateCommission() {
	        double commission = 0;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("\n--- Commission Details ---");
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Phone: " + phone);
	        System.out.println("Sales Amount: " + salesAmount);
	        System.out.println("Commission Earned: " + commission);
	    }
	}

	// Main Class
	public class Main {
	    public static void main(String[] args) {
	        // Create Student object
	        Student s = new Student();

	        // Create Commission object and call methods
	        Commission c = new Commission();
	        c.getDetails();
	        c.calculateCommission();
	    }
	}
