package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_pass")
	private String userPass;
	
	@Column(name = "profile_pic")
	private String profilePic;
	
	
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	@Column(name="gender")
	private String gender;
	
	@Column(name="city")
	private String city;
	
	@Column(name="designation")
	private String desgnation;
	
	@Column(name="Mobile_no")
	private String mb_no;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesgnation() {
		return desgnation;
	}
	public void setDesgnation(String desgnation) {
		this.desgnation = desgnation;
	}
	public String getMb_no() {
		return mb_no;
	}
	public void setMb_no(String mb_no) {
		this.mb_no = mb_no;
	}
	
}
