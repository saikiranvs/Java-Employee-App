package com.planon.employeeproject.employee.bo;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.planon.employeeproject.employee.dto.EmployeeDTO;
import com.planon.employeeproject.employee.services.employees.Employees;
import com.planon.employeeproject.incrementedsalary.IncrementedSalary;

public class EmployeeBO {

	/**
	 * method dataManipulation() sort the Incremented Salary of Employees in
	 * descending order and displays name, department and Incremented Salary of
	 * Employees.
	 * 
	 * @throws SQLException Retrieves the exception chained to this SQLException
	 *                      object.
	 */
	public void dataManipulation() throws SQLException {

		Employees employee = new Employees();
		IncrementedSalary increment = new IncrementedSalary();
		List<EmployeeDTO> aEmployees = employee.getEmployees();
		increment.calculateIncrementedSalary(aEmployees);

		Collections.sort(aEmployees, new Comparator<EmployeeDTO>() {

			@Override
			public int compare(EmployeeDTO aFirstEmployee, EmployeeDTO aSecondEmployee) {
				return Double.compare(aFirstEmployee.getIncrementedSalary(), aSecondEmployee.getIncrementedSalary());
			}
		});

		Collections.reverse(aEmployees);
		for (EmployeeDTO Employees : aEmployees) {
			System.out.println(Employees.toString());
		}

	}

}