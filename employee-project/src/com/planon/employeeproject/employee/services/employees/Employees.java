package com.planon.employeeproject.employee.services.employees;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.planon.employeeproject.department.Department;
import com.planon.employeeproject.employee.dto.EmployeeDTO;
import com.planon.employeeproject.employee.services.EmployeeService;
import com.planon.employeeproject.employee.services.dataservices.DataServices;

/**
 * Employees class is the Implementation for the Interface EmployeeService
 * 
 * @author saveer
 *
 */
public class Employees implements EmployeeService {

	/**
	 * insertEmployeeData() method inserts data into the database. this method
	 * creates a list of Employees details and returns.
	 * 
	 * @return listofEmoployees contains name, department and salary of an Employee
	 */
	public void insertEmployeeData() {

		List<EmployeeDTO> listofEmployees = new ArrayList<EmployeeDTO>();

		EmployeeDTO employee = new EmployeeDTO("Joey", Department.SALES, 480000);
		listofEmployees.add(employee);

		employee = new EmployeeDTO("Ross", Department.OPERATION, 550000);
		listofEmployees.add(employee);

		employee = new EmployeeDTO("Monica", Department.MANAGER, 450000);
		listofEmployees.add(employee);

		employee = new EmployeeDTO("Phoebe", Department.SALES, 600000);
		listofEmployees.add(employee);

		employee = new EmployeeDTO("Chandler", Department.DEVELOPER, 530000);
		listofEmployees.add(employee);

		employee = new EmployeeDTO("Rachel", Department.OPERATION, 580000);
		listofEmployees.add(employee);

		for (EmployeeDTO aEmployees : listofEmployees) {
			try {
				DataServices.insertOperation(aEmployees.getName(), aEmployees.getDepartment(), aEmployees.getSalary());
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	/**
	 * method getEmployees() of type List<EmployeeDTO> gets the retrieved data of
	 * list.
	 * 
	 * @return employee returns list of retrieved data.
	 */
	public List<EmployeeDTO> getEmployees() throws SQLException {
		DataServices data = new DataServices();
		List<EmployeeDTO> employeeDetails = data.retrieveData();

		return employeeDetails;

	}

}
