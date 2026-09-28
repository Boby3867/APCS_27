/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int FortuneCookie =(int) (Math.random() * 10);
	if(FortuneCookie == 9){
	System.out.println("The next step you take will be the right one.");
	}
	else if(FortuneCookie == 8){
	System.out.println("A helping hand will come when you need it.");
	}
	else if(FortuneCookie == 7){
	System.out.println("Today's effort becomes tomorrow's achievement.");
	}
	else if(FortuneCookie == 6){
	System.out.println("Your determination will impress someone important.");
	}
	else if(FortuneCookie == 5){
	System.out.println("A challenge today becomes a story worth telling tomorrow.");
	}
	else if(FortuneCookie == 4){
	System.out.println("Your creativity will open a door today.");
	}
	else if(FortuneCookie == 3){
	System.out.println("The answer you need is closer than you think.");
	}
	else if(FortuneCookie == 2){
	System.out.println("A great opportunity is about to knock.");
	}
	else{
	System.out.println("Someone believes in you more than you know.");
	}
	}
}
