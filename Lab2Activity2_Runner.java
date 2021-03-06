
package l2activity2;
public class Lab2Activity2_Runner 
{
     public static void main(String[] args) 
    {
        L2Activity2 t = new L2Activity2();
        t.hours = 12;
        t.min= 2;
        t.sec =(60 *t.min) + (t.hours *3600);
        t.display();
        
    }   
}
