package sori;

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
			String answer = scanner.next();
			if(answer.contains("No")) {
				dice = false;
			} else {
				int diceNumber = (int) (Math.random() * (6 - 1 + 1) + 1);
				System.out.println("The rolled number is: " + diceNumber);
			}
			System.out.println(placeHolder + "\n");
			
		}while (dice == true);
		
	}

}
