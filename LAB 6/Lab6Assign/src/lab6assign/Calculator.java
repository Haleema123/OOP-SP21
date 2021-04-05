
package lab6assign;
import java.util.Scanner;
public class Calculator 
{
    public static String array;
    static Scanner input  = new Scanner(System.in);
    public static void sum()
    {
        double sum = 0;
        while(true)
        {
            System.out.print("Enter a number to sum and 0 to exit: ");
            int num = input.nextInt();
            if (num==0)
                break;  
            sum +=num;     
        }
        System.out.println("Sum is = " + sum);
        System.out.println();
    }
    public static void multiply()
    {
        double m = 1;
        while(true)
        {
            System.out.print("Enter a number to multiply and 0 to exit: ");
            int n = input.nextInt();
            if (n==0)
                break; 
            m = m *n;      
        }
        System.out.println("Multiplication  is = " + m);
        System.out.println();
    }
    public static void divide()
    {
        System.out.print("Enter first number: ");
        double firstNum = input.nextInt();
        while(true)
        {
            System.out.print("Enter second number and 0 to exit: ");
            int SecondNum = input.nextInt();
             if (SecondNum==0)
                break;  
            firstNum =(firstNum)/(SecondNum);    
        }
        System.out.println("Division is = " + firstNum);
        System.out.println();
    }
    public static void modulus()
    {
        System.out.print("Enter a number to take modulus: ");
        double modulus = input.nextInt();
        while(true)
        {
            System.out.print("Enter a number to take modulus and 0 to exit: ");
            int num = input.nextInt();
             if (num==0)
                break;  
            modulus %=num;   
        }
        System.out.println("Modulus is = " + modulus); 
        System.out.println();
    }
    public static void sin()
    {
        System.out.print("Enter a number to find its sin: ");
        int num = input.nextInt();
        double Sin = (Math.sin(Math.toRadians(num)));   
        System.out.println("Sin is = " + Sin);
        System.out.println();
    }
    public static void cos()
    {
        System.out.print("Enter a number to find its cos: ");
        int num = input.nextInt();
        double Cos = (Math.cos(Math.toRadians(num)));   
        System.out.println("Cos is = " + Cos);     

    }
    
    public static void tan()
    {
        System.out.print("Enter a number to find tan: ");
        int num = input.nextInt();
        double Tan = (Math.tan(Math.toRadians(num)));   
        System.out.println("Tan is = " + Tan);
        System.out.println();
    }  
    
    public static void options(String []array)
    {
        while(true)
        {
            System.out.print("Enter any function or 0 to exit: ");
            int function = input.nextInt();
            if (function>0 && function<=array.length)
            {
                if(function==1)
                    Calculator.sum();
                else if(function==2)
                    Calculator.multiply();
                else if(function==3)
                    Calculator.divide();
                else if(function==4)
                    Calculator.modulus();
                else if(function==5)
                    Calculator.sin();
                else if(function==6)
                    Calculator.cos();
                else if(function==7)
                    Calculator.tan();   
            }
            else if(function==0)
            {
                System.out.println("Programm ends!!");
                break;
            }
            else
                System.out.println("OOPS Wrong number!Enter a number between 0 and 7 "+array.length);            
        }
    }
}
