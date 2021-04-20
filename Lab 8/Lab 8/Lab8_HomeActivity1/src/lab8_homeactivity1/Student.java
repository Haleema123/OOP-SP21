
package lab8_homeactivity1;
public class Student extends Person
{
    protected String status;

    public Student(String name, String adress, int phoneNum, String email_adress, String status )
    {
        super(name, adress, phoneNum,email_adress);
        this.status = status;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Status:"+status);
    }
}
