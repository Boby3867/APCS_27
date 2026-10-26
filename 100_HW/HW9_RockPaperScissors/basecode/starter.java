/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hand = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    while(true){
    System.out.println("Would you like to play the computer? (yes/no/done)");
    String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Please enter rock/paper/scissors: ");
        
            while(true){
            String RPS = sc.nextLine();
                if(RPS.equalsIgnoreCase("rock")){
                    break;
                }
                else if(RPS.equalsIgnoreCase("paper")){
                    hand++;
                    break;
                }
                else if(RPS.equalsIgnoreCase("scissors")){
                    hand = hand + 2;
                    break;
                }
                else{
                    System.out.println("Invalid input, please type in rock/paper/scissors: ");
                }
            }
        int computerHand = getObject();
        if(computerHand == hand) System.out.println("You tied!");
        else if(hand == 0 && computerHand == 1) System.out.println("You lost!");
        else if(hand == 0 && computerHand == 2) System.out.println("You won!!!");
        else if(hand == 1 && computerHand == 2) System.out.println("You lost!");
        else if(hand == 1 && computerHand == 0) System.out.println("You won!!!");
        else if(hand == 2 && computerHand == 0) System.out.println("You lost!");
        else System.out.println("You won!!!");
        hand = 0;
    }
    else if(answer.equalsIgnoreCase("no")){
        System.out.println("--------------------------------------------------------------");
        System.out.println("How many times would you like the computer to play itself?");
        int times = sc.nextInt();
        while(true){
        int what = Compare2();
        if(what == 0) a++;
        else if(what == 1) b++;
        else c++;
        times--;
        if(times == 0){
            break;
        }
        else{

        }
        }
        System.out.println("Player 1 wins: " + a);
        System.out.println("Player 2 wins: " + b);
        System.out.println("Ties: " + c);
        sc.nextLine();
    }
    else if(answer.equalsIgnoreCase("done")){
    System.out.println("--------------------------------------------------------------");
    System.out.println("Thanks for playing!");
    break;
    }
    else{
    System.out.println("--------------------------------------------------------------");
    System.out.println("You typed an invalid input!");
    }
    }
    }

    public static int getObject(){
    int computer = (int)(Math.random() * 3);
    return computer;
    }
    
    public static int Compare2(){
    int computer1 = (int)(Math.random() * 3);
    int computer2 = (int)(Math.random() * 3); 
    if(computer1 == computer2) return 2;
    else if(computer1 == 0 && computer2 == 1) return 1;
    else if(computer1 == 0 && computer2 == 2) return 0;
    else if(computer1 == 1 && computer2 == 2) return 1;
    else if(computer1 == 1 && computer2 == 0) return 0;
    else if(computer1 == 2 && computer2 == 0) return 1;
    else return 0;
    }
}
