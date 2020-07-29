package com.abhijit.gamingportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
	

	@RequestMapping("/purchasepage")
	public String purchaseamount() {
		return "purchase";
	}
	

}
