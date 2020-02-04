package com.questsolve.sms.service.User.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.questsolve.sms.domain.User;
import com.questsolve.sms.service.User.UserDao;
import com.questsolve.sms.service.User.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("UserDao")
	private UserDao userDao;
	
	
	public UserServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public int signUp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User signIn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int signOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User checkProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editProfile() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int resign() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int wakeUp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User signInbyGoogle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInbyKakao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInbyLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInbyFB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int restrict() {
		// TODO Auto-generated method stub
		return 0;
	}

}
