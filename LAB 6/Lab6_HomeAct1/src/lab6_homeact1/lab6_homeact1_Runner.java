
package lab6_homeact1;
public class lab6_homeact1_Runner 
{
    public static void main(String[] args) 
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        saver1=null;
        SavingsAccount.modifyInterestRate(3);
        System.out.println("The new balance of saver1 is "+saver1.print());
        System.out.println("The new balance of saver2 is "+saver2.print()+"\n");
        SavingsAccount.modifyInterestRate(4);
        System.out.printf("The new balance of saver1 is %.2f",saver1.print());
        System.out.println("\nThe new balance of saver2 is "+saver2.print());
    } 
}
