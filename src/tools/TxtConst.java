package tools;

public class TxtConst {
	public static final String MENUSTART = "MAIN MENU"
	+ "\n 1. New Game";
	public static final String MENUCONTINUE = " 2. Continue";	
	
	public static final String ACTIONUSER = "\nChoose an action for your Tamagotchi"
			+ "\n 1. Feed him"
			+ "\n 2. Let him play Outside"
			+ "\n 3. Wash him"
			+ "\n 4. Pet him";
	
	public static final String ACTIONRANDOM = "\nA RANDOM ACTION WILL HAPPEN";
	public static final String ACTIONCONDITION = "\nYOUR PET IS BEING PUT TO THE TEST (condition action)";
	public static final String ACTIONCONDITIONPASED = "Your pet has passed all tests (no penalty)";
	
	public static final String ENTERNAME = "Enter your name : ";	
	public static final String DEFAULT = "YOU MUST CHOOSE A VALID OPTION !";
	
	public static final String NEWTURN = "TURN";
	public static final String ACTIONTURN = "\nEACH TURN YOUR PETS CONDITION GETS WORSE";
	public static final String NEWTURNOPTIONS = "A new turn is about to begin, would you like to"
			+ "\n 1. Save and Continue"
			+ "\n 2. Save and Exit";
	
	public static final String PRESSENTER = "\nPress ENTER to contine... ";
	
	public static final String TAMAGOTCHISAVE = "YOUR TAMAGOTCHI HAS BEEN SAVED";	
	public static final String TAMAGOTCHILOAD = "YOUR TAMAGOTCHI HAS BEEN LOADED";	
	
	public static final String HUNGERDECREASEDFULL = "Your pet is no longer hungry (Hunger = 0)";	
	public static final String HUNGERINCREASED = "Your pet has gotten hungrier (Hunger++)";	
	
	public static final String STRENGTHDECREASED = "Your pets Strength has decreased (Strength--)";
	
	public static final String STRENGTHPENALTYDECREASED = "Your pets strength penalty has decreased (StrengthPenalty--)";
	public static final String STRENGTHPENALTYINCREASED = "Your pets strength penalty has increased (StrengthPenalty++)";
	
	public static final String HAPPINESSINCREASEDFULL = "Your pet is extremely happy (Happiness = 10)";
	public static final String HAPPINESSDECREASED = "Your pets Happiness has decreased (Happiness--)";
	
	public static final String TIREDNESSINCREASED = "Your pet has gotten a little tired (Tiredness++)";
	public static final String TIREDNESSDECREASEDFULL = "Your pet is full of energy (Tiredness = 0)";	
	
	public static final String CLEANLINESSDECREASED = "Your pet has gotten dirtier (Cleanliness--)";
	public static final String CLEANLINESSINCREASEDFULL = "Your pet is now clean (Cleanliness = 10)";
	
	public static final String ENERGYCHANGE = "Your pets Energy has been changed";
	public static final String ENERGYDECREASED = "Your pets Energy has decreased (Energy--)";
	public static final String NOENERGY = "You don't have enough energy for this action"
			+ "\nHere is some Energy for next turn (Energy++)";
	
	public static final String SUCCESS = "Test Passed !";
	
	public static final String TESTHUNGER = "\nIS YOUR PETS BELLY SATISFIED ? (Hunger Test)";
	public static final String TESTHUNGERFAILED = "YOUR PET IS TOO HUNGRY (Hunger > 7)\n";
	
	public static final String TESTTIREDNESS = "\nIS YOUR PET ENERGETIC ? (Tiredness Test)";
	public static final String TESTTIREDNESSFAILED = "YOUR PET IS VERY TIRED (Tiredness > 7)\n";
	
	public static final String TESTCLEANLINESS = "\nIS YOUR PET CLEAN ? (Cleanliness Test)";
	public static final String TESTCLEANLINESSFAILED = "YOUR PET IS REALLY DIRTY (Cleanliness < 7)\n";
	
	public static final String TESTHAPPINESS = "\nIS YOUR PET HAPPY ? (Happiness Test)";
	public static final String TESTHAPPINESSFAILED = "YOUR PET IS SAD (Happiness < 3)";
	
	public static final String FIGHTOPTIONS = "\nChoose what you want to fight"
			+ "\n 1. Fight a random generated Tamagotchi"
			+ "\n 2. Fight an already prepared Tamagotchi"
			+ "\n   ('TamaEnemy.txt' is where you modify the Tamagotchi attributes)";
	
	public static final String WONFIGHT = "\nYOU WON"
			+ "\nYour Tamagotchi was stronger";

	public static final String LOSTFIGHT = "\nYOU LOST"
			+ "\nYour Tamagotchi was defeated";	
	
	public static final String STRENGTHPLAYER = "Strength Player : ";
	public static final String STRENGTHENEMY = "Strength Enemy : ";
	
}
