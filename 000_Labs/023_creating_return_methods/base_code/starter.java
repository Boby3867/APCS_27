/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void PowerNum(int a, int b){
	System.out.println("your answer is: " + (int)(Math.pow(a,b)));
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int num1 = sc.nextInt();
	System.out.println("What is your exponent number?");
	int num2 = sc.nextInt();
	PowerNum(num1, num2);
	}
}
