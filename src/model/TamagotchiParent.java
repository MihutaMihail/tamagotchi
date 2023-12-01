package model;

import java.io.Serializable;

public class TamagotchiParent extends Object implements Serializable {
	
	// Declaration of fields
	private int energy;
	private int strength;
	private int happiness;
	private int hunger;
	private int tiredness;
	private int cleanliness;
	private int strengthPenalty;
	
	// Getters & Setters
	public int getEnergy() {
		return this.energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int getStrength() {
		return this.strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getHappiness() {
		return this.happiness;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
	public int getHunger() {
		return this.hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	public int getTiredness() {
		return this.tiredness;
	}
	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}
	
	public int getCleanliness() {
		return this.cleanliness;
	}
	public void setCleanliness(int cleanliness) {
		this.cleanliness = cleanliness;
	}
	
	public int getStrengthPenalty() {
		return this.strengthPenalty;
	}
	public void setStrengthPenalty(int strengthPenalty) {
		this.strengthPenalty = strengthPenalty;
	}
	
	// ToString
	public String toString() {
		return "[Energy : " + this.energy + 
				" | Strength : " + this.strength + 
				" | Happiness : " + this.happiness + 
				" | Hunger : " + this.hunger + 
				" | Tiredness : " + this.tiredness + 
				" | Cleanliness : " + this.cleanliness + 
				" | StrengthPenalty : " + this.strengthPenalty + "]";
	}
}
