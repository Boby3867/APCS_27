/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String Owner;
	private int AccountNum;
	private double Balance;
	private boolean isActive;
	private static int nextAccountNumber = (int) (Math.random() * 900) + 100;
	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = new String("unknown");
		Balance = 0;
		isActive = false;
		AccountNum = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String fn){
		Owner = fn;
		Balance = 0;
		isActive = true;
		AccountNum = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String fn, double num){
		Owner = fn;
		Balance = num;
		isActive = true;
		AccountNum = nextAccountNumber;
		nextAccountNumber++;
	}
	// -------METHODS-------
	public void displayAccountInfo(){					// Prints all values of the Employee	
		System.out.println("--- Account Info ---");
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNum);
		System.out.println("Account Balabce $" + Balance);
		System.out.println("Status: " + isActive);
		System.out.println("------------------------------");
		System.out.println("");
}
	public void setOwner(String a){
		Owner = a;
	}
	public String getOwner(){
		return Owner;
	}
	public void deposit(double a){
		if(isActive == true){
		Balance = Balance + a;
		}
		else{
		System.out.println("Account is closed. Cannot deposit.");
		}
	}
	public double getBalance(){
		return Balance;
	}
	public void withdraw(double a){
		if(Balance >= a){
			Balance = Balance - a;
		}
		else{
			System.out.println("Insufficient funds!");
		}
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: $" + Balance);
	}
	public void closeAccount(){
		isActive = false;
		System.out.println("Account closed for Jesse Pinkman");
	}
}