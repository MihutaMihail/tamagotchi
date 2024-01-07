package main;

import java.io.File;

import model.DataEnemy;
import model.DataPlayer;
import model.TamagotchiEnemy;
import tools.TxtConst;
import tools.General;
import tools.TamagotchiOther;
import tools.TamagotchiAction;

public class Menu {
	public static void menu() {
		// We initiate all datas to get our Tamagotchi, the enemies, and other variables that will serve for the loops
		DataPlayer dataPlayer = new DataPlayer();
		DataEnemy dataEnemy = new DataEnemy();
		
		// These arrays will be used to recover the attributes of the imported Tamagotchi (player & enemy)
		String[] attributesPlayer = new String[] {};
		String[] attributesEnemyImport = new String[] {};
		
		TamagotchiEnemy tamagotchiEnemyImport = new TamagotchiEnemy();

		while (dataPlayer.getGameOn()) {
			// Main Menu
			// This is where the user can choose a NEW GAME or CONTINUE where he left off
			while (dataPlayer.getMenuOn()) {
				if (new File("Tama.txt").isFile()) {
					System.out.println(TxtConst.MENUSTART);
					System.out.println(TxtConst.MENUCONTINUE);
				} else {
					System.out.println(TxtConst.MENUSTART);
				}

				switch (General.intUserInput()) {
				case 1:
					// NEW GAME
					System.out.println(TxtConst.ENTERNAME);
					String name = General.stringUserInput();
					dataPlayer.getTamagotchiPlayer().setName(name);
					
					// Write Tamagotchi onto a txt file
					tools.File.fileWriter(dataPlayer.getTamagotchiPlayer());
					System.out.println(TxtConst.TAMAGOTCHISAVE);
					System.out.println(dataPlayer.getTamagotchiPlayer());
					dataPlayer.setMenuOn(false);
					break;
				case 2:
					// CONTINUE
					// Read txt file to get Tamagothi
					attributesPlayer = tools.File.fileReaderPlayer();
					// Apply attributes of the imported Tamagotchi onto our current Tamagotchi
					TamagotchiOther.loadTamagotchiPlayer(dataPlayer, attributesPlayer);
					System.out.println(TxtConst.TAMAGOTCHILOAD);
					System.out.println(dataPlayer.getTamagotchiPlayer());
					dataPlayer.setMenuOn(false);
					break;
				default:
					System.out.println(TxtConst.DEFAULT);
				}
			}
			// ACTIONS HAPPEN HERE
			
			// Number of Turns
			dataPlayer.setNbOfTurns(dataPlayer.getNbOfTurns() + 1);
			System.out.println("\n[ " + dataPlayer.getNbOfTurns() + " " + TxtConst.NEWTURN + " ]");
			
			try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
			
			// 1st Action (action chosen by USER)
			while (dataPlayer.getActionUser()) {
				System.out.println(TxtConst.ACTIONUSER);
				switch (General.intUserInput()) {
				case 1:
					TamagotchiAction.feedTamagotchi(dataPlayer);
					dataPlayer.setActionUser(false);
					break;
				case 2:
					TamagotchiAction.playOutsideTamagotchi(dataPlayer);
					dataPlayer.setActionUser(false);
					break;
				case 3:
					TamagotchiAction.washTamagotchi(dataPlayer);
					dataPlayer.setActionUser(false);
					break;
				case 4: 
					TamagotchiAction.petTamagotchi(dataPlayer);
					dataPlayer.setActionUser(false);
					break;
				default:
					System.out.println(TxtConst.DEFAULT);
				}
			}
			dataPlayer.setActionUser(true);
			
			General.pressEnter();
			
			// 2nd Action (action per turn)
			TamagotchiAction.actionPerTurn(dataPlayer);
			General.pressEnter();
			
			// 3rd Action (random action)
			TamagotchiAction.randomAction(dataPlayer);
			General.pressEnter();
			
			// 4th Action (action based on a condition)
			TamagotchiAction.conditionAction(dataPlayer);
			General.pressEnter();
			
			// Fight
			System.out.println(TxtConst.FIGHTOPTIONS);
			while (dataPlayer.getFightOptions()) {
				switch (General.intUserInput()) {
				case 1:
					// Fight a randomly generated Tamagotchi
					TamagotchiOther.fight(dataPlayer, dataEnemy, null);
					dataPlayer.setFightOptions(false);
					break;
				case 2:
					// Fight an already prepared Tamagotchi (read txt file)
					attributesEnemyImport = tools.File.fileReaderEnemy();
					tamagotchiEnemyImport = TamagotchiOther.loadTamagotchiEnemy(attributesEnemyImport);
					TamagotchiOther.fight(dataPlayer, null, tamagotchiEnemyImport);
					dataPlayer.setFightOptions(false);
					break;
				default:
					System.out.println(TxtConst.DEFAULT);
				}
			}
			dataPlayer.setFightOptions(true);
			
			General.pressEnter();
			
			// Before a new turn, we ask the USER if it wants to save
			System.out.println(TxtConst.NEWTURNOPTIONS);
			while (dataPlayer.getNewTurnOptions()) {
				switch (General.intUserInput()) {
				case 1:
					tools.File.fileWriter(dataPlayer.getTamagotchiPlayer());
					System.out.println(TxtConst.TAMAGOTCHISAVE);
					dataPlayer.setNewTurnOptions(false);
					break;
				case 2:
					tools.File.fileWriter(dataPlayer.getTamagotchiPlayer());
					System.out.println(TxtConst.TAMAGOTCHISAVE);
					dataPlayer.setNewTurnOptions(false);
					dataPlayer.setGameOn(false);
					break;
				default:
					System.out.println(TxtConst.DEFAULT);
				}
			}
			dataPlayer.setNewTurnOptions(true);
		}
	}
}
