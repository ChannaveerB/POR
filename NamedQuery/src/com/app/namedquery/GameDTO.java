package com.app.namedquery;

import java.io.Serializable;

public class GameDTO implements Serializable{
	
	private String gameName;
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getNoOfPlayer() {
		return noOfPlayer;
	}
	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	private int noOfPlayer;
	private String gameType;
	private int Duration;
	
	

}
