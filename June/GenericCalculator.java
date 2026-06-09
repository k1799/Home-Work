
package June;

import java.util.Scanner;


public class GenericCalculator {
    public static void main(String[] args) {
       Scanner sc=new  Scanner(System.in);
       
       while(true){
           System.out.println("1.Add");
           System.out.println("2.Subtract");
           System.out.println("3.Exit");
           
           System.out.println("Enter Choice");
           int ch=sc.nextInt();
           
           System.out.println("1.Integer");
           System.out.println("2.Double");
           int type=sc.nextInt();
           
           switch(ch){
               case 1:
                   if(type==1){
                   Calculator<Integer> c=new Calculator<>();
                       System.out.println("Enter 2 Numbers: ");
                       int a=sc.nextInt();
                       int b=sc.nextInt();
                       System.out.println("Result = "+c.add(a,b));
                   }
                   else{
                   Calculator<Double> c=new Calculator<>();
                       System.out.println("Enter 2 Numbers: ");
                       double a=sc.nextDouble();
                       double b=sc.nextDouble();
                       System.out.println("Result = "+c.add(a,b));
                   }
                   break;
               case 2:
                  if(type==1){
                   Calculator<Integer> c=new Calculator<>();
                       System.out.println("Enter 2 Numbers: ");
                       int a=sc.nextInt();
                       int b=sc.nextInt();
                       System.out.println("Result = "+c.subtract(a,b));
                   }
                   else{
                   Calculator<Double> c=new Calculator<>();
                       System.out.println("Enter 2 Numbers: ");
                       double a=sc.nextDouble();
                       double b=sc.nextDouble();
                       System.out.println("Result = "+c.subtract(a,b));
                   }
                   break; 
               case 3:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Invalid Choice! Choose 1 to 3");
           }
       }
    }
  
}
