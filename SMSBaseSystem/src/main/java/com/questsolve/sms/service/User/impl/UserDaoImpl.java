package com.questsolve.sms.service.User.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.questsolve.sms.domain.User;
import com.questsolve.sms.service.User.UserDao;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	
	//check the wired state
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public int insertNewUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectOwnProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOwnProfile() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserSetUnUsable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectOwnPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectOwnID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserActivate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User signInByGoogle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInByKakao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInByLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signInByFB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserRestrict() {
		// TODO Auto-generated method stub
		return 0;
	}

}
