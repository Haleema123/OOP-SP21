package lab11_assignmentq1;
public class lab11_assignmentq1_Runner
{
    public static void main(String[] args) 
    {
        Shape[] a = new Shape[3];
        a[0]= new Circle(2);
        a[1]= new Rectangle(3.3, 4);
        a[2]= new Triangle(2.0, 8);
        CalculateArea.calculateArea(a);

    }   
}
