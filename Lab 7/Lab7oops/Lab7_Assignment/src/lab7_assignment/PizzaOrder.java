
package lab7_assignment;
public class PizzaOrder 
{
    private Pizza a;
    private Pizza b;
    private Pizza c;
    
    public PizzaOrder(Pizza a)
    {
        this.a = a;
    }
    
    public PizzaOrder(Pizza a, Pizza b)
    {
        this.a = a;
        this.b = b;
    }
    
    public PizzaOrder(Pizza a, Pizza b, Pizza c )
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    public double TotalCost()
    {
        if(a!=null&& b!=null&& c!=null)
        {
            return a.CalCost()+b.CalCost()+c.CalCost();  
        } 
        else if(a!=null&& b!=null)
        {
            return a.CalCost()+b.CalCost();  
        }
        else
        {
            return a.CalCost();
        }
    }  
}

