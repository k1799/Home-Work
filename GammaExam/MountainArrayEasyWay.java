
package GammaExam;

import java.util.Scanner;


public class MountainArrayEasyWay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int ar [] = new int[size];
        System.out.println("Enter Array Values");
        for (int i = 0; i < size; i++) {
            ar[i]=sc.nextInt();
        }
        
        boolean mountain = false;
        
        //Array size minimum 3 irruka vandum
        if(size >=3){
        
            for (int i = 1; i < size -1; i++) {
               
                //Peak kandupudi
                if(ar[i] > ar[i-1] && ar[i]>ar[i+1]){
                boolean left = true;
                boolean right = true;
                
                //Peak muna increasing check
                    for (int j = 0; j < i; j++) {
                        if(ar[j] >= ar[j+1]){
                        left = false;
                        }
                    }
                    
                    //Peak bina degreasing check
                    for (int j = i; j < size-1; j++) {
                       if(ar[j] <= ar[j+1]){
                        right = false;
                        } 
                        
                    }
                    
                    if(left && right){
                    mountain = true;
                    }
                }
            }
        }
        
        if(mountain){
         System.out.println("Mountain Array");
        }
        else{
        System.out.println("Not Mountain Array");
        }
    }
}
