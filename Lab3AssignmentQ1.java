
package lab3assignmentq1;
public class Lab3AssignmentQ1 
{
    int sub1;
    int sub2;
    int sub3;
    
    Lab3AssignmentQ1 ()
    {
        sub1=5;
        sub2=7;
        sub3=8;
    }
    
    Lab3AssignmentQ1 (int n1, int n2, int n3)
    {
        sub1=n1;
        sub2=n2;
        sub3=n3;
    }
    
    public int sum()
    {
        int sum = sub1 + sub2 + sub3;
        return sum;
    }
    
}
