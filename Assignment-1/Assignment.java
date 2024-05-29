import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class BankAccount {
    //Declare the attributes AccountNo, balance,accountHolderName
    String accountNo;
    private Double balance;
    String accountHolderName;
    //Method to deposit the amount in the account
    void deposit(double amount){
        if(amount<=0) System.out.println("The amount entered is invalid");
        this.balance += amount;
    }
    //Method to withdraw the amount from the account
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    //Method to get the balance of the account;
    double displayBalance(){
        System.out.println("The current balance of the "+this.accountNo+" is: "+this.balance);
        return this.balance;
    }
    abstract void addInterest();
}
class SavingAccount extends BankAccount{
    //Attributes for Saving Account
    LocalDate lastInterestDate;
    private int interestRate=5;
    //method to add Interest on the amount to the balance in saving Account
    void addInterest(){
        LocalDate d2=LocalDate.now();
        long time = ChronoUnit.DAYS.between(this.lastInterestDate, d2);
        time /= 365;
        this.lastInterestDate= LocalDate.now();
        double SI=(super.displayBalance()*time* this.interestRate)/100;
        //to deposit the Interest amount to the account as balance cannot be changed Directly 
        this.deposit(SI);
    }
}
class CurrentAccount extends BankAccount
{
    //as there is no interest system in current account, so no interest is added to the balance of the 
    //current account
    void addInterest()
    {
        System.out.println("There is no rate of interest in current account");
    }
    double OverdraftLimit=10000;
    //Method withdraw is override in the current account class as there is a limit below which the current account 
    //Balance can't go 
    void withdraw(double amount) {
        if (amount > 0 && amount <= this.displayBalance()-OverdraftLimit) {
            this.withdraw(amount);
        } 
        else {
            System.out.println("Insufficient balance or invalid amount to withdraw.");
        }
    }
}
public class Assignment{
    public static void main(String[] args) {
        
    }
}