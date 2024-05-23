package JavaCodes.Opp3.Encapsulation_Abstraction;

public class BankAccount {
    private int account_number;
    private int balance;
    public BankAccount(){

    }
    public BankAccount(int account_number,int balance){
        this.account_number=account_number;
        this.balance=balance;
    }
    void UpdateAccount_number(int account_number){
        this.account_number=account_number;
    }
    void ShowAccount_number(){
        System.out.println("your acount number is "+account_number);
    }
    public void deposit(int amount){
            this.balance+=amount;
            System.out.println("deposited "+amount+" Updated balance is "+balance);

    }
    public void CheckBalance(){
        System.out.println("Your current balance is "+balance);
    }

    public void withdraw(int amount){
        if(balance>0 && balance>=amount){
            this.balance-=amount;
            System.out.println("remaining balance is "+balance+" "+amount+" is withdrawn");
        }
        else{
            System.out.println("No money");
        }
    }


}
