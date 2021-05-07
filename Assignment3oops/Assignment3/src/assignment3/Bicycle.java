
package assignment3;
public class Bicycle extends Vehicle
{

    public Bicycle(String name, String make) 
    {
        super(name, make);
    }
   
    public String accelerate()
    {
        return "Bicycles accelerated via the use of pedals";
    }
    public String brake()
    {
       return "Bicycles has hand Brake";
    }
    public String park()
    {
        return "Bicycles brought in the use of stand"; 
    }
}
