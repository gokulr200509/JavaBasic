package com.gokul.assignment.employees;


	/**
	 * The Employee class represents a generic employee with basic details.
	 * Demonstrates the use of private attributes and public getters/setters.
	 */
	public class Employee {
	    // Private attributes (accessible only within this class)
	    private String name;
	    private int employeeId;
	    private double salary;

	    // Public constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Public getters and setters (controlled access to private data)
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    protected void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Display method (accessible within package and subclasses)
	    protected void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	    }
	}



