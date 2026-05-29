
package May.Date29;

import java.util.Scanner;


public class ReverseeachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The sentence: ");
        String s=sc.nextLine();
        
        //StringBuilder s=new StringBuilder("Hello Java");
        
        String []words=s.split(" ");
        String result="";
        
        for (int i = 0; i < words.length; i++) {
           StringBuilder sb=new StringBuilder(words[i]);
           result=result+sb.reverse()+" ";
        }
        System.out.println("Reverse Sentense: ");
        System.out.println(result);
        //System.out.println(s.reverse()+" ");
    }
}
