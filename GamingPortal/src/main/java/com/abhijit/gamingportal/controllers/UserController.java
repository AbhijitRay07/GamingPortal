package com.abhijit.gamingportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhijit.gamingportal.entities.User;
import com.abhijit.gamingportal.repos.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "registerUser";
	}

	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login";

	}

	@RequestMapping("/loginpage")
	public String existuser() {
		return "login";
	}

	@PostMapping(value = "/loginpage")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = userRepository.findByEmail(email);
		if (user.getPassword().equals(password)) {
			modelMap.addAttribute("name", user.getName().toUpperCase());
			modelMap.addAttribute("age", user.getAge());
			modelMap.addAttribute("balance", user.getBalance());
			return "welcome";
		} else {
			modelMap.addAttribute("msg", "Invalid username or password.Please Try Again");
		}	

		return "login";
		
	}
	/*@RequestMapping(value="/welcome")
	public String welcomepage(ModelMap modelMap)
	{
		User user = userRepository.findByEmail(email);
		modelMap.addAttribute("name", user.getName().toUpperCase());
		modelMap.addAttribute("age", user.getAge());
		modelMap.addAttribute("balance", user.getBalance());
		return "welcome";
	}*/
	
	
	
	@PostMapping("/purchasepage")
	public String addmoney(@RequestParam("balance") int balance)
	{
		if(userRepository.updatebalance(balance)) {
		return "purchase";
		}
		else {
			return "welcome";
		}
	} 

}