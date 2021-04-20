package lab8_homeactivity1;
public class Employee extends Person
{
    private String office;
    private double salary;
    private Date dateHired;
    
    public Employee(String name, String adress, int phoneNum, String email_adress,String office,double salary,Date dateHired)
    {
        super(name, adress, phoneNum,email_adress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;

    }
    public void setOffice(String office) 
    {
        this.office = office;
    }
    
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
    public String getOffice() 
    {
        return office;
    }
    
    public double getSalary() 
    {
        return salary;
    }

    public Date getDateHired() 
    {
        return dateHired;
    }

    public void setDateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }
    
    public void display()
    {
        super.display();
       System.out.println("Office: "+office+"\nSalary: "+salary+"\nDateHired: "+dateHired); 
    }
    
     
}
class Date 
{
    int year;
    int month;
    int day;
    public Date(int year, int month, int day) 
    {
        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);
    }

    public int checkMonth(int month) 
    {
        if(month >= 1 && month <= 12)
            return month;
        else
            return 1;
    }

    public int checkDay(int day) 
    {
        int[] x ={1,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(day >= 1 && day <= x[month])
        {
            return day;
        }
        else
            return 1;    
    }  
    
    public String toString()
    {
        String s = year+" / "+month+" / "+day;
        return s;
    }
}

