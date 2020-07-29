package com.abhijit.gamingportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhijit.gamingportal.entities.Admin;
import com.abhijit.gamingportal.entities.Game;
import com.abhijit.gamingportal.entities.User;
import com.abhijit.gamingportal.repos.AdminRepository;
import com.abhijit.gamingportal.repos.UserRepository;
import com.abhijit.gamingportal.services.GameService;

@Controller
public class AdminController {
	@Autowired
	private AdminRepository adminRepository;
	@RequestMapping(value = "/adminloginpage")
	public String adminlogin(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		
			Admin admin = adminRepository.findByEmail(email);
		if (admin.getPassword().equals(password)) {
		
			return "adminwelcome";
		} else {
			modelMap.addAttribute("msg1", "Invalid username or password.Please Try Again");
		}	

		return "adminlogin";
		
	}
	@RequestMapping("/showadminlogin")
	public String existadmin() {
		return "adminlogin";
	}

@Autowired
	GameService gameService;
	
	@ModelAttribute("showGameslist")
	public List<Game> HandleGames(Model model)
	{
		
		return gameService.showAllGameDetails();
		
	} 

}