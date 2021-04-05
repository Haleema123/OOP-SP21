
package lab4homeact3;
import java.util.Scanner;
public class Lab4HomeActiity3_Runner 
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       Lab4HomeAct3 student1 = new Lab4HomeAct3("halima");
       Lab4HomeAct3 student2 = new Lab4HomeAct3("harm"); 
       System.out.println("The average of student1 is = "+student1.ComputeAverage());
       System.out.println("The average of student2 is = "+student2.ComputeAverage());
       student1.HighestAverage(student1,student2);
       
    }   
}
