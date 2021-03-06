
package lab3homeacti3;
public class Lab3HomeActi3
{
    public double feet;
    public double inches;
    public static void main(String[] args)
    {
       Lab3HomeActi3 a = new  Lab3HomeActi3(); 
       Lab3HomeActi3 b = new  Lab3HomeActi3(1,2);
       a.display();
       b.display();
       
    }
    Lab3HomeActi3()
    {
        feet=12;
        inches=45;
    }
    Lab3HomeActi3(double l, double m)
    {
        feet=l;
        inches=m;   
    }
    void display()
    {
       System.out.print((int)feet + " , ");
       System.out.println((int)inches );
    }
}
