package model;

import java.util.Random;

public class DataPlayer {
	
	// Declaration of fields
	private TamagotchiPlayer tamagotchiPlayer = new TamagotchiPlayer();
	private int nbOfTurns;
	private boolean menuOn;
	private boolean gameOn;
	private boolean actionUser;
	private boolean newTurnOptions;
	private boolean fightOptions;
	
	// Create random class
	Random random = new Random();
	int lowerLimit = 5; 	// 5 is included
	int upperLimit = 11; 	// 11 is not included, so max value is 10
	
	// Constructor of class "Data"
	public DataPlayer() {
		this.tamagotchiPlayer.setEnergy(random.nextInt(lowerLimit, upperLimit));
		this.tamagotchiPlayer.setStrength(random.nextInt(lowerLimit-5, upperLimit-5));
		this.tamagotchiPlayer.setHappiness(random.nextInt(lowerLimit, upperLimit));
		this.tamagotchiPlayer.setHunger(random.nextInt(lowerLimit-5, upperLimit-5));
		this.tamagotchiPlayer.setTiredness(random.nextInt(lowerLimit-5, upperLimit-5));
		this.tamagotchiPlayer.setCleanliness(random.nextInt(lowerLimit, upperLimit));
		this.tamagotchiPlayer.setNbOfVictories(0);
		this.tamagotchiPlayer.setStrengthPenalty(0);
		
		this.nbOfTurns = 0;
		this.menuOn = true;
		this.gameOn = true;
		this.actionUser = true;
		this.newTurnOptions = true;
		this.fightOptions = true;
	}

	// Getters & Setters
	public TamagotchiPlayer getTamagotchiPlayer() {
		return this.tamagotchiPlayer;
	}
	public void setTamagotchiPlayer(TamagotchiPlayer tamagotchiPlayer) {
		this.tamagotchiPlayer = tamagotchiPlayer;
	}
	
	public boolean getMenuOn() {
		return this.menuOn;
	}
	public void setMenuOn(boolean menuOn) {
		this.menuOn = menuOn;
	}

	public boolean getGameOn() {
		return this.gameOn;
	}
	public void setGameOn(boolean gameOn) {
		this.gameOn = gameOn;
	}

	public boolean getActionUser() {
		return this.actionUser;
	}
	public void setActionUser(boolean actionUser) {
		this.actionUser = actionUser;
	}
	
	public int getNbOfTurns() {
		return this.nbOfTurns;
	}
	public void setNbOfTurns(int nbOfTurns) {
		this.nbOfTurns = nbOfTurns;
	}

	public boolean getNewTurnOptions() {
		return this.newTurnOptions;
	}
	public void setNewTurnOptions(boolean newTurnOptions) {
		this.newTurnOptions = newTurnOptions;
	}
	
	public boolean getFightOptions() {
		return this.fightOptions;
	}
	public void setFightOptions(boolean fightOptions) {
		this.fightOptions = fightOptions;
	}
}
