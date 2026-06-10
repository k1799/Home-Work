
package June;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentClubManagement {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    Set<String> members=new HashSet<>();
    
    while(true){
     
        System.out.println("\n1.Add Member ");
        System.out.println("2.Remove Member");
        System.out.println("3.Search Member");
        System.out.println("4.Display All Members");
        System.out.println("5.Count Members");
        System.out.println("6.Exit");
        
        System.out.println("Enter Choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter Member Name:");
                String name=sc.nextLine();
                
                if(members.add(name)){
                    System.out.println("Member Added Successfully.");
                }
                else{
                    System.out.println("Member Alerady Exists.");
                }
                break;
            case 2:
                System.out.println("Enter Member Name: ");
                name=sc.nextLine();
                
                if(members.remove(name)){
                    System.out.println("Member Rmoved Successfully.");
                }
                else{
                    System.out.println("Member Alerady Exists.");
                }
                break;
            case 3:
               System.out.println("Enter Member Name: ");
                name=sc.nextLine();
                
                if(members.contains(name)){
                    System.out.println("Member Exists.");
                }
                else{
                    System.out.println("Member Not Found.");
                }
                break; 
            case 4:
               if(members.isEmpty()){
                   System.out.println("No members Available.");
               } 
               else{
                   System.out.println("Club Members:");
                   for(String member:members){
                       System.out.println(member);
                   }
               }
                break;
            case 5:
                System.out.println("Total Members: "+members.size());
                break;
            case 6:
                System.out.println("Exiting....");
                sc.close();
                System.exit(0);
                break;
            default :
                System.out.println("Ivalid Choice Choose 1 to 6");
        }
   }
  }
}
