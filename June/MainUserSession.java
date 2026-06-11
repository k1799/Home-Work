
package June;


public class MainUserSession {
    public static void main(String[] args) {
        
        UserSession s1=UserSession.getInstance();
        s1.setUser("Kannan");
        
        UserSession s2=UserSession.getInstance();
        s2.showUser();
        
        System.out.println("Same Object: "+(s1==s2));
    }
}
