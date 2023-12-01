package tools;

import java.util.Random;

import model.DataPlayer;

public class TamagotchiAction {
	
	// This function is used to feed the Tamagotchi (Hunger = 0; StrengthPenalty--)
	public static void feedTamagotchi(DataPlayer data) {
		// Check if enough energy
		if (data.getTamagotchiPlayer().getEnergy() > 0) {
			
			data.getTamagotchiPlayer().setHunger(0);
			
			// We check if the decrease in strength penalty could result in a negative number
			if (data.getTamagotchiPlayer().getStrengthPenalty() - 1 >= 0) {
				data.getTamagotchiPlayer().setStrengthPenalty(data.getTamagotchiPlayer().getStrengthPenalty() - 1);
				System.out.println(TxtConst.STRENGTHPENALTYDECREASED);
			}
			// We decrease the energy because an action requires energy
			data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
			
			// We indicate to the user what has happened to his Tamagotchi
			System.out.println("\n" + TxtConst.ENERGYDECREASED);
			System.out.println(TxtConst.HUNGERDECREASEDFULL);
			// We show the current attributes of the Tamagotchi
			System.out.println(data.getTamagotchiPlayer());
		} else {
			// We give the Tamagotchi 1 Energy (if the has 0) so that we can use an action next turn
			data.getTamagotchiPlayer().setEnergy(1);
			
			// We indicate to the user what has happened to his Tamagotchi
			System.out.println("\n" + TxtConst.NOENERGY);
			// We show the current attributes of the Tamagotchi
			System.out.println(data.getTamagotchiPlayer());
		}
	}
	
	// This function is used to play outside with your Tamagotchi (Happiness = 10; Tiredness++)
	public static void playOutsideTamagotchi(DataPlayer data) {
		if (data.getTamagotchiPlayer().getEnergy() > 0) {
			
			data.getTamagotchiPlayer().setHappiness(10);
			
			if (data.getTamagotchiPlayer().getTiredness() + 1 <= 10) {
				data.getTamagotchiPlayer().setTiredness(data.getTamagotchiPlayer().getTiredness() + 1);
				System.out.println(TxtConst.TIREDNESSINCREASED);
			}
			data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
			
			System.out.println("\n" + TxtConst.ENERGYDECREASED);
			System.out.println(TxtConst.HAPPINESSINCREASEDFULL);
			System.out.println(data.getTamagotchiPlayer());
		} else {
			data.getTamagotchiPlayer().setEnergy(1);
			
			System.out.println("\n" + TxtConst.NOENERGY);
			System.out.println(data.getTamagotchiPlayer());
		}
	}
	
	// This function is used to wash your Tamagotchi (Cleanliness = 10)
	public static void washTamagotchi(DataPlayer data) {	
		if (data.getTamagotchiPlayer().getEnergy() > 0) {
			
			data.getTamagotchiPlayer().setCleanliness(10);
			data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
			
			System.out.println("\n" + TxtConst.ENERGYDECREASED);
			System.out.println(TxtConst.CLEANLINESSINCREASEDFULL);
			System.out.println(data.getTamagotchiPlayer());
		} else {
			data.getTamagotchiPlayer().setEnergy(1);
			
			System.out.println("\n" + TxtConst.NOENERGY);
			System.out.println(data.getTamagotchiPlayer());
		}
	}
	
	// This function is used to pet your Tamagotchi (Energy = ... ; Tiredness = 0)
	public static void petTamagotchi(DataPlayer data) {					
			data.getTamagotchiPlayer().setEnergy(
					data.getTamagotchiPlayer().getStrength() + 
					data.getTamagotchiPlayer().getHappiness() -
					data.getTamagotchiPlayer().getHunger() -
					data.getTamagotchiPlayer().getTiredness()
			);
			data.getTamagotchiPlayer().setTiredness(0);
			
			System.out.println(TxtConst.ENERGYCHANGE);
			System.out.println(TxtConst.TIREDNESSDECREASEDFULL);
			System.out.println(data.getTamagotchiPlayer());		
	}

	// This function will decrease/increase Tamagotchi attributes each turn (Hunger++; Tiredness++; Cleanliness--)
	public static void actionPerTurn(DataPlayer data) {
		data.getTamagotchiPlayer().setHunger(data.getTamagotchiPlayer().getHunger() + 1);
		data.getTamagotchiPlayer().setTiredness(data.getTamagotchiPlayer().getTiredness() + 1);
		data.getTamagotchiPlayer().setCleanliness(data.getTamagotchiPlayer().getCleanliness() - 1);
		
		System.out.println(TxtConst.ACTIONTURN);
		System.out.println(TxtConst.HUNGERINCREASED);
		System.out.println(TxtConst.TIREDNESSINCREASED);
		System.out.println(TxtConst.CLEANLINESSDECREASED);
		System.out.println(data.getTamagotchiPlayer());
	}

