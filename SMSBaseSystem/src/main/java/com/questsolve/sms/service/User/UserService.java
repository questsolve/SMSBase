package com.questsolve.sms.service.User;

import java.util.List;

import com.questsolve.sms.domain.User;

public interface UserService {


	public int signUp();
	
	public User signIn();

	public int signOut();
	
	public User checkProfile();
	
	public int editProfile();
	
	public int resign(); 

	public User findPassword();
	
	public User findID(); 

	public int wakeUp();  

	public User signInbyGoogle(); 

	public User signInbyKakao(); 

	public User signInbyLine(); 

	public User signInbyFB(); 

	public List<User> listUser();

	public int restrict(); 


}
