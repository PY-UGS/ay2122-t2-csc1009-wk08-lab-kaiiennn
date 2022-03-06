package week8lab;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your deposit amount: "); //Get deposit input
        double depositAmount = input.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(500, "A12345"); //Initialize
        checkingAccount.deposit(depositAmount);

        try {
            System.out.println("Please enter your withdrawal amount: "); //Get withdrawal input
            double withdrawalAmount = input.nextDouble();
            checkingAccount.withdraw(withdrawalAmount);
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance()); //get Balance after withdrawal

        } catch (InsufficientFundsException e) { //If the exception is thrown in the class
            System.out.println("Sorry, but your account is short by: $ " + (checkingAccount.getBalance() - e.getAmount()));
        }
    }
}
