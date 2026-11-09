/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
	int b = a - 1;
	while(true){
	if(b == 1){
		return true;
	}	
	else if(a % b == 0){
		return false;
	}
	else b--;
	}
	}
	public static void printPrimes(int num){
		int c = 2;
		while(true){
			if(c == num) break;
			else{
				if(checkPrime(c)){
					System.out.println(c);
					c++;
				}
				else c++;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int prime = sc.nextInt();
		printPrimes(prime);
	}
}
