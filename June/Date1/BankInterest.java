
package June.Date1;


public class BankInterest {
    static final String BANK_NAME ="ABC Bank";
    static final double INTEREST_RATE =7.5;
    
    double principal;
    int years;
    
    BankInterest(double principal,int years){
    this.principal=principal;
    this.years=years;
    }
    
    double calculateInterest(){
    return (principal*INTEREST_RATE*years)/100;
    }
    
    void display(){
        System.out.println("Bank Name: "+BANK_NAME);
        System.out.println("Principal Amount: "+principal);
        System.out.println("Years: "+years);
        System.out.println("Interest Amount: "+calculateInterest());
    }
}
