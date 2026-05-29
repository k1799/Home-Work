
package May.Date29;

import java.util.Scanner;


public class WordCounter {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Sentence");
        String s=sc.nextLine();
        
        String noSpace=s.replace(" ","");
        
        int charCount=noSpace.length();
        
        String []words=s.split(" ");
        
        int wordCount=words.length;
        
        int vowelCount=0;
        
        for (int i = 0; i < s.length(); i++) {
          char ch=Character.toLowerCase(s.charAt(i));
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowelCount++;
            }
        }
        System.out.println("Character Without Spaces: "+charCount);
        System.out.println("Total Words: "+wordCount);
        System.out.println("Total Vowels: "+vowelCount);
        
        System.out.println("Original String: "+s);
    }
}
