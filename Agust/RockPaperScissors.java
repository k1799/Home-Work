
package Agust;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Enter your Choice:");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        
        int userchoice = sc.nextInt();
        
        //check invalid choice
        if(userchoice<1 || userchoice >3){
            System.out.println("Invalid Choice. Please Select 1,2, and ");
            return;
        }
        
        int compchoice = random.nextInt(3)+1;
        
        String user;
        String computer;
        
        if(userchoice == 1){
        user = "Rock";
        }
        else if(userchoice == 2){
        user = "Paper";
        }
        else{
        user = "Scissors";
        }
        
        if(compchoice == 1){
          computer = "Rock";
        }
        else if(compchoice == 2){
          computer = "Paper";
        }
        else{
          computer = "Scissors";
        }
        
        System.out.println("You Chose: " +user);
        System.out.println("Computer Chose: " +computer);
        
        //decide winner
        if(userchoice == compchoice){
            System.out.println("Result : Draw");
        }
       else if ((userchoice == 1 && compchoice == 3) ||
                 (userchoice == 2 && compchoice == 1) ||
                 (userchoice == 3 && compchoice == 2)) {
            System.out.println("Result: You win!");
        }
        else{
            System.out.println("Result: Computer Wins!");            
        }
        sc.close();
    }
}
