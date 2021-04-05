
package lab4homeact2;

import java.util.Scanner;

public class Lab4HomeAct2_Runner 
{
   public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        Account a = new Account();
        Account b = new Account(10,2);
        System.out.print("Enter a number 1 to withdraw and 0 to deposit: ");
        int number = input.nextInt();
        if ((number==0)||(number==1))
        {
            a.getBalance(number);
            b.getBalance(number);
        }
       
    }
}
