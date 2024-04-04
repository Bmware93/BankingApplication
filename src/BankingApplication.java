import java.util.Scanner;

public  class BankingApplication {

    public static void main(String[] args) {
    BankAccount user1;
        user1 = new BankAccount("Michael Jackson", "MJ0010");
        user1.showMenu();

    }
}

class BankAccount
{
    double balance;
    double previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String custName, String custId)
    {
        customerName = custName;
        customerId = custId;
    }

    void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(double amount)
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

        do {
            System.out.println("===========================================");
            System.out.println("Select an Option");
            System.out.println("===========================================");
            userOption = scanner.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch(userOption)
            {
                case 'A':
                    System.out.println("-------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("---------------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("---------------------------------------------");
                    double amountToDeposit = scanner.nextDouble();
                    deposit(amountToDeposit);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("---------------------------------------------");
                    System.out.println("Enter an amount to Withdraw: ");
                    System.out.println("-------------------------");
                    double amountToWithdraw = scanner.nextDouble();
                    withdraw(amountToWithdraw);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("---------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*******************************************");
                    break;

                default:
                    System.out.println("You've entered an Invalid option. Please try again.");

                    break;

            }

        } while (userOption != 'E');
        System.out.println("Thank you for using our services");
    }
}