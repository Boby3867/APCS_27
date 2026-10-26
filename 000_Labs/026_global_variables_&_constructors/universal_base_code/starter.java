/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount x = new BankAccount();
		x.employeeToString();
		BankAccount joe = new BankAccount("Joe");
		joe.employeeToString();
		BankAccount bell = new BankAccount("bell");
		bell.employeeToString();
		BankAccount cheese = new BankAccount("cheese");
		cheese.employeeToString();
		BankAccount pool = new BankAccount("pool");
		pool.employeeToString();
		System.out.print("what is your Account name ");
		String You = sc.nextLine();
		System.out.print("what is your Balance ");
		double YouBalace = sc.nextDouble();
		BankAccount YouBank = new BankAccount(You, YouBalace);
		YouBank.employeeToString();
	}
}
