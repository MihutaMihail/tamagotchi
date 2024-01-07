package tools;

import java.util.Scanner;

import model.DataPlayer;

public class General {
	// This function will take a string as input
	public static String stringUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	// This function will take an int as input
	public static int intUserInput() {
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Only numbers");
			return 0;
		}
	}
	
	// This function is made only to stop the program and let the user read before he continues
	public static void pressEnter() {
		System.out.println(TxtConst.PRESSENTER);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
