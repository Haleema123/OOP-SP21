
package lab4assignment;
public class HotDogStand
{
    private int HotDogStand_ID;
    private int SoldDog;
    
    HotDogStand (int x, int y)
    {
        HotDogStand_ID = x;
        SoldDog = y;
    }
    int count =5;
    
    public void justSold()
    {
       
        SoldDog ++; 
    }
    
    public void print()
    {
        System.out.println(HotDogStand_ID+" sold " +SoldDog + " dogs.");
    }
}
