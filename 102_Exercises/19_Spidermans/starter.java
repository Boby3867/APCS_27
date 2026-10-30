/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman();
		Spiderman b = new Spiderman("Nike");
		Spiderman c = new Spiderman(25);	
		Spiderman d = new Spiderman("Bob", 25);
		Spiderman e = new Spiderman("Bob", 25, "Nike");


		a.setActor("Mr. Cheese");
		a.setVillain("Dr. Mold");
		
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman Black = new Spiderman("Mile", 16, "Spot");

		
	}
}
