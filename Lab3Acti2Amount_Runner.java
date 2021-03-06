
package lab3homeact2;
import java.util.Scanner;
public class Lab3Acti2Amount_Runner 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);  
      Lab3HomeAct2 x = new Lab3HomeAct2(5); 
      System.out.print(" Enter the amount you want to deposit or withdraw deposit=1, withdraw=2 ");
      double amount = input.nextDouble();
      int n= input.nextInt();
      if (n==1)
      {
        System.out.print("The balance after amount deposited = " + x.deposit(amount));
      }
      else
      {
        System.out.print("The balance after withdrawal = " + x.withdraw(amount));
      }  
    }
    
}
