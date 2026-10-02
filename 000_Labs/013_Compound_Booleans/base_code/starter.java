/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int point1 = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int point2 = sc.nextInt();
		System.out.print("Please enter your third number: ");
		int point3 = sc.nextInt();
		if(point1 > point2 && point1 > point3){
		System.out.println("Your first number is the largest of the three!");
		System.out.println("The number was " + point1);
		}
		else if(point2 > point3 && point2 > point1){
		System.out.println("Your second number is the largest of the three!");
		System.out.println("The number was " + point2);
		}
		else if(point3 > point2 && point3 > point1){
		System.out.println("Your third number is the largest of the three!");
		System.out.println("The number was " + point3);
		}
		else{

		}
		if(point1 < point2 && point1 < point3){
		System.out.println("Your first number is the smallest of the three!");
		System.out.println("The number was " + point1);
		}
		else if(point2 < point3 && point2 < point1){
		System.out.println("Your second number is the smallest of the three!");
		System.out.println("The number was " + point2);
		}
		else if(point3 < point2 && point3 < point1){
		System.out.println("Your third number is the smallest of the three!");
		System.out.println("The number was " + point3);
		}
	}
}
