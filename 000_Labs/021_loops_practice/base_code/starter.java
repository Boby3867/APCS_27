/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int my = (int) (Math.random() * 1000) + 1;
		while(true){
			System.out.print("Please enter a number between 1 and 1000: ");
			int your = sc.nextInt();
			if(my > your){
			System.out.println("Your number was too low, guess again.");
			}
			else if(my < your){
				System.out.println("Your number was too high, guess again.");
			}
			else{
				System.out.println("You got the number!!! Congrats!");
				break;
			}
		}


		
	}
}
