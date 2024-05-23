package JavaCodes.Opp3.Encapsulation_Abstraction;

public class Main_Encapsulation_Abstraction {
    public static void main(String[] args) {
        BankAccount a=new BankAccount(23454,10000);
        a.CheckBalance();
        a.withdraw(2000);
        a.deposit(1000);
        //BankAccount b=new BankAccount();
//        a.UpdateAccount_number(100000);
//        a.ShowAccount_number();

    }
}
