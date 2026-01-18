/*
Question Description
A bank wants to protect customer account balances so that they cannot be modified directly from outside the class.

Balance updates should only happen through controlled methods such as deposit and withdrawal.

Requirements
Create a class named BankAccount.
Store the following as private data members:
accountNumber
balance
Initialize account number and balance using a constructor.
Provide public methods to:
Deposit an amount
Withdraw an amount
Display account details
Use hardcoded data for testing the application.
UML Diagram
​
Hardcoded Data Set to Use
Description	Value
Account Number	1111
Initial Balance	5000
Deposit Amount	2000
Withdraw Amount	1000
Expected Output
Account: 1111, Balance: 6000
*/

public class BankAccountBalanceProtection{
    public static void main(String[] args){
        BankAccount p1 = new BankAccount(1111, 5000);
        p1.deposit(2000);
        p1.withdraw(1000);

        p1.display();
    }
}
class BankAccount{
    int accountNumber;
    int balance;


    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount){
        balance+=amount;
    }
    void withdraw(int amount){
        balance -= amount;
    }
    void display(){
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}