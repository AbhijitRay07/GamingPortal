package com.abhijit.gamingportal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long gameId;
	private String gameName;
	private long gameAmount;
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public long getGameAmount() {
		return gameAmount;
	}
	public void setGameAmount(long gameAmount) {
		this.gameAmount = gameAmount;
	}
}
