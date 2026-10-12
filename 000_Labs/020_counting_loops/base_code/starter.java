/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter an integaer: ");
		int num = sc.nextInt();
		int view = 0;
		while(true){
			System.out.println(view + ". " + name);
			view = view + 1;
			if(view == num){
				break;
			}
			else{

			}
			}
		}
	}
