
package Lab12_Assignment;
import java.util.Scanner;
public class Student extends Person implements Association
{
    private int rollNo;
    private int semester;
    Scanner input = new Scanner(System.in);

    public Student(String name, String ID)
    {
        super(name, ID);
    }
    
    public void associate()
    {
        System.out.print("Enter roll number : ");
        rollNo = input.nextInt();
        System.out.print("Enter semester of student: ");
        semester = input.nextInt();
    }
    public String toString()
    {
        return super.toString()+"\nRollNo: "+rollNo+"\nSemester: "+semester;
    }
    
   
    
    
    
}
