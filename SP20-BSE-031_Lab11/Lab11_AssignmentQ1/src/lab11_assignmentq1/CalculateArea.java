
package lab11_assignmentq1;
public class CalculateArea 
{
    public static void calculateArea (Shape[] shape)
    {
        double[] CIRCLE = new double[1];
        double[] RECTANGLE = new double[1];
        double[] TRIANGLE = new double[1];
        for (int i=0; i<shape.length; i++)
        {
            if (shape[i] instanceof Circle)
                System.out.printf("The area of Circle is %.2f ",CIRCLE[0] = shape[i].area());
            else if (shape[i] instanceof Rectangle)
                System.out.printf("\nThe area of Rectangle is %.2f ",RECTANGLE[0] = shape[i].area());
            else
            {
                System.out.printf("\nThe area of Triangle is %.2f ",TRIANGLE[0] = shape[i].area());
                System.out.println();
            }
        }
    }
}
