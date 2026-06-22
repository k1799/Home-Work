
package GammaExam;

import java.util.Scanner;


public class MountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int ar [] = new int[size];
        System.out.println("Enter Array Value");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        
        int n=ar.length;
        int peak=0;
        while(peak < n -1 && ar[peak] < ar[peak+1]){
        peak++;
        }
        
        if(peak == 0 || peak==n-1){
            System.out.println("Not Mountain Array");
        }
        
        while(peak < n -1 && ar[peak] > ar[peak+1]){
        peak++;
        }
        if(peak==n-1){
            System.out.println("Mountain Array");
        }
        else{
        System.out.println("Not Mountain Array");
        }
        
    }
 
}
