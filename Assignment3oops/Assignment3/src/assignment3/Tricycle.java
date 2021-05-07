
package assignment3;
public class Tricycle extends Vehicle
{
    public Tricycle(String name, String make) 
    {
        super(name, make);
    }
     
    public String accelerate()
    {
        return "Tricycles accelerated via the use of pedals";
    }
    
    public String brake()
    {
        return "Tricycle has no brakes";
    }
    
    public String park()
    {
        return "Tricycles would stay put on level ground";
    }   
}
