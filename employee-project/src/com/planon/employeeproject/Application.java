package com.planon.employeeproject;

import java.sql.SQLException;

import com.planon.employeeproject.employee.bo.EmployeeBO;
import com.planon.employeeproject.employee.services.employees.Employees;

/**
 * we have a company having employees with fields Name, Department and Salary.
 * Department can be categorized as Developer, Manager, Sales and Operation. we
 * have given different appraisal factor for different departments. we have to
 * calculate List of Employees with Incremented Salary in sorting order Desc on
 * Salary.
 */
public class Application {

	public static void main(String[] args) throws SQLException {
		Employees employee = new Employees();
		employee.insertEmployeeData();
		EmployeeBO aEmployee = new EmployeeBO();
		aEmployee.dataManipulation();

	}
}