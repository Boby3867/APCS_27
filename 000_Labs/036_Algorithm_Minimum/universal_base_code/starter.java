/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [(int) (Math.random()*150) + 51];
		int len = arr.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.println("The elements are: ");
		System.out.println("----------------------------------------------------------------- ");
		for(int i = 0; i < len; i++){
		arr[i] = (int)(Math.random() * 100)+1;
		System.out.print(arr[i] + " ");
		if(arr[i] < min) min = arr[i];
		if(arr[i] > max) max = arr[i];
		// BaseClass test = new BaseClass();
		}
		System.out.println("----------------------------------------------------------------- ");
		System.out.println("There are " + len + " number of elements.");
		System.out.println("The maximum of " + len + " random numbers is: " + min);
		System.out.println("The minimum of " + len + " random numbers is: " + max);
	}
}
