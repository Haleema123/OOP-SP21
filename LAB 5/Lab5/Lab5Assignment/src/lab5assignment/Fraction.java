
package lab5assignment;
import java.util.Scanner;
public class Fraction 
{
    private int num1 ;
    private int num2 ;
    
    Fraction()
    {}
    
    Fraction(int m,int n)
    {
       num1=m;
       num2=n;
    }
    
    public void set(int x,int y)
    {
        num1=x;
        num2=y;
    }
    
    public double get()
    {
        return num1/num2;   
    }
   
    public boolean equals()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        Fraction c = new Fraction(n1,n2);
        if (get()==c.get())
            return true;
        else
        {
            System.out.println(num1 +" : " +num2+" not equal to "+n1 +" : "+n2);                      
            return false; 
        }       
    }
    
    public void display()
    {
        if(equals())
            System.out.println("Two Fractions are equal.");
        else
            System.out.println("Two Fractions are not equal."); 
    }   
}
