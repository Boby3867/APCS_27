/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Poole ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int FindOwner = sc.nextInt();
		if(FindOwner == 1){
		System.out.println("Account successfully created!");
		System.out.println(" ");
		BankAccount unknown = new BankAccount();
		unknown.employeeToString();
		System.out.println(" ");
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		sc.nextLine();
		String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("yes")){
				unknown.balanceToString();
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(answer.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked.");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
		}
		else if(FindOwner == 2){
			System.out.print("What is the name of the owner of this bank account? ");
			sc.nextLine();
			String Owner = sc.nextLine();
			System.out.println(" ");
			BankAccount YourPlace = new BankAccount(Owner);
			YourPlace.employeeToString();
			System.out.println("Would you like to check your balance of this account? (yes/no) ");
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("yes")){
				YourPlace.balanceToString();
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(answer.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked.");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
		}
		else if(FindOwner == 3){
			System.out.print("What is the name of the owner of this bank account? ");
			sc.nextLine();
			String Owner = sc.nextLine();
			System.out.print("How much are you initally depositing into this account? ");
			double InPut = sc.nextDouble();
			BankAccount YouBank = new BankAccount(Owner, InPut);
			YouBank.employeeToString();
			System.out.println("Would you like to check your balance of this account? (yes/no) ");
			sc.nextLine();
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("yes")){
				YouBank.balanceToString();
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(answer.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked.");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
				System.out.println(" ");
				System.out.println("Thank you for coming to the Poole ATM!");
			}
		}
		else{
			System.out.println(" ");
			System.out.println("Account unsuccessfuly created!");
		}
	}
}
