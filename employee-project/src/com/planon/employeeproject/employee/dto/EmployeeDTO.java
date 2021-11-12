package com.planon.employeeproject.employee.dto;

import com.planon.employeeproject.department.Department;

public class EmployeeDTO {
	private String name;
	private double salary;
	private double incrementedSalary;
	private Department department;

	/**
	 * Constructor sets the values of name and department of an employee.
	 * 
	 * @param aName       accepts the name of an employee.
	 * @param aDepartment accepts department which contains department name,salary
	 *                    and appraisal factor of department.
	 */

	public EmployeeDTO(String aName, Department aDepartment, double aSalary) {
		this.name = aName;
		this.department = aDepartment;
		this.salary = aSalary;
	}

	/**
	 * toString() method returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return name + " " + department + " " + (int) incrementedSalary;
	}

	/**
	 * 
	 * @return department department to get
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * 
	 * @param aDepartment department to set
	 */
	public void setDepartment(Department aDepartment) {
		this.department = aDepartment;
	}

	/**
	 * 
	 * @return name name to get
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param aName name to set
	 */
	public void setName(String aName) {
		this.name = aName;
	}

	/**
	 * 
	 * @return salary salary to get
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param aSalary salary to set
	 */
	public void setSalary(double aSalary) {
		this.salary = aSalary;
	}

	/**
	 * 
	 * @return incrementedSalary incrementedSalary to get
	 */
	public double getIncrementedSalary() {
		return incrementedSalary;
	}

	/**
	 * 
	 * @param aIncrementedSalary incrementedSalary to set
	 */
	public void setIncrementedSalary(double aIncrementedSalary) {
		this.incrementedSalary = aIncrementedSalary;
	}

}
