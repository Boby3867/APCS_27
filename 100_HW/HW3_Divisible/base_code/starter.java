/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int top = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int down = sc.nextInt();
		if(top % 2 == 0){
			System.out.println(top + " is divisible by 2");
		}
		else{
			System.out.println(top + " is not divisible by 2");
		}
		if(top % 3 == 0 || top % 4 == 0 || top % 5 == 0){
			System.out.println(top + " is divisible by 3");
			System.out.println(top + " is divisible by 4");
			System.out.println(top + " is divisible by 5");
		}
		else if(top % 3 == 0 || top % 4 == 0){
			System.out.println(top + " is divisible by 3");
			System.out.println(top + " is divisible by 4");
		}
		else if(top % 4 == 0 || top % 5 == 0){
			System.out.println(top + " is divisible by 4");
			System.out.println(top + " is divisible by 5");
		}
		else if(top % 3 == 0 || top % 5 == 0){
			System.out.println(top + " is divisible by 3");
			System.out.println(top + " is divisible by 5");
		}
		else if(top % 3 == 0){
			System.out.println(top + " is divisible by 3");
		}
		else if(top % 4 == 0){
			System.out.println(top + " is divisible by 4");
		}
		else if(top % 5 == 0){
			System.out.println(top + " is divisible by 5");
		}
		else{
			System.out.println(top + " is not divisible by 3, 4, or 5!");
		}
		System.out.println("  ");
		if(down % 2 == 0){
			System.out.println(down + " is divisible by 2");
		}
		else{
			System.out.println(down + " is not divisible by 2");
		}
		if(down % 3 == 0 && down % 4 == 0 && down % 5 == 0){
			System.out.println(down + " is divisible by 3");
			System.out.println(down + " is divisible by 4");
			System.out.println(down + " is divisible by 5");
		}
		else if(down % 3 == 0 && down % 4 == 0){
			System.out.println(down + " is divisible by 3");
			System.out.println(down + " is divisible by 4");
		}
		else if(down % 4 == 0 && down % 5 == 0){
			System.out.println(down + " is divisible by 4");
			System.out.println(down + " is divisible by 5");
		}
		else if(down % 3 == 0 && down % 5 == 0){
			System.out.println(down + " is divisible by 3");
			System.out.println(down + " is divisible by 5");
		}
		else if(down % 3 == 0){
			System.out.println(down + " is divisible by 3");
		}
		else if(top % 4 == 0){
			System.out.println(top + " is divisible by 4");
		}
		else if(top % 5 == 0){
			System.out.println(top + " is divisible by 5");
		}
		else{
			System.out.println(top + " is not divisible by 3, 4, or 5!");
		}
	}
}
