package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	@GeneratedValue
	private int expenseId;
	@Column(name = "emp_name")
	private String itemName;
	private float price;
	@Column(name = "joining_date")
	private String purchaseDate;
	private int userId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int expenseId) {
		super();
		this.expenseId = expenseId;
	}

	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
