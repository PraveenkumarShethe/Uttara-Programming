package com.manju.java.generics4;

class MyEmployeeUtil<T extends Emp> {

	private T emp;

	public MyEmployeeUtil(T obj) {
		emp = obj;
	}

	public int getSalary() {
		return emp.getSalary();
	}

	public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp) {

		if (emp.getSalary() == otherEmp.getSalary()) {
			return true;
		}
		return false;
	}
	
	public boolean isSalaryEqualT(MyEmployeeUtil<T> otherEmp) {

		if (emp.getSalary() == otherEmp.getSalary()) {
			return true;
		}
		return false;
	}

	// // create some utility methods to do employee functionalities
	//
	//
	//
}