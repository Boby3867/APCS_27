/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String heroName = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String Class = sc.nextLine();
		if(Class.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(Class.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else if(Class.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		int Points = 20;
		System.out.println("Strength (1-10): ");
		int Strength = sc.nextInt();
		if(Strength <= 10){
		System.out.println("Please input a smaller value. Strength (1-10): ");
		}
		else{
		Points = Points - Strength;
		System.out.println("You have" + Points + "left to spend.");
		}
		System.out.println("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		if(Dexterity <= 10){
		System.out.println("Please input a smaller value. Dexterity (1-10): ");
		}
		else{
		Points = Points - Dexterity;
		System.out.println("You have" + Points + "left to spend.");
		}
		System.out.println("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		if(Intelligence <= 10){
		System.out.println("Please input a smaller value. Intelligence (1-10): ");
		}
		else{
		Points = Points - Intelligence;
		System.out.println("You have" + Points + "left to spend.");
		}
		System.out.println("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		if(Charisma <= 10){
		System.out.println("Please input a smaller value. Charisma (1-10): ");
		}
		else{
		Points = Points - Charisma;
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + heroName + ", the " + title + " of CVHS.");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		System.out.println(" ");
		System.out.println("Good luck on your quest " + heroName + "!");
	}
}
