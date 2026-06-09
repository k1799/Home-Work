
package June;

import java.util.Scanner;

/*2. Weekday Working System Create an enum for days of the week. Menu: 
Check if day is Working Day Check 
if day is Weekend Display All Days Exit*/

public class WeekDaySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("1.Working Day?");
            System.out.println("2.Weekend?");
            System.out.println("3.Display All Days");
            System.out.println("4.Exit");
            
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Day: ");
                    Day d1=Day.valueOf(sc.next().toUpperCase());
                    
                    if(d1==Day.SATURDAY || d1==Day.SUNDAY){
                        System.out.println("Not Working Day");
                    }
                    else{
                        System.out.println("Working Day");
                    }
                    break;
                case 2:
                    System.out.println("Enter Day: ");
                    Day d2=Day.valueOf(sc.next().toUpperCase());
                    
                    if(d2==Day.SATURDAY || d2==Day.SUNDAY){
                        System.out.println("Weekend");
                    }
                    else{
                        System.out.println("Not Weekend");
                    }
                    break;
                case 3:
                    for(Day d:Day.values()){
                        System.out.println(d);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Choice! Choose 1 to 4");
            }
        
        }
        
        
    }
}
