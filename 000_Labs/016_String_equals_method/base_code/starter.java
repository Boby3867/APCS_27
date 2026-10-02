/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
		String heroName = sc.nextLine();
		if(heroName.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(heroName.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else if(heroName.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
	}
}
