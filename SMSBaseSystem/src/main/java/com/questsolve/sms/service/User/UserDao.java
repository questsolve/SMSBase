package com.questsolve.sms.service.User;

import java.util.List;

import com.questsolve.sms.domain.User;


public interface UserDao {

	//signUp
	public int insertNewUser();
	
	//signIn
	public User selectUser();
	
	//signOut
	public int updateUserDate();
	
	//checkProfile
	public User selectOwnProfile();
	
	//editProfile
	public int updateOwnProfile();
	
	//resign
	public int updateUserSetUnUsable();

	//findPassword
	public User selectOwnPassword();
	
	//findID
	public User selectOwnID();
	
	//wakeUp
	public int updateUserActivate();
	
	//signInbyGoogle
	public User signInByGoogle();
	
	//signInbyKakao
	public User signInByKakao();
	
	//signInbyLine
	public User signInByLine();
	
	//signInbyFB
	public User signInByFB();
	
	//listUser
	public List<User> selectUserList();
	
	//restrict
	public int updateUserRestrict();
	
}
