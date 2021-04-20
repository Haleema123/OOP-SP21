
package lab8_homeactivity1;
public class Faculty extends Employee
{
    protected int officeHours; 
    protected String rank; 
    
    public Faculty(String name, String adress, int phoneNum, String email_adress,String office,double salary,Date dateHired,int officeHours,String rank)
    {
        super(name, adress, phoneNum,email_adress,office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public void display()
    {
        super.display();
        System.out.println("OfficeHours: "+officeHours+"\nRank: "+rank);
    }
    
    
}

