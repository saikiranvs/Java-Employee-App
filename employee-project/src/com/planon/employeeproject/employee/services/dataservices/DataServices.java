package com.planon.employeeproject.employee.services.dataservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.planon.employeeproject.department.Department;
import com.planon.employeeproject.employee.dto.EmployeeDTO;

public class DataServices {

	private static PreparedStatement ps;
	private ResultSet rs;
	private Department department;
	private String name;
	private double salary;
	private static String userName = "l";
	private static String password = "l";
	private static String url = "jdbc:sqlserver://PC09362;instanceName=SQLEXPRESS";
	private static Connection con;

	/**
	 * insertOperation() method accepts name, department and salary parameters. and
	 * inserts values into the database.
	 * 
	 * @throws SQLException Retrieves the exception chained to this SQLException
	 *                      object.
	 */
	public static void insertOperation(String aName, Department aDepartment, double aSalary) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con = DriverManager.getConnection(url, userName, password);

			ps = con.prepareStatement("insert into pla values(?,?,?)");
			ps.setString(1, aName);
			ps.setString(2, aDepartment.toString());
			ps.setFloat(3, (int) aSalary);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		con.close();
	}

	/**
	 * method retrieveData() of type List<EmployeeDTO> retrieves data from the
	 * database and store the values into a list.
	 * 
	 * @return employeesDetails contains list of retrieved data from the database.
	 * @throws SQLException Retrieves the exception chained to this SQLException
	 *                      object.
	 */
	public List<EmployeeDTO> retrieveData() throws SQLException {
		List<EmployeeDTO> employeesDetails = new ArrayList<EmployeeDTO>();

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, userName, password);
			ps = con.prepareStatement("select * from pla");
			rs = ps.executeQuery();
			while (rs.next()) {
				name = rs.getString("name");
				department = Department.valueOf(rs.getString("department"));
				salary = rs.getInt("salary");
				EmployeeDTO e = new EmployeeDTO(name, department, salary);
				employeesDetails.add(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		con.close();
		return employeesDetails;

	}

}
