package com.planon.employeeproject.incrementedsalary;

import java.util.List;

import com.planon.employeeproject.employee.dto.EmployeeDTO;

public class IncrementedSalary {
	/*
	 * This method is used to Calculate the appraisal factor for each department.
	 * This method is used to Calculate the Incremented salary of an Employee. This
	 * method adds the original salary with respect to the appraisal factor of
	 * original salary of an Employee.
	 */
	public void calculateIncrementedSalary(List<EmployeeDTO> employees) {
		for (EmployeeDTO employeeDTO : employees) {

			double appraisalfactor = employeeDTO.getDepartment().value();
			double incrementedSalary = employeeDTO.getSalary() + employeeDTO.getSalary() * appraisalfactor;
			employeeDTO.setIncrementedSalary(incrementedSalary);
		}
	}

}
