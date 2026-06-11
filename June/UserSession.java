
package June;


public class UserSession {
    private static UserSession obj;
    private String userName;
    
    private UserSession(){
    if(obj!=null){
    throw new RuntimeException("Use getInstance()");
    }
    }
    public static UserSession getInstance(){
    if(obj==null){
    obj=new UserSession();
    }
    return obj;
    }
    public void setUser(String name){
    userName=name;
    }
    public void showUser(){
        System.out.println("User Name: "+userName);
    }
}
