package week8lab;

public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount){ //When throwing a new exception, this constructor will be called
        this.amount = amount; //It will take in an amount argument
    }

    public double getAmount(){
        return amount;
    }
}
