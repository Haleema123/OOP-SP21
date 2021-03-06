
package lab3homeact1;
public class Lab3HomeAct1 
{
    public int radius ;
    public double PI;
    Lab3HomeAct1()
    {
        radius=5;
        PI = 3.14;
    } 
    Lab3HomeAct1(int r,double p)
    {
        radius=r;
        PI =p;  
    }
    public void Displaycircum()
    {
        double C= 2 * PI * radius;
        System.out.println(" The circumference of circle of radius " + radius + " = " + C);
    }   
}
