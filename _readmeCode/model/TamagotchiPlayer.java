package model;

import java.io.Serializable;

public class TamagotchiPlayer extends TamagotchiParent implements Serializable {
	
	// Declaration of fields
	private String name;
	private int nbOfVictories;
	
	// Getters & Setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNbOfVictories() {
		return this.nbOfVictories;
	}
	public void setNbOfVictories(int nbOfVictories) {
		this.nbOfVictories = nbOfVictories;
	}
	
	// ToString
	public String toString() {
		return "[Name : " + this.name +
				" | Energy : " + this.getEnergy() + 
				" | Strength : " + this.getStrength() + 
				" | Happiness : " + this.getHappiness() + 
				" | Hunger : " + this.getHunger() + 
				" | Tiredness : " + this.getTiredness() + 
				" | Cleanliness : " + this.getCleanliness() + 
				" | NbOfVictories : " + this.nbOfVictories + 
				" | StrengthPenalty : " + this.getStrengthPenalty() + "]";
	}
}
