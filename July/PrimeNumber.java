
package July;

import java.util.Scanner;


public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        
        boolean isprime = true;
        
        if(num <= 1){
        isprime = false;
        }
        else{
            for (int i = 2; i < num; i++) {
               if(num % i == 0){
                   isprime = false;
                   break;
               } 
            }
        }
        
        if(isprime){
            System.out.println(num + "is a Prime Number");
        }
        else{
            System.out.println(num + "is a Not a Prime Number");
        }
    }
}
