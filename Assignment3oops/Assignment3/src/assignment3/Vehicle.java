
package assignment3;
public abstract class Vehicle implements Moveable,Parkable
{
    protected String name;
    protected String make;
    
    public Vehicle(String name, String make) 
    {
        this.name = name;
        this.make = make;
    }
    
    public String toString()
    {
        return "Name: "+name+"\tMake: "+make;
    }    
}
