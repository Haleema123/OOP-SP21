
package lab8_assignmentq1;
public class tape extends Publication
{
    private double playingTime;
    
    public tape(double playingTime,String title, int price)
    {
        super(title,price);
        this.playingTime = playingTime;
    }
    
    public void setPlayingTime(double playingTime)
    {
        this.playingTime = playingTime;
    }
    
    public double getPlayingTime()
    {
        return playingTime;
    }
    
    public void display()
    {
        super.display();
        System.out.println("PlayingTime: "+playingTime);
    }
}
