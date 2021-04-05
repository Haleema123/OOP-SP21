
package lab6homeact2;
public class Lab6HomeAct2
{
    public static int objCreated=0;
    public static int objDestroyed=0;
    public char charc;
  
    public Lab6HomeAct2(char charc)
    {
        this.charc=charc;
        objCreated++;
    }
    
    public Lab6HomeAct2()
    {
        objCreated++;
    }
    
    public static void destroyObj()
    {
        objDestroyed++;
    }
    
    public static void display()
    {
      System.out.println("Created objects = "+objCreated ) ; 
      System.out.println("destroyed objects = "+objDestroyed) ; 
    }   
}
