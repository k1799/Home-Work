
package June;


public class Login {
  String username="admin";
  String password="1234";
  int attempts=3;
    
  void loginCheck(String u,String p)throws Exception{
  if(u.equals(username) && p.equals(password)){
      System.out.println("Login Successfully");
  }
  else{
      attempts--;
      System.out.println("Invalid Credentials");
      
      System.out.println("Remaining Attempts: "+attempts);
      if(attempts==0){
      throw new Exception("Account Locked");
      }
  }
  }
}
