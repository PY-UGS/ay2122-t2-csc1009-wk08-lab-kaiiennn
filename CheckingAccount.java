package week8lab;

public class CheckingAccount {
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.getBalance()) { //If the amount the user want to withdraw is more than the current account balance
            throw new InsufficientFundsException(amount); //Throw exception
        }
        else {
            balance -= amount; //If the amount user want to withdraw is less than the current account balance
        }

    }

}
