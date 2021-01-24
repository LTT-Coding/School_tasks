/* Task:
 * Create a dice in Java.
 * */
import java.util.Scanner;

public class Dice {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean dice = true;
		String placeHolder = "====================";
		
		do {
			System.out.println(placeHolder);
			System.out.println("Would you like to roll a dice? (Yes/No)");
			//Here his answer is taken from the console.
			String answer = scanner.next();
			//asked if his answer is "No
			if(answer.contains("No")) {
				dice = false;
			} else {
				//Here a random number between 1-6 is created.
				int diceNumber = (int) (Math.random() * (6 - 1 + 1) + 1);
				System.out.println("The rolled number is: " + diceNumber);
			}
			System.out.println(placeHolder + "\n");
		//If the Boolean dice is True, the Do While is repeated, if dice is False, the loop is closed.	
		}while (dice == true);
		
	}

}
