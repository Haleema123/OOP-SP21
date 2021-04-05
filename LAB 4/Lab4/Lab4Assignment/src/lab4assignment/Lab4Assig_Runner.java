
package lab4assignment;
public class Lab4Assig_Runner
{
    public static void main(String[] args)
    {
        HotDogStand a = new   HotDogStand(123,4);
        HotDogStand b = new HotDogStand(456,3);
        HotDogStand c = new HotDogStand(789,2); 
        a.justSold();
        c.justSold();
        a.justSold();
        b.justSold();
        b.justSold();
        a.print();
        b.print();
        c.print();
    }    
}
