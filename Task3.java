//ATM machine
import java.util.*;

class Task3 
{
    Account ac=new Account();
    public void startATM() 
    {
        Scanner sc=new Scanner(System.in);
        int ch; // choice
        do 
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmt=sc.nextInt();
                    withdraw(withdrawAmt);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmt=sc.nextInt();
                    deposit(depositAmt);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } 
        while (ch!=4);
        sc.close();
    }

    public void withdraw(int amt) 
    {
        if (ac.getBalance()>=amt) 
        {
            ac.withdraw(amt);
            System.out.println("Withdrawal successful.");
        } 
        else 
        {
            System.out.println("Insufficient Balance.");
        }
    }

    public void deposit(int amt) 
    {
        ac.deposit(amt);
        System.out.println("Deposit successful.");
    }

    public void checkBalance() 
    {
        System.out.println("Your current balance is: " +ac.getBalance());
    }

    public static void main(String[] args) 
    {
        Task3 atm=new Task3();
        atm.startATM();
    }
}

class Account {
    private int balance;

    public Account() 
    {
        this.balance=0;
    }

    public void withdraw(int amt) 
    {
        this.balance-=amt;
    }

    public void deposit(int amt) 
    {
        this.balance+=amt;
    }

    public int getBalance() 
    {
        return this.balance;
    }
}
