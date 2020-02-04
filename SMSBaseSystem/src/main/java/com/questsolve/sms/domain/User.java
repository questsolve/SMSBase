package com.questsolve.sms.domain;

import java.sql.Date;

public class User {

	private String userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userJob;
	private String userRoll;
	private Date userRegDate;
	private String userPayOption;  
	private String userExternalAccount;
	
	
	
	public User() {
	}
	
	public User(String exId) {
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserJob() {
		return userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public String getUserRoll() {
		return userRoll;
	}

	public void setUserRoll(String userRoll) {
		this.userRoll = userRoll;
	}

	public Date getUserRegDate() {
		return userRegDate;
	}

	public void setUserRegDate(Date userRegDate) {
		this.userRegDate = userRegDate;
	}

	public String getUserPayOption() {
		return userPayOption;
	}

	public void setUserPayOption(String userPayOption) {
		this.userPayOption = userPayOption;
	}

	public String getUserExternalAccount() {
		return userExternalAccount;
	}

	public void setUserExternalAccount(String userExternalAccount) {
		this.userExternalAccount = userExternalAccount;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userJob=" + userJob + ", userRoll=" + userRoll + ", userRegDate=" + userRegDate
				+ ", userPayOption=" + userPayOption + ", userExternalAccount=" + userExternalAccount + "]";
	}

	

}
