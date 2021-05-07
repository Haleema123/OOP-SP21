
package assignment3;
public class Car extends Vehicle
{
    public Car(String name, String make) 
    {
        super(name, make);
    }
    
    public String accelerate()
    {
        return "Car accelerated using the foot accelerator";
    }
    
    public String brake()
    {
        return "Car has Hand brake and Foot brake";
    }
    
    public String park()
    {
        return "Cars made use of hand brake to hold ground";
    }    
}
