/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("I love to learn coding remotely."); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("	a. If two numbers match, you double your money."); 
		System.out.println("	b. If three numbers match, you triple your money."); 
		System.out.println("	c. If none match, you lose your money."); 
		System.out.println("--------------------------------------------------"); 
		int points = 100;
		while(true){
			System.out.println(""); 
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) :"); 
			System.out.print(" "); 
			String lets = sc.nextLine();
			if(lets.equalsIgnoreCase("yes") || lets.equalsIgnoreCase("y")){
			System.out.print("You have $" + points + ". How much would you like to wager? "); 
			int hate = sc.nextInt();
			sc.nextLine();
			if(points < hate){
			while(true){
				System.out.print("You have $" + points + "! Please enter a smaller number : "); 
				hate = sc.nextInt();
				if(points >= hate){
					points = points - hate;
					break;
				}
				else{
					
				}
			}
			}
			else{
				points = points - hate;
			}
			int num1 = (int) (Math.random() * 10) + 1;
			int num2 = (int) (Math.random() * 10) + 1;
			int num3 = (int) (Math.random() * 10) + 1;
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are: ");
			System.out.println("_______________________");
			System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " | ");
			System.out.println("_______________________");
			if(num1 == num2 && num1 == num3){
			System.out.println("JACKPOT! You're wager has now been tripled!");
			points = points + hate * 3;
			System.out.println("You now have $" + points + ".");
			System.out.println("--------------------------------------------------");
			}
			else if(num3 == num1){
			points = points + hate * 2;
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have $" + points + ".");
			System.out.println("--------------------------------------------------");
			}
			else if(num2 == num3){
			points = points + hate * 2;
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have $" + points + ".");
			System.out.println("--------------------------------------------------");
			}
			else if(num1 == num2){
			points = points + hate * 2;
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have $" + points + ".");
			System.out.println("--------------------------------------------------");
			}
			else{
			System.out.println("Didn't win this time, better luck next time!");
			System.out.println("You now have $" + points + ".");
			System.out.println("--------------------------------------------------");
			if(points == 0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
			}
			}
			else if(lets.equalsIgnoreCase("no") || lets.equalsIgnoreCase("n")){
				System.out.println("Sad to see you go! You still have $" + points + " left. Come again soon! Thanks!");
				break;
			}
			else{
			System.out.println("That wasn't quite the correct answer. Try again.");
			System.out.println("--------------------------------------------------");
			}
		}
	}
}
