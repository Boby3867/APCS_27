/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = (int) (Math.random() * 10) + 1;
    int y = (int) (Math.random() * 10) + 1;
    int z = (int) (Math.random() * 10) + 1;
    System.out.print("guess a number from 1 - 10 : ");
    int guess1 = sc.nextInt();
    if(guess1 == x){
    System.out.print("good job now do it again : ");
    int guess2 = sc.nextInt();
        if(guess2 == x){
    System.out.print("good job now do it again : ");
    int guess3 = sc.nextInt();
        if(guess3 == x){
    System.out.println("Wow good job");
            }
            else{
                System.out.println("Sorry you got it wrong the number was " + z);
            }
        }
        else{
                System.out.println("Sorry you got it wrong the number was " + y);
            }
    }
    else{
                System.out.println("Sorry you got it wrong the number was " + x);
            }
    }
}
