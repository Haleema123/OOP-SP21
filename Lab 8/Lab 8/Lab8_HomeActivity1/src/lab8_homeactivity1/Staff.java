
package lab8_homeactivity1;
public class Staff extends Employee
{
    private String title;   
    
    public Staff(String name, String adress, int phoneNum, String email_adress,String office,double salary,Date dateHired,String title)
    {
        super(name, adress, phoneNum,email_adress,office,salary,dateHired);
        this.title = title;
    }
    
    public void setTitle(String title) 
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Title: "+title);
    }
    
}
