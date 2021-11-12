package com.planon.employeeproject.employee.services;

import java.sql.SQLException;
import java.util.List;

import com.planon.employeeproject.employee.dto.EmployeeDTO;

/**
 * interface EmployeeService declares method getEmployees() of type
 * List<EmployeeDTO> and insertEmployeeData() with empty body.
 * 
 * @author saveer
 *
 */
public interface EmployeeService {

	public List<EmployeeDTO> getEmployees() throws SQLException;

	public void insertEmployeeData();
}
