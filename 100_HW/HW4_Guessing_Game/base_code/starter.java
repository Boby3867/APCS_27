/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int guess =(int) (Math.random() * 10);
	System.out.println("The goal of the game is to guess a word with two hints! ");
	System.out.println(" ");
	if(guess == 2){
	System.out.println("It's a fruit!");
	System.out.print("What is your guess? ");
	String fruit = sc.nextLine();
	System.out.println(" ");
		if(fruit.equalsIgnoreCase("apple")){
			System.out.println("You got it! Woo! ");
		}
		else{
			System.out.println(" ");
			System.out.println("You sadly didn't guess right, here's another hint! ");
			System.out.println("It's a red fruit! ");
			String fruit2 = sc.nextLine();
			System.out.println(" ");
			if(fruit2.equalsIgnoreCase("apple")){
				System.out.println("You got it! Woo! ");
			}
			else{
				System.out.println("The answer was apple, better luck next time! ");
			}
		}
	}
	else if(guess == 1){
	System.out.print("It's a feline friend! ");
	String friend = sc.nextLine();
	if(friend.equalsIgnoreCase("cat")){
			System.out.println("You got it! Woo! ");
		}
		else{
			System.out.println(" ");
			System.out.println("You sadly didn't guess right, here's another hint! ");
			System.out.println("It's a feline friend? ");
			String friend2 = sc.nextLine();
			System.out.println(" ");
			if(friend2.equalsIgnoreCase("cat")){
				System.out.println("You got it! Woo! ");
			}
			else{
				System.out.println("The answer was earth, better luck next time! ");
			}
		}
	}
	else{
	System.out.print("It's a planet in our solar system! ");
	String planet = sc.nextLine();
	if(planet.equalsIgnoreCase("earth")){
			System.out.println("You got it! Woo! ");
		}
		else{
			System.out.println(" ");
			System.out.println("You sadly didn't guess right, here's another hint! ");
			System.out.println("It's the only one with humans on it! ");
			String planet2 = sc.nextLine();
			System.out.println(" ");
			if(planet2.equalsIgnoreCase("earth")){
				System.out.println("You got it! Woo! ");
			}
			else{
				System.out.println("The answer was earth, better luck next time! ");
			}
		}
	}
	}
}
