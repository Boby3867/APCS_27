/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee( 1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		Employee joe = new Employee(3213, "Joe", "Pool", 3542.5);
		joe.employeeToString();
		michael.raiseSalary(10);
		System.out.println(michael.getSalary());
		System.out.println(michael.getAnnualSalary());
		dwight.raiseSalary(10);
		System.out.println(dwight.getSalary()); 
		System.out.println(dwight.getAnnualSalary()); 
		jim.raiseSalary(10);
		System.out.println(jim.getSalary()); 
		System.out.println(jim.getAnnualSalary()); 
		Pam.raiseSalary(10);
		System.out.println(Pam.getSalary()); 
		System.out.println(Pam.getAnnualSalary()); 
		joe.raiseSalary(10);
		System.out.println(joe.getSalary()); 
		System.out.println(joe.getAnnualSalary()); 
	}
}
