/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num2 = sc.nextDouble();
		int num1 = sc.nextInt();
		double answer;
		answer = Math.pow(num2, num1);
		System.out.print(answer);
		System.out.println("Second number (decimal): ");
		System.out.print(num2 + " to the " + num1 + " power, is ");
		System.out.println("First Number :");
	}
}
