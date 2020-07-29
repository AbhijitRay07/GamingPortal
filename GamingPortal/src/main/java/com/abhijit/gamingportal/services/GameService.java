package com.abhijit.gamingportal.services;
import com.abhijit.gamingportal.entities.Game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhijit.gamingportal.repos.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;
	public List<Game> showAllGameDetails()
	{
		List<Game> gamedetails= new ArrayList<>();
		gameRepository.findAll().forEach(gamedetails::add);
		return gamedetails;
	}
  

}
