
package lab4homeact3;
import java.util.Scanner;
public class Lab4HomeAct3 
{
    private String name;
    private int[] result =new int[5];
    int sum;
    
    Lab4HomeAct3 (String a)
    {
        name=a;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<result.length; i++)
            {
                System.out.print("Enter the subject " +i+ " marks of student: ");
                result[i]= input.nextInt();
            }
        for (int i=0; i<result.length; i++)
            {
                sum = sum +result[i];
            }
        System.out.println();
            //System.out.print(sum);   
    }
    
    public double ComputeAverage()
    {
        double ave = (sum)/(result.length);
        return ave;
    }
    
    public void HighestAverage(Lab4HomeAct3 student1,Lab4HomeAct3 student2)
    {
        if(student1.ComputeAverage()>student2.ComputeAverage())
            System.out.println("The student " + student1.name +" average is highest");
        else
            System.out.println("The student " + student2.name +" average is highest");   
    }
    
    
    
}

    

    

