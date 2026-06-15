
package June;

import java.util.Scanner;


public class UserIdValidation {
    public static void validateUserId(int userId)throws InvalidUserIdException{
    if(userId<=0){
    throw new InvalidUserIdException("User Id Must Be Positive");
    
    }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("Enter User Id");
            String input=sc.nextLine();
            
            int userId=Integer.parseInt(input);
            
            validateUserId(userId);
            
            System.out.println("Valid User Id: "+userId);
        }
        catch(NumberFormatException e){
            System.out.println("User Id must be a number");
        }
        catch(InvalidUserIdException i){
            System.out.println(i.getMessage());
        }
        sc.close();
    }
 
}
