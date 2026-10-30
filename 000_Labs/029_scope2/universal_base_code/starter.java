/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = "";
		int i = 0;
		if(shrek.isUgly()){
			statement = (shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(;i <= 4;){
			shrek.interact(donkey);
			i++;
		}
		System.out.println("That printed out " + i + " times");

	}
}
