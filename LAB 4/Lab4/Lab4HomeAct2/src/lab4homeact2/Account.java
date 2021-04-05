
package lab4homeact2;
import java.util.Scanner;
public class Account
{
    private int balance;
    private int amount;
    
    Account()
    {
        balance = 10;
        amount = 5;
    }
    
    Account(int BALANCE, int AMOUNT)
    {
        balance = BALANCE;
        amount = AMOUNT;   
    }
    
    public void getBalance(int n)
    {
        if(n==0) 
            System.out.println(" The balance after deposit is = " + (balance += amount));
        else if(n==1)
            System.out.println(" The balance after withdraw is = " + (balance -= amount));             
    }
   
}
