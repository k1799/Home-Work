
package June;

import java.util.Scanner;
/*4.Generic Storage Box Create a generic class Box<T>. Menu:
Store Integer Store String Display Value Exit*/

public class GenericBoxDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Box<Object> box=new Box<>();
        
        while(true){
            System.out.println("1.Store Integer");
            System.out.println("2.Store String");
            System.out.println("3.Display Value");
            System.out.println("4.Exit");
            
            System.out.println("Enter Choice");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.println("Enter Integer");
                    box.setvalue(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter String");
                    box.setvalue(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Stored Value: "+box.getvalue());
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
