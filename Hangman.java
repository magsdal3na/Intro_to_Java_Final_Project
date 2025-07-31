import java.util.Scanner; // needed to read player input
import java.util.Random; // needed to generate random word
import java.util.ArrayList; // needed to hold word list
import java.util.Arrays; // needed to print out and use spaces

public class Hangman
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Random word list
		ArrayList<String> words = new ArrayList<String>();
		words.add("Trucks");
		words.add("Damage");
		words.add("Autumn");
		words.add("Access");
		words.add("Carbon");
		words.add("Editor");
		// Initialize random generator
		Random randomGenerator = new Random();
		// Add size of word array
		int randomIndex = randomGenerator.nextInt(words.size());
		// Holds random word
		String randomWord = words.get(randomIndex);
		// Initialize spaces for letters
		String[] spaces = {"-","-","-","-","-","-"};
		// Initializes menu screen and starting image
		System.out.println("Welcome to Hangman!");
		System.out.println("  -----");
		System.out.println("  |   |");
		System.out.println("  |   O");
		System.out.println("  |  /|\\");
		System.out.println("  |  / \\");
		System.out.println("  |  ");
		System.out.println("-----");

		//do...while loop to handle selection choice
		do {
			System.out.println("Choose an option: ");
			System.out.println("1. Play");
			System.out.println("2. Quit");

			// Initializes variable for selection
			int choice = input.nextInt();
			input.nextLine();

			if(choice == 1) {
				// Starts the game
				System.out.println("Let's get started!");
				break;
			}
			if(choice == 2) {
				// Closes the game
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			else if((choice > 2) || (choice < 1)) {
				System.out.println("That's an invalid number.");
				System.out.println("Please input either 1 or 2.");
			}
		} while (true);

		for(int g = 0; g < 12; g++) {
			// Start of game
			System.out.println("  -----");
			System.out.println("  |   |");
			System.out.println("  |    ");
			System.out.println("  |    ");
			System.out.println("  |    ");
			System.out.println("  |    ");
			System.out.println("-----  ");
			System.out.println("Choose a letter: ");

			// Choosing letter
			char inputChar = input.next().charAt(0);
			System.out.println("You chose: " + inputChar);
			input.nextLine();
			char lowerCaseInputChar = Character.toLowerCase(inputChar);
			// Checking for letter occurence
			if(randomWord.toLowerCase().contains(String.valueOf(inputChar).toLowerCase())) {
				System.out.println("That letter is in the word.");
				// Identifying where the letter is at in the word and
				// putting the letter in the spaces array if identified
				for (int i = 0; i < randomWord.length(); i++) {
					char wordChar = randomWord.charAt(i);
					if (Character.toLowerCase(wordChar) == lowerCaseInputChar) {
						spaces[i] = String.valueOf(inputChar);
						System.out.println(Arrays.toString(spaces));
					}
				}
			}
			else {
				System.out.println("That letter is not in the word.");
			}
		} // closes for loop running the game 
		// Testing line to see what the word was & test spaces
		System.out.println(randomWord);
		System.out.println(Arrays.toString(spaces));
	}
}
