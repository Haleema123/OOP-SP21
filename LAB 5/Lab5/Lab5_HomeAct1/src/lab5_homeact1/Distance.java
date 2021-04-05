
package lab5_homeact1;
public class Distance 
{
    private int feet;
    private int inches;
    
    Distance ()
    {
        feet=3;
        inches=6;
    }
    
    Distance (int feet, int inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    
    public void set(int x, int y)
    {
        feet = x;
        inches = y;
    }
    
    public int getFeet()
    {
       return feet;
    }
    
    public int getInches()
    {
       return inches;
    }
    
    public void display()
    {
        System.out.println("feets = "+feet+"\ninches = "+inches);
    }
    
    public Distance addDistances(Distance a)
    {
        Distance add = new Distance(getFeet() + a.getFeet() , getInches()+a.getInches());
        return add;
    }    
}
