
package GammaExam;

import java.util.Scanner;


public class LoginValidation {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter User Name");
        String un = sc.nextLine();
        
        System.out.println("Enter Password");
        String pass = sc.nextLine();
        
        boolean username = true;
        boolean password = true;
        
        for (int i = 0; i < un.length(); i++) {
          
            if(un.length() < 4 || un.contains(" ") || Character.isDigit(un.charAt(i))){
             
                username = false;
            }
            
            if(un.charAt(i)=='@' || un.charAt(i)=='#' || un.charAt(i)=='$' || un.charAt(i)=='%' || un.charAt(i)=='&' || un.charAt(i)=='*' || un.charAt(i)=='!'){
            
                username = false;
            }
        }
        
             boolean capital = false;
             boolean number = false;
             boolean special = false;

        if(pass.length() < 6 ){
               password = false;
            }
        
        for (int i = 0; i < pass.length(); i++) {
            
            if(Character.isUpperCase(pass.charAt(i))){
                capital = true;
            }
            
            if(Character.isDigit(pass.charAt(i))){
                number = true;
            }
            
            if(Character.isLetterOrDigit(pass.charAt(i))){
                  special = true;
            }
        }
       
        if(!capital || !number || !special){
              password = false;
        }
        
        if(username && password){
            System.out.println("Login Successfully");
        }
        
        else{
            System.out.println("Invalid User Name and Password");
        }
        
    }
}
