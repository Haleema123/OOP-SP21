
package Lab12_Assignment;
import java.util.Scanner;
public class Teacher extends Person implements Association
{
    private String designation;
    private String department;
    Scanner input = new Scanner(System.in);

    public Teacher(String name, String ID) 
    {
        super(name, ID);
    }
    @Override
    
    public void associate()
    {
        System.out.print("Enter designation: ");
        designation = input.nextLine();
        System.out.print("Enter department: ");
        department = input.nextLine();
        
    }
    
    public String toString()
    {
        return super.toString()+"\nDesignation: "+designation+"\nDepartment: "+department;
    }
    
    
}
