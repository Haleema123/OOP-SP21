
package assignment3;
public class Runner 
{
    public static void main(String[] args)
    {
        Object bicycle = new Bicycle("Bicycle","Sohrab");
        Tricycle tricycle = new Tricycle("Tricycle","kidToys");
        Vehicle car = new Car("Car","city");
        
        System.out.println(tricycle);
        System.out.println(tricycle.accelerate());
        System.out.println(tricycle.brake());
        System.out.println(tricycle.park()+"\n");
        System.out.println(bicycle);
        System.out.println(((Bicycle)bicycle).accelerate());
        System.out.println(((Bicycle)bicycle).brake());
        System.out.println(((Bicycle)bicycle).park()+"\n");
        System.out.println(car);
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.park());
    }    
}
