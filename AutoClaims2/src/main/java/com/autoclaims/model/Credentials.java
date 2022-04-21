package com.autoclaims.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="credential")
public class Credentials {
	
	@Column(name="Username", nullable=false, unique = true)
	String username;
	@Column(name="Password", nullable=false)
	String password;
	@Column(name="Last_Login_Date")
	@Temporal(TemporalType.DATE)
	Date date;
	@Id
	@Column(name="User_id")
	int userId;
	
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Credentials(String username, String password, Date date, int userId) {
		super();
		this.username = username;
		this.password = password;
		this.date = date;
		this.userId = userId;
	}
	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Credentials [userName=" + username + ", password=" + password + ", date=" + date + ", userId=" + userId
				+ "]";
	}
	
	

}
