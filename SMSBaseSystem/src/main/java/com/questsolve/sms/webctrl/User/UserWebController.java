package com.questsolve.sms.webctrl.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.questsolve.sms.domain.User;
import com.questsolve.sms.service.User.UserService;

@Controller
@RequestMapping("/user/*")
public class UserWebController {

	//Connection to UserService Layer 
	@Autowired
	@Qualifier("UserService")
	private UserService userService;
	
	public UserWebController() {
		System.out.println(this.getClass());
	}

	//Sign Up
	@RequestMapping(value="/signup")
	public String signUp(@ModelAttribute User user) {
		
		System.out.println(user);
		Map<String, User> map = new HashMap<String, User>();
		map.put("user", user);
		
		return "forward:/user/signUp.jsp";
	}

	public String signIn() {return null;} 
	
	public String signOut() {return null;} 

	public String checkProfile() {return null;} 

	public String editProfile() {return null;} 
	
	public String resign() {return null;} 
	
	public String findPassword() {return null;} 
	
	public String findID() {return null;} 
	
	public String wakeUp() {return null;} 
	
	public String signInbyGoogle() {return null;} 
	
	public String signInbyKakao() {return null;} 
	
	public String signInbyLine() {return null;} 
	
	public String signInbyFB() {return null;} 

	public String listUser() {return null;} 

	public String restrict() {return null;} 

}
