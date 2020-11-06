package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee employee);
	void deleteExpense(int expenseId);
	Employee selectExpenxe(int expenseId);
	void updateEmployee(Employee employee);
	List<Employee> selectAll(int userId);
}
