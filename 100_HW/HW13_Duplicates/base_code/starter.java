/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int [] arr = new int [20];
	int len = arr.length;
	System.out.println("The elements are: ");
	System.out.println("----------------------------------------------------------------- ");
	for(int i = 0; i < len; i++){
		arr[i] = (int)(Math.random() * 10)+1;
		System.out.print(arr[i] + " ");
	}
	System.out.println(" ");
	System.out.println("----------------------------------------------------------------- ");
	int num = (int) (Math.random() * 10) + 1;
	int found = 0;
	System.out.println("The random number to look for is " + num);
	for(int a = 0; a < len; a++){
		if(arr[a] == num){
			System.out.println("Duplicate found at index " + a);
			found++;
		}
	}
	System.out.println("Total number of duplicates for " + num + " is " + found);
	System.out.println("----------------------------------------------------------------- ");
	for(int b = 0; b < len - 1 ; b++){
		if(b == 0){
			System.out.println("Looking for two in a row: ");
		}
		else if(arr[b+1] == arr[b]){
			System.out.println("Two in a row found at indexes " + b + " and " + (b+1) + ". The number is " + arr[b]);
		}
	}
	}
}
