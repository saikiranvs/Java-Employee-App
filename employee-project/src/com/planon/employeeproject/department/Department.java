package com.planon.employeeproject.department;

/**
 * enum Department contains different types of departments with appraisal factor
 * 
 * @author saveer
 *
 */
public enum Department {

	SALES(0.1), OPERATION(0.08), MANAGER(0.12), DEVELOPER(0.15);

	private double value;

	/**
	 * Constructor for constants of enum subtypes.
	 *
	 * @param name the enum constant's declared name.
	 */

	Department(double aValue) {
		this.value = aValue;
	}

	/**
	 * Returns the name of this enum constant.
	 *
	 * @return the name of this enum constant.
	 */

	public double value() {
		return value;
	}

	/**
	 * Returns the position of the enum constant in the declaration.
	 */

}