	// This function will choose a random action per turn
	public static void randomAction(DataPlayer data) {
		Random random = new Random();
		int upperLimit = 3;

		System.out.println(TxtConst.ACTIONRANDOM);
		
		switch (random.nextInt(upperLimit) + 1) {
		case 1:
			data.getTamagotchiPlayer().setHunger(data.getTamagotchiPlayer().getHunger() + 1);
			System.out.println(TxtConst.HUNGERINCREASED);
			System.out.println(data.getTamagotchiPlayer());
			break;
		case 2:
			data.getTamagotchiPlayer().setTiredness(data.getTamagotchiPlayer().getTiredness() + 1);
			System.out.println(TxtConst.TIREDNESSINCREASED);
			System.out.println(data.getTamagotchiPlayer());
			break;
		case 3:
			data.getTamagotchiPlayer().setCleanliness(data.getTamagotchiPlayer().getCleanliness() - 1);
			System.out.println(TxtConst.CLEANLINESSDECREASED);
			System.out.println(data.getTamagotchiPlayer());
		}
	}
	
	// This function will check if the Tamagotchi attributes are low/high enough to trigger certain events
	public static void conditionAction(DataPlayer data) {		
		System.out.println(TxtConst.ACTIONCONDITION);
		
		// HUNGER TEST
		System.out.println(TxtConst.TESTHUNGER);
		try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
		
		if (data.getTamagotchiPlayer().getHunger() > 7) {
			testHunger(data);
		} else {
			System.out.println(TxtConst.SUCCESS);
		}
			
		// TIREDNESS TEST
		System.out.println(TxtConst.TESTTIREDNESS);
		try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
		
		if (data.getTamagotchiPlayer().getTiredness() > 7) {
			testTiredness(data);
		}  else {
			System.out.println(TxtConst.SUCCESS);
		}
			
		// CLEANLINESS TEST
		System.out.println(TxtConst.TESTCLEANLINESS);
		try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
		
		if (data.getTamagotchiPlayer().getCleanliness() < 3) {
			testCleanliness(data);
		}  else {
			System.out.println(TxtConst.SUCCESS);
		}
		
		// HAPPINESS TEST
		System.out.println(TxtConst.TESTHAPPINESS);
		try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
		
		if (data.getTamagotchiPlayer().getHappiness() < 3) {
			testHappiness(data);
		}  else {
			System.out.println(TxtConst.SUCCESS);
		}
		
		System.out.println(data.getTamagotchiPlayer());
	}
	
	// This functions tests if the Hunger of the Tamagotchi is enough to trigger a certain action
	private static void testHunger(DataPlayer data) {
		data.getTamagotchiPlayer().setHappiness(data.getTamagotchiPlayer().getHappiness() - 1);
		data.getTamagotchiPlayer().setTiredness(data.getTamagotchiPlayer().getTiredness() + 1);
		data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
		
		System.out.println(TxtConst.TESTHUNGERFAILED);
		System.out.println(TxtConst.HAPPINESSDECREASED);
		System.out.println(TxtConst.TIREDNESSINCREASED);
		System.out.println(TxtConst.ENERGYDECREASED);
		General.pressEnter();
	}
	
	// This functions tests if the Tiredness of the Tamagotchi is enough to trigger a certain action
	private static void testTiredness(DataPlayer data) {
		data.getTamagotchiPlayer().setStrengthPenalty(data.getTamagotchiPlayer().getStrengthPenalty() + 1);
		data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
		
		System.out.println(TxtConst.TESTTIREDNESSFAILED);
		System.out.println(TxtConst.STRENGTHPENALTYINCREASED);
		System.out.println(TxtConst.ENERGYDECREASED);
		General.pressEnter();
	}
	
	// This functions tests if the Cleanliness of the Tamagotchi is enough to trigger a certain action
	private static void testCleanliness(DataPlayer data) {
		data.getTamagotchiPlayer().setHappiness(data.getTamagotchiPlayer().getHappiness() - 1);
		data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
		data.getTamagotchiPlayer().setStrength(data.getTamagotchiPlayer().getStrength() - 1);

		System.out.println(TxtConst.TESTCLEANLINESSFAILED);
		System.out.println(TxtConst.HAPPINESSDECREASED);
		System.out.println(TxtConst.ENERGYDECREASED);
		System.out.println(TxtConst.STRENGTHDECREASED);
		General.pressEnter();
	}
	
	// This functions tests if the Happiness of the Tamagotchi is enough to trigger a certain action
	private static void testHappiness(DataPlayer data) {
		data.getTamagotchiPlayer().setTiredness(data.getTamagotchiPlayer().getTiredness() + 1);
		data.getTamagotchiPlayer().setEnergy(data.getTamagotchiPlayer().getEnergy() - 1);
		data.getTamagotchiPlayer().setStrength(data.getTamagotchiPlayer().getStrength() - 1);

		System.out.println(TxtConst.TESTHAPPINESSFAILED);
		System.out.println(TxtConst.TIREDNESSINCREASED);
		System.out.println(TxtConst.ENERGYDECREASED);
		System.out.println(TxtConst.STRENGTHDECREASED);
		General.pressEnter();
	}
}
