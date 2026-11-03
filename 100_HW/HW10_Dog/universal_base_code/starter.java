/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Boolean a = false;
		System.out.println("Dog name?");
		String name = sc.nextLine();
		System.out.println("What age should " + name + " be?");
		int age = sc.nextInt();
		Dog Dog1 = new Dog(name, age);
		Dog Dog2 = new Dog("Walter Black", "Flat-Coated Retriever");
		if(Dog1.isSleeping() == true){
			System.out.println(Dog1.getName() + " is sleeping!");
		}
		else{ 
			System.out.println(Dog1.getName() + " is awake!");
			Dog1.bark();
			a = true;
		}
		if(Dog2.isSleeping() == true){
			if(a == true){
				System.out.println(Dog2.getName() + " wakes up from hearing " + Dog1.getName());
				Dog2.bark();
			}
			else{
				System.out.println(Dog1.getName() + " is sleeping! Don't wake " + Dog1.getName() + " up!");
				System.out.println(Dog2.getName() + " is sleeping too!");
			}
		}
		else{
			if(a == true){
				System.out.println(Dog2.getName() + " hears " + Dog1.getName());
				Dog2.bark();
			}
			else{
				System.out.println(Dog1.getName() + " is sleeping! Don't wake " + Dog1.getName() + " up!");
				System.out.println(Dog2.getName() + " isn't sleeping!");
			}
		}

	}
}
