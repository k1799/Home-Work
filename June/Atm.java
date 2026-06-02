
package June;


public class Atm {
    double balance=5000;
    
    void withdraw(double amount){
    try{
    if(amount>balance){
    throw new ArithmeticException("Insufficient Balance!");
    }
    balance-=amount;
    
        System.out.println("Withdrawal SuccessFull");
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    }
    
    void checkBalance(){
        System.out.println("Balance ="+balance);
    }
}
