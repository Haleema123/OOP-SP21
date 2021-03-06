
package lab3homeact2;
import java.util.Scanner;
public class Lab3HomeAct2 
{
    double balance;
    double amount;
    Lab3HomeAct2()
    {
    }
    Lab3HomeAct2(double b)
    {
        balance=b;
    }
    public double deposit(double amount)
    {
        balance += amount;
        return balance;   
    }
    public double withdraw(double amount)
    {
        balance -= amount;
        return balance;
    } 
}
