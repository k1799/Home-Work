
package GammaExam;

import java.util.Scanner;


public class CheckMountainArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int ar [] = new int[size];
        System.out.println("Enter Array Value");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        
        
        boolean result = true;
        
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == ar[ar.length-1-i]){
            result = false;
            }
            if(ar.length<2){
            result = false;
            }
             
        }
        
        
       if(result){
           System.out.println("It Is a Mountain Array");
       }
       
       else{
           System.out.println("It Is a Not Mountain Array");
       }
    }
}
