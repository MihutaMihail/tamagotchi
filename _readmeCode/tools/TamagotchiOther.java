package tools;

import java.util.ArrayList;
import java.util.Random;

import model.DataEnemy;
import model.DataPlayer;
import model.TamagotchiEnemy;

public class TamagotchiOther {
	
	// This function uses the array of attributes that were imported beforehands
	// and assigns them to the actual Tamagotchi that will be used
	public static void loadTamagotchiPlayer(DataPlayer dataPlayer, String[] attributesPlayer) {
		dataPlayer.getTamagotchiPlayer().setName(attributesPlayer[0]);
		dataPlayer.getTamagotchiPlayer().setEnergy(Integer.parseInt(attributesPlayer[1]));
		dataPlayer.getTamagotchiPlayer().setStrength(Integer.parseInt(attributesPlayer[2]));
		dataPlayer.getTamagotchiPlayer().setHappiness(Integer.parseInt(attributesPlayer[3]));
		dataPlayer.getTamagotchiPlayer().setHunger(Integer.parseInt(attributesPlayer[4]));
		dataPlayer.getTamagotchiPlayer().setTiredness(Integer.parseInt(attributesPlayer[5]));
		dataPlayer.getTamagotchiPlayer().setCleanliness(Integer.parseInt(attributesPlayer[6]));
		dataPlayer.getTamagotchiPlayer().setStrengthPenalty(Integer.parseInt(attributesPlayer[7]));
		dataPlayer.getTamagotchiPlayer().setNbOfVictories(Integer.parseInt(attributesPlayer[8]));
	}
	
	// This function uses the array of attributes that were imported beforehands
	// and assigns them to the actual Tamagotchi that will be used
	public static TamagotchiEnemy loadTamagotchiEnemy(String[] attributesEnemy) {
		TamagotchiEnemy tamagotchiEnemy = new TamagotchiEnemy();
		
		tamagotchiEnemy.setEnergy(Integer.parseInt(attributesEnemy[0]));
		tamagotchiEnemy.setStrength(Integer.parseInt(attributesEnemy[1]));
		tamagotchiEnemy.setHappiness(Integer.parseInt(attributesEnemy[2]));
		tamagotchiEnemy.setHunger(Integer.parseInt(attributesEnemy[3]));
		tamagotchiEnemy.setTiredness(Integer.parseInt(attributesEnemy[4]));
		tamagotchiEnemy.setCleanliness(Integer.parseInt(attributesEnemy[5]));
		tamagotchiEnemy.setStrengthPenalty(Integer.parseInt(attributesEnemy[6]));
		
		return tamagotchiEnemy;
	}
	
	// This function is used to make the users Tamagotchi fight with a randomly generated Tamagotchi or an imported one
	public static void fight(DataPlayer dataPlayer, DataEnemy dataEnemy, TamagotchiEnemy tamagotchiEnemyLoaded) {
		TamagotchiEnemy tamagotchiEnemyFight = new TamagotchiEnemy();
		
		if (tamagotchiEnemyLoaded == null) {
			// Fighting a randomly generated Tamagotchi
			tamagotchiEnemyFight = getRandomTamagotchiArrayList(dataEnemy);
		} else if (dataEnemy == null) {
			// Fighting an imported Tamagotchi
			tamagotchiEnemyFight = tamagotchiEnemyLoaded;
		}
		
		Random random = new Random();
		int lowerLimitStrength = 1;
		int upperLimitStrength = 11;
		
		// ((nbOfTurns / 10) - StrenghPenalty) + randomNumber
		int strengthPlayer = ((dataPlayer.getNbOfTurns() / 10 ) - dataPlayer.getTamagotchiPlayer().getStrengthPenalty())
				+ random.nextInt(lowerLimitStrength, upperLimitStrength);
		
		int strengthEnemy = ((dataPlayer.getNbOfTurns() / 10 ) - tamagotchiEnemyFight.getStrengthPenalty())
				+ random.nextInt(lowerLimitStrength, upperLimitStrength);
		
		if (strengthPlayer > strengthEnemy) {
			dataPlayer.getTamagotchiPlayer().setNbOfVictories(dataPlayer.getTamagotchiPlayer().getNbOfVictories() + 1);
			
			System.out.println(TxtConst.WONFIGHT);
			System.out.println(TxtConst.STRENGTHPLAYER + strengthPlayer);
			System.out.println(TxtConst.STRENGTHENEMY + strengthEnemy);
		} else {
			System.out.println(TxtConst.LOSTFIGHT);
			System.out.println(TxtConst.STRENGTHPLAYER + strengthPlayer);
			System.out.println(TxtConst.STRENGTHENEMY + strengthEnemy);
		}
		
	}
	
	// This function is used to get a random TamagotchiEnemy from the list of enemies
	private static TamagotchiEnemy getRandomTamagotchiArrayList(DataEnemy dataEnemy) {
		ArrayList<TamagotchiEnemy> tamagotchiEnemies = dataEnemy.getTamagotchiEnemies();
		TamagotchiEnemy tamagotchiEnemy = new TamagotchiEnemy();
		
		Random random = new Random();
		int upperLimitArrayList = tamagotchiEnemies.size();
		
		tamagotchiEnemy = tamagotchiEnemies.get(random.nextInt(upperLimitArrayList));
		return tamagotchiEnemy;
	}
}
