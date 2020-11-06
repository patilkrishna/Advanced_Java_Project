package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Employee;
import com.cdac.dto.User;
import com.cdac.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/prep_expense_add_form.htm",method = RequestMethod.GET)
	public String prepExpenseAddForm(ModelMap map) {
		map.put("expense", new Employee());
		return "expense_add_form";
	}
	
	@RequestMapping(value = "/expense_add.htm",method = RequestMethod.POST)
	public String employeeAdd(Employee employee,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		employee.setUserId(userId); 
		employeeService.addEmployee(employee);
		return "home";
	}
	
	@RequestMapping(value = "/expense_list.htm",method = RequestMethod.GET)
	public String allExpenses(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Employee> li = employeeService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}
	
	@RequestMapping(value = "/expense_delete.htm",method = RequestMethod.GET)
	public String expenseDelete(@RequestParam int expenseId,ModelMap map,HttpSession session) {
		
		employeeService.removeExpense(expenseId); 
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Employee> li = employeeService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}
	
	@RequestMapping(value = "/expense_update_form.htm",method = RequestMethod.GET)
	public String expenseUpdateForm(@RequestParam int expenseId,ModelMap map) {
		
		Employee exp = employeeService.findExpenxe(expenseId);
		map.put("expense", exp);
		
		return "expense_update_form";
	}
	
	@RequestMapping(value = "/expense_update.htm",method = RequestMethod.POST)
	public String employeeUpdate(Employee employee,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		employee.setUserId(userId);
		employeeService.modifyEmployee(employee);
			
		List<Employee> li = employeeService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}
	
}
