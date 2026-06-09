
package June;

import java.util.Scanner;

/*1. Traffic Signal System Write a menu-driven console 
program using enum to represent traffic signals (RED, YELLOW, GREEN). Menu:
Show Signal Meaning Check Stop or Go Exit*/

public class TrafficSignalSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("1.Show signal Meaning");
            System.out.println("2.Check Stop or Go");
            System.out.println("3.Exit");
            System.out.println("Enter Choice");
            
            int ch=sc.nextInt();
            
            switch(ch){
                case 1:
                    for(TrafficSignal t:TrafficSignal.values()){
                    switch(t){
                        case RED:
                            System.out.println("RED = Stop");
                            break;
                        case YELLOW:
                            System.out.println("YELLOE = Wait");
                            break;
                        case GREEN:
                            System.out.println("GREEN = Go");
                            break;
                         }
                       }
                    break;
                case 2:
                    System.out.println("Enter Signal(RED/YELLOW/GREEN): ");
                    TrafficSignal signal=TrafficSignal.valueOf(sc.next().toUpperCase());
                    
                    if(signal==TrafficSignal.GREEN){
                        System.out.println("Go");
                    }
                    else if(signal==TrafficSignal.YELLOW){
                        System.out.println("Wait");
                    }
                    else{
                        System.out.println("Stop");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Choice! Choose 1 to 3");
            
            }
        }
    }
}
