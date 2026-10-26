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
	private static int nextAccountNumber = 132;
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
	public void employeeToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Account Name " + Owner);
		System.out.println("AccountNum " + AccountNum);
		System.out.println("Account Balabce " + Balance);
		System.out.println("Active " + isActive);
		System.out.println("------------------------------");
		System.out.println("");
	}
}