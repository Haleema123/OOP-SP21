
package lab11_assignmentq1;
public class Triangle implements Shape
{
    public double height;
    public double base;

    public Triangle(double height, double base) 
    {
        this.height = height;
        this.base = base;
    }
    
    @Override
    public double area()
    {
        double Area =  (height * base)/2;
        return Area;
    }
}
