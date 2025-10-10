package assignment2;

import java.util.Scanner;

	// Define a class Circle
	class Circle {
	    // Data Members
	    double radius;
	    String colour;

	    // Method (i): To accept the details of the circle
	    void getInput() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        radius = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter the colour of the circle: ");
	        colour = sc.nextLine();
	    }

	    // Method (ii): To calculate and display the area
	    void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("\n--- Circle Details ---");
	        System.out.println("Radius: " + radius);
	        System.out.println("Colour: " + colour);
	        System.out.println("Area of Circle: " + area);
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        // Create object of Circle
	        Circle c = new Circle();

	        // Get input and calculate area
	        c.getInput();
	        c.calcArea();
	    }
	}
