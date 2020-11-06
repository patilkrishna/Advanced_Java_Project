package com.cdac.service;

import java.util.List;

import com.cdac.dto.Employee;

public interface ExpenseService {
	void addEmployee(Employee employee);
	void removeExpense(int expenseId);
	Employee findExpenxe(int expenseId);
	void modifyEmployee(Employee employee);
	List<Employee> selectAll(int userId);
}
