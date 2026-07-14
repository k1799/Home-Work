
package July;

import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int reverse = 0;
        
//        ithu oru style la
//        int reverse = 0;
//        
//        while(num != 0){
//        int digit = num % 10;
//        reverse = reverse * 10 + digit;
//        num = num / 10;
//        }
//        System.out.println(reverse);


//       ithu innoru style easy way
         while (num > 0){
         reverse = reverse * 10 +(num % 10);
         num = num / 10;
         
         }
          System.out.println(reverse);
    }
    
}
