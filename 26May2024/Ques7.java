import java.util.HashMap;
import java.util.Map;

class Account{
    String id;
    String name;
    String phoneNo;
    double balance;
    public Account(String id , String name ,double balance, String phoneNo){
        this.id=id;
        this.name=name;
        this.balance=balance;
        this.phoneNo=phoneNo;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

} 
class Bank{
    private Map<String, Account> accounts;
    public Bank() {
        accounts = new HashMap<>();
    }
    public void addAccount(String id, String name,String phoneNo, double balance) {
        if (!accounts.containsKey(id)) {
            Account newAccount = new Account(id, name,balance ,phoneNo);
            accounts.put(id, newAccount);
        } 
        else {
            System.out.println("Account already exists.");
        }
    }
    public void removeAccount(String id) {
        if (accounts.remove(id) != null) {
        } else {
            System.out.println("No such account exists.");
        }
    }

    public void depositToAccount(String id , double amount) {
        Account account = accounts.get(id);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("No such account exists.");
        }
    }
    public void withdrawFromAccount(String id, double amount) {
        Account account = accounts.get(id);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("No such account exists.");
        }
    }
}



public class Ques7{
    // Write a Java program to create a class called "Bank" with a collection of accounts and methods to add
    // and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to 
    // maintain account details of a particular customer.
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("12345", "Sarita Gupta","9950892070", 1000.00);
        bank.depositToAccount("12345", 500.00);
        bank.withdrawFromAccount("12345", 200.00);
        bank.removeAccount("12345");
        
    }

}