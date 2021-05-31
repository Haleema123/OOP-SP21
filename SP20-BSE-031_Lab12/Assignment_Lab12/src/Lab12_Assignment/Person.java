
package Lab12_Assignment;
public class Person 
{
    protected String name;
    protected String ID;

    public Person()
    {
    }
    
    public Person(String name, String ID)
    {
        this.name = name;
        this.ID = ID;
    }
    
    public String toString()
    {
        return "Name: "+name+"\nID: "+ID;
    }
    
    
    
}
