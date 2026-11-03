/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int age = (int) (Math.random()*16) + 14;
		String nameA = randName();
		String nameB = randName();
		String nameC = randName();
		String nameD = randName();
		String nameE = randName();
		String nameF = randName();
		String nameG = randName();
		PooleDwarf Dwarf = new PooleDwarf(nameA, age);
		int duplicates = 0;
		if(Dwarf.isSameName(nameB)) duplicates++;
		if(Dwarf.isSameName(nameC)) duplicates++;
		if(Dwarf.isSameName(nameD)) duplicates++;
		if(Dwarf.isSameName(nameE)) duplicates++;
		if(Dwarf.isSameName(nameF)) duplicates++;
		if(Dwarf.isSameName(nameG)) duplicates++;
		System.out.println(Dwarf.getName() + " was the name with " + duplicates + " matches!");
		
	}
}
