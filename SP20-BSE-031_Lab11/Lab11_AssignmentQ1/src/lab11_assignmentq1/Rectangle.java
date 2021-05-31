
package lab11_assignmentq1;
public class Rectangle implements Shape
{
    public double length;
    public double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area()
    {
        double Area = length * width;
        return Area;
    }
}
