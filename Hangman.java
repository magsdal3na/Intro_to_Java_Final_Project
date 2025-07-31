import java.util.Scanner; // needed to read player input
import java.util.Random; // needed to generate random word
import java.util.ArrayList; // needed to hold word list

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

		// Start of game
		System.out.println("  -----");
		System.out.println("  |   |");
		System.out.println("  |    ");
		System.out.println("  |    ");
		System.out.println("  |    ");
		System.out.println("  |    ");
		System.out.println("-----  ");
		System.out.println("Choose your first letter: ");

		// Choosing letter
		char inputChar = input.next().charAt(0);
		System.out.println("You chose: " + inputChar);
		input.nextLine();
		// Checking for letter occurence 
		if(randomWord.toLowerCase().contains(String.valueOf(inputChar).toLowerCase())) {
		    System.out.println("That letter is in the word.");
		}
		else {
		    System.out.println("That letter is incorrect.");
		}
		System.out.println(randomWord);
	}
}
