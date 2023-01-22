/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Jan 22, 2023
 */
package model;

public class Employee {
	
	private String name;
	private double monthlySalary;
	private int age;

	//public default no-arg constructor
	public Employee() {
		
	}
	
	//public non-default constructor that takes one parameter of data type String and sets the name instance variable
	public Employee(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
