package assignment2;

import java.util.Scanner;

public class MyDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.println("Enter your Full Name with Initial:");
        String name = sc.nextLine();

        System.out.println("Enter your Roll Number:");
        String rollNumber = sc.nextLine();

        System.out.println("Enter your Grade:");
        String grade = sc.nextLine();

        System.out.println("Enter your Percentage:");
        String percentage = sc.nextLine();

        // Output section
        System.out.println("\n--- Student Details ---");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t\t" + percentage);

        sc.close();
    }
}
