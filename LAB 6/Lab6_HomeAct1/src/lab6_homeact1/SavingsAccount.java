
package lab6_homeact1;
public class SavingsAccount 
{
    public static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double x)
    {
        savingsBalance=x;
    }
    
    public double calculateMonthlyInterest()
    {
        double a =(annualInterestRate*savingsBalance)/12;
        return a;
    }
    
    public static void modifyInterestRate(double b)
    {
        System.out.println("The annual interest rate is "+b+"%");
        annualInterestRate=b/100;
    }
    
    public double print()
    {
        double newBalance = calculateMonthlyInterest()+savingsBalance;
        return newBalance;
    }
}
