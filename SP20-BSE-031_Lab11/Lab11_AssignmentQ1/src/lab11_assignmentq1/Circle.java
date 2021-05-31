
package lab11_assignmentq1;
public class Circle implements Shape
{
    public double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }
    
    @Override
    public double area()
    {
        double Area = Math.PI * radius * radius;
        return Area;
    }
}
