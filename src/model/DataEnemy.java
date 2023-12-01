package model;

import java.util.ArrayList;
import java.util.Random;

public class DataEnemy {

	// Declaration of fields
	ArrayList<TamagotchiEnemy> tamagotchiEnemies = new ArrayList<TamagotchiEnemy>();
	
	// Create random class
	Random random = new Random();
	int lowerLimit = 5; 	// 5 is included
	int upperLimit = 11; 	// 11 is not included, so max value is 10
	
	// Value that indicates how many Tamagotchi will be generated
	int numTamagotchi = 10;
	
	// Constructor of class "Data"
	public DataEnemy() {
		for (int i = 0; i < numTamagotchi; i++) {
			TamagotchiEnemy tamagotchiEnemy = new TamagotchiEnemy();
			
			tamagotchiEnemy.setEnergy(random.nextInt(lowerLimit,upperLimit));
			tamagotchiEnemy.setHappiness(random.nextInt(lowerLimit,upperLimit));
			tamagotchiEnemy.setHunger(random.nextInt(lowerLimit - 5,upperLimit - 5));
			tamagotchiEnemy.setTiredness(random.nextInt(lowerLimit - 5,upperLimit - 5));
			tamagotchiEnemy.setCleanliness(random.nextInt(lowerLimit,upperLimit));
			tamagotchiEnemy.setStrengthPenalty(random.nextInt(lowerLimit - 5,upperLimit - 5));
			
			tamagotchiEnemies.add(tamagotchiEnemy);
		}
	}

	// Getters & Setters
	public ArrayList<TamagotchiEnemy> getTamagotchiEnemies() {
		return this.tamagotchiEnemies;
	}
	public void setTamagotchiEnemies(ArrayList<TamagotchiEnemy> tamagotchiEnemies) {
		this.tamagotchiEnemies = tamagotchiEnemies;
	}
	
}
