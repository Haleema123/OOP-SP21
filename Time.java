
package lab3assignmentq2;
public class Time 
{
    int hours;
    int min;
    int sec;
    
    Time ()
    {
        hours = 11;
        min = 35;
        sec = 15;
    }
    
    Time (int h, int m, int s)
    {
        hours=h;
        min=m;
        sec=s;
    }
    
    public void Display()
    {
        System.out.print(" Time = ");
        System.out.println(hours +" : "+ min +" : "+ sec);   
    }
    
}
