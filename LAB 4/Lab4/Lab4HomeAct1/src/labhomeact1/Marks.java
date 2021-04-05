
package labhomeact1;
public class Marks 
{
    private int m1;
    private int m2;
    private int m3;
    
    Marks ()
    {
        m1=4;
        m2=8;
        m3=12;
    }
    
    Marks (int x, int y, int z)
    {
        m1=x;
        m2=y;
        m3=z;
    }
    
    public void setMarks1(int M1)
    {
        m1=M1;
    }
    
    public void setMarks2(int M2)
    {
        m2=M2; 
    }
    
    public void setMarks3(int M3)
    {
        m3=M3; 
    }
    
    public int getMarks1()
    {
        return m1;
    }
    
    public int getMarks2()
    {
        return m2;
    }
    
    public int getMarks3()
    {
        return m3;
    }
    
    public void DisplaySum()
    {
        int sum = m1 + m2 + m3;
        System.out.println(sum);   
    }    
}
