
package assignment2;
public class Text 
{
    private String []para ;
    private  int currentPara;
    
    public Text(String message)
    {
        para = new String[10];     // size of an array is 10
        currentPara++;
        para[currentPara-1] = message;   
    }
    
    public void addPara(String newPara)
    {
        currentPara++;
        if (currentPara<=para.length)
        {
            para[currentPara-1] = newPara;   
        }
        else
        {
            System.out.print("You can't enter more than 10 Para's...\nNew Para can't be added :(");
        }
    }
    
    public int getCurrentPara()
    {
        return currentPara;   
    }
    
    public void resetCurrentPara()
    {
      currentPara = 0;
      para = new String [currentPara]; 
    }
    
    public String toString()
    { 
        if (para.length!=0)
        {
            String a = "\t"+para[0]; 
            for(int i=1; i<getCurrentPara(); i++)
            { 
                a  += "\n\t"+para[i] ;
            }
            return a;
        }
        else
        {
            return "You don't have any message!!";    
        }
    }
}
