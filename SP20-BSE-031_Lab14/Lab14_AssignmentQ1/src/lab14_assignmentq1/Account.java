
package lab14_assignmentq1;
import java.util.*;
import java.io.*;
public class Account implements Serializable
{
    String Name;
    int accountNum;
    int balance;

    public Account(String Name,int accountNum, int balance)
    {
        this.Name = Name;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    
    public void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Your balance is less than the amount you want to withdraw\n");   
        }
        else
        {
            balance -= amount;
            System.out.println("You withdraw Rs."+amount+"\n");
        }   
    }

    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("You deposit Rs."+amount+"\n");     
    }
    
    public void transfer(int amount,int accountNumber,Account[] account) throws Exception
    {
        FileInputStream fis = new FileInputStream("ATM System.hax");
        ObjectInputStream ois= new ObjectInputStream(fis);
        try
        {
            for(int i=0; i<account.length+1; i++ )
            {
                Account a = (Account)ois.readObject();
                if(accountNumber==a.accountNum)
                {
                    if(amount<this.balance)
                    {
                        this.balance -= amount;
                        account[i].balance += amount; 
                        System.out.println("You transferred Rs."+amount+"\n");   
                    }
                    else
                    {
                        System.out.println("Tranfer not possible\nYour balance is less than the amount you want to transfer\n");   
                    }
                    break;
                }    
            }
        }
        catch(Exception e)
        {   
            System.out.println("Tranfer not possible\nReceiver's account number is invalid");
        }
        
        
    }

    public void balanceInquiry()
    {
        System.out.println("You balance is Rs."+balance+"\n");
    }

    @Override
    public String toString()
    {
        return  "Name: " + Name + "\nAccountNum: " + accountNum + "\nBalance: " + balance +"\n";
    }   
}
