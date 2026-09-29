/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int yournum = sc.nextInt();
		int randomnum = (int) (Math.random() * 1000) + 1;
		if(yournum == randomnum){
			System.out.println("Wow your pick the random number. good job");
		}
		else if(yournum >= randomnum){
			System.out.println("Your number was larger than the number. The number was " + randomnum + ".");
		}
		else{
			System.out.println("Your number was smaller than the number. The number was " + randomnum + ".");
		}
	}
}
