import java.util.Scanner;

public  class BankingApplication {

    public static void main(String[] args) {

    }
}

class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String custName, String custId)
    {
        customerName = custName;
        customerId = custId;
    }

    void deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw( int amount)
    {
        if(amount > 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println("Deposited: "+previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No previous transactions occurred");
        }
    }

    void showMenu()
    {
        char userOption = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your Id is: "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
    }
}