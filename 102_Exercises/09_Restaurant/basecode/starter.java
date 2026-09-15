/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================== ");
		System.out.println("         WELCOME RESTAURANT OWNER!          ");
		System.out.println("=========================================== ");
		System.out.print("What's is the name of your restaurant? ");
		String restaurant = sc.nextLine();
		System.out.println(" ");
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.println(" ");
		System.out.println("Great to see you, " + name + "! let's set up a menu for cheese cake!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println(" ");
		System.out.println(" --- Item #1 --- ");
		System.out.print("Item name: ");
		String Item1 = sc.nextLine();
		System.out.print("Price of " + Item1 + " ($): ");
		double cost1 = sc.nextDouble();
		System.out.print("How many " + Item1 + " would you like? ");
		int much1 = sc.nextInt();
		System.out.println("Added " + much1 + "x cake to your order! ($" + (much1*cost1) + ")");
		sc.nextLine();
		System.out.println(" --- Item #2 --- ");
		System.out.print("Item name: ");
		String Item2 = sc.nextLine();
		System.out.print("Price of " + Item2 + " ($): ");
		double cost2 = sc.nextDouble();
		System.out.print("How many " + Item2 + " would you like? ");
		int much2 = sc.nextInt();
		System.out.println("Added " + much2 + "x cake to your order! ($" + (much2*cost2) + ")");
		sc.nextLine();
		System.out.println(" --- Item #3 --- ");
		System.out.print("Item name: ");
		String Item3 = sc.nextLine();
		System.out.print("Price of " + Item3 + " ($): ");
		double cost3 = sc.nextDouble();
		System.out.print("How many " + Item3 + " would you like? ");
		int much3 = sc.nextInt();
		System.out.println("Added " + much3 + "x cake to your order! ($" + (much3*cost3) + ")");
		System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		int tip = sc.nextInt();
		System.out.println("=========================================== ");
		System.out.println("            " + restaurant + " - Menu For Today         ");
		System.out.println("Owner: " + name);
		System.out.println("-------------------------------------------");
		System.out.println("Item                   Qty      Price");
		System.out.println("-------------------------------------------");
		System.out.println(Item1+ "                   " + much1 +"     " + cost1);
		System.out.println(Item2+ "                   " + much2 +"     " + cost2);
		System.out.println(Item3+ "                   " + much3 +"     " + cost3);
		System.out.println("-------------------------------------------");
		double Subtotal = cost1 + cost2 + cost3;
		System.out.println("Subtotal                        " + Subtotal);
		System.out.println("Tax (9.75%):                    " + (Subtotal*0.0975));
		System.out.println("Tip                             " + tip);
		System.out.println("Tip Amount:                     " + (tip/100*Subtotal));
        System.out.println("=========================================== ");
		System.out.println("TOTAL:                            $" + (Subtotal + Subtotal*0.0975 + tip/100*Subtotal));
        System.out.println("=========================================== ");
		System.out.println(" ");
		System.out.println("Thanks for eating at" + restaurant + "!");
		System.out.println("Come back soon -- we'll always have a byte for you");
	}
}
