import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class BankAccount {
    //Declare the attributes AccountNo, balance,accountHolderName
    private String accountNo;
    private Double balance;
    private String accountHolderName;
    //Constructor for BankAccount class
    public BankAccount(String accountNo, double balance, String accountHolderName) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    //Method to deposit the amount in the account
    void deposit(double amount){
        if(amount<=0) System.out.println("The amount entered is invalid");
        this.balance += amount;
    }
    //Method to withdraw the amount from the account are different so we make it a abstract class
    public abstract void withdraw(double amount);
    //Method to get the balance of the account;
    void displayBalance(){
        System.out.println("The current balance of the "+this.accountNo+" is: "+this.balance);
    }
    public double getBalance()
    {
        return this.balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNo()
    {
        return this.accountNo;
    }
    public String accountHolderName()
    {
        return this.accountHolderName;
    }
}
class SavingAccount extends BankAccount{
    private LocalDate lastInterestDate;
    private int interestRate=5;
    SavingAccount(String accountNo, String name,double balance,LocalDate localDate)
    {
        super(accountNo, balance, name);
        this.lastInterestDate=localDate;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.getBalance()) {
            this.setBalance(this.getBalance() -amount);
        } 
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    //Attributes for Saving Account
    //method to add Interest on the amount to the balance in saving Account
    void addInterest(){
        LocalDate d2=LocalDate.now();
        long time = ChronoUnit.DAYS.between(this.lastInterestDate, d2);
        double t=time;
        t /=365;
        this.lastInterestDate= LocalDate.now();
        double SI=(super.getBalance()*t* this.interestRate)/100;
        //to deposit the Interest amount to the account as balance cannot be changed Directly 
        this.setBalance(SI+getBalance());
    }
}
class CurrentAccount extends BankAccount
{
    private double OverdraftLimit;
    //Method withdraw is override in the current account class as there is a limit below which the current account 
    //Balance can't go 
    public CurrentAccount(String accountNumber, double balance, String accountHolderName, double OverdraftLimit) {
        super(accountNumber, balance, accountHolderName);
        this.OverdraftLimit= OverdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.getBalance()+OverdraftLimit) {
            this.setBalance(this.getBalance()-amount);
        } 
        else {
            System.out.println("Insufficient balance or invalid amount to withdraw.");
        }
    }
}
public class Assignment{
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("001326628017386", "Bhavya Gupta",1000.00,LocalDate.of(2024,01,01));
        s1.displayBalance();
        
        // deposit operation on SavingAccount
        s1.deposit(500.0);
        s1.displayBalance();

        // withdraw operation on SavingsAccount
        s1.withdraw(300.0);
        s1.displayBalance();

        // Adding interest to the SavingsAccount
        s1.addInterest();
        s1.displayBalance();

        System.out.println("       ");
        CurrentAccount c1 = new CurrentAccount("007645789765309", 2000.0, "Bhavya Gupta", 10000.0);
        c1.displayBalance();
        //deposit operation on CurrentAccount
         c1.deposit(700.0);
         c1.displayBalance();

         c1.withdraw(3000.0);
         c1.displayBalance();
    }
}