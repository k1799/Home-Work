
package June;

import java.util.Scanner;


public class MainBankInterestDetail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal=sc.nextDouble();
        
        System.out.print("Enter number of Years: ");
        int years=sc.nextInt();
        
        BankInterest b=new BankInterest(principal,years);
        b.display();
    }
   
}
