/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[3001];
		int a = 1;
		while(a < 3001){
			arr[a] = a;
			if(arr[a]%3 == 0){
				System.out.print(arr[a] + "  ");
				a++;
			}
			else a++;
		}
		System.out.print("---------------------------------------------------------------------");
		int [] kgl = new int [1001];
		int len = kgl.length - 1;	
		while(true){
			System.out.print(len + "  ");
			len--;
			if(len == 0) break;
		}
	}
}
