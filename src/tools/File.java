package tools;

import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import model.TamagotchiPlayer;

public class File {
	
	// This function takes all of the attributes of a Tamagotchi and writes them onto a txt file
	public static void fileWriter(TamagotchiPlayer tamagotchiPlayer) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("Tama.txt"));
			writer.write("Name :" + tamagotchiPlayer.getName());
			writer.write("\nEnergy :" + tamagotchiPlayer.getEnergy());
			writer.write("\nStrength :" + tamagotchiPlayer.getStrength());
			writer.write("\nHappiness :" + tamagotchiPlayer.getHappiness());
			writer.write("\nHunger :" + tamagotchiPlayer.getHunger());
			writer.write("\nTiredness :" + tamagotchiPlayer.getTiredness());
			writer.write("\nCleanliness :" + tamagotchiPlayer.getCleanliness());
			writer.write("\nStrengthPenalty :" + tamagotchiPlayer.getStrengthPenalty());
			writer.write("\nNbOfVictories :" + tamagotchiPlayer.getNbOfVictories());
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// This functions reads and imports all values that are located in the file "Tama.txt"
	public static String[] fileReaderPlayer() {
		String[] attributesPlayer = new String[9];
		String line = null;

		try {
			FileReader file = new FileReader("Tama.txt");
			BufferedReader buffer = new BufferedReader(file);

			for (int i = 0; i < attributesPlayer.length; i++) {
				// We read the whole line and cut it in half using the ':' symbol
				// Then we take the second half ([1]) which is the number
				line = buffer.readLine();
				String[] lineCutHalf = line.split(":");
				attributesPlayer[i] = lineCutHalf[1];	
			}

			buffer.close();
			return attributesPlayer;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// This functions reads and imports all values that are located in the file "TamaEnemy.txt"
	public static String[] fileReaderEnemy() {
		String[] attributesEnemy = new String[7];
		String line = null;

		try {
			FileReader file = new FileReader("TamaEnemy.txt");
			BufferedReader buffer = new BufferedReader(file);

			for (int i = 0; i < attributesEnemy.length; i++) {
				// We read the whole line and cut it in half using the ':' symbol
				// Then we take the second half ([1]) which is the number
				line = buffer.readLine();
				String[] lineCutHalf = line.split(":");
				attributesEnemy[i] = lineCutHalf[1];	
			}

			buffer.close();
			return attributesEnemy;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
