
package lab11_homeactivity1;
public class Circle implements EnhancedShape
{
    public double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double perimeter()
    {
        double Perimeter = 2 * Math.PI * radius;
        return Perimeter;
    }   
}
