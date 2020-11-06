package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.EmployeeDao;
import com.cdac.dto.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public void removeExpense(int expenseId) {
		employeeDao.deleteExpense(expenseId);
	}

	@Override
	public Employee findExpenxe(int expenseId) {
		return employeeDao.selectExpenxe(expenseId);
	}

	@Override
	public void modifyEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	@Override
	public List<Employee> selectAll(int userId) {
		return employeeDao.selectAll(userId);
	}

}
