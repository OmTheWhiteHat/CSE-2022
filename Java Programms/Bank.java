import java.io.*;
import java.util.*;
public class Bank {
    public String nameOfDepositor;
    public int accNumber;
    public String accType;
    public double balanceAmount;
    public void assignValues(String nameOfDepositor,String accType,double balanceAmount)
    {
        this.nameOfDepositor=nameOfDepositor;
        this.accType=accType;
        this.balanceAmount=balanceAmount;

        Random random=new Random();
        this.accNumber=random.nextInt(1000000);
        System.out.println("Your new account number is:"+accNumber);
    }
    public void depositAmount(double amount)
    {
        if(accNumber==0)
        {
            System.out.println("!You don't have bank account to deposit\nNote:Please assign values to create an account");
        }
        else
        {
            balanceAmount+=amount;
            System.out.println("Amount deposited successfully...");
        }
    }
    public void withdrawAmount(double amount)
    {
        if(accNumber==0)
        {
            System.out.println("!You don't have bank account to deposit\nNote:Please assign values to create an account");
        }
        else if(balanceAmount>amount)
        {
            balanceAmount-=amount;
            System.out.println("Amount creadited successfully...");
        }
        else
        {
            System.out.println("! Insufficient balance");
        }
    }
    public void displayDetails()
    {
        if(accNumber==0)
        {
            System.out.println("!You don't have bank account to deposit\nNote:Please assign values to create an account");
        }
        else
        {
            System.out.println("Name of The deposistor: "+nameOfDepositor);
            System.out.println("Balance amount in the account: "+balanceAmount);
        }
    }
    public void getInput()
    {
        System.out.println("How can i help you?");
        System.out.println("1.Open account");
        System.out.println("2.Deposit amount");
        System.out.println("3.Withdraw amount");
        System.out.println("4.Account details");
        System.out.println("5.Exit");
        System.out.print("Enter choice: ");
    }
}
//code copied from https://wp.me/pc8BF4-19m
class BANK_OF_INDIA
{
    public static void main(String[] s) throws IOException
    {
        System.out.println(":::::::::::WELCOME TO SBI BANK:::::::::::::::");
        Bank newAccount=new Bank();
        Scanner cs=new Scanner(System.in);
        boolean process=true;
        int continueState=0;
        while(continueState==0)
        {
            newAccount.getInput();
            int currentProcess=cs.nextInt();
            if(currentProcess==1)
            {
                System.out.println("Enter your name: ");
                String nameOfDepositor=cs.next();
                System.out.println("Enter your account type: ");
                String accType=cs.next();
                System.out.println("Enter your opening balance: ");
                double balanceAmount=cs.nextDouble();
                newAccount.assignValues(nameOfDepositor,accType,balanceAmount);
            }
            else if(currentProcess==2){
                System.out.println("Enter amount to Deposit: ");
                newAccount.depositAmount(cs.nextDouble());
        }
            else if(currentProcess==3)
            {
                System.out.println("Enter amount to withdraw: ");
                newAccount.withdrawAmount(cs.nextDouble());
            }
            else if(currentProcess==4)
            {
                newAccount.displayDetails();
            }
            else if(currentProcess==5)
            {
                continueState=1;
                System.out.println("Thank You");
            }
            System.out.println("Press 0 to continue...");
            continueState=cs.nextInt();
        }
    }
}
