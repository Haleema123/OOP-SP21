
package lab7_assignment;
public class Pizza 
{
    private String size;
    private int NumOfCheeseToppings;
    private int NumOfPepperoniToppings;
    private int NumOfHamToppings;
    
    public Pizza(String size, int NumOfCheeseToppings, int NumOfPepperoniToppings,int NumOfHamToppings )
    {
        this.size = size;
        this.NumOfCheeseToppings = NumOfCheeseToppings;
        this.NumOfPepperoniToppings = NumOfPepperoniToppings;
        this.NumOfHamToppings = NumOfHamToppings;
    }
    
    public void setSize(String size)
    {
        this.size = size;
    }
    
    public void setNumOfCheeseToppings(int NumOfCheeseToppings)
    {
        this.NumOfCheeseToppings = NumOfCheeseToppings;
    }
    
    public void setNumOfPepperoniToppings(int NumOfPepperoniToppings)
    {
        this.NumOfPepperoniToppings = NumOfPepperoniToppings;
    }
    
    public void setNumOfHamToppings(int NumOfHamToppings)
    {
        this.NumOfHamToppings = NumOfHamToppings;
    }
    
    public String getetSize(String size)
    {
        return size;
    }
    
    public int getNumOfCheeseToppings(int NumOfCheeseToppings)
    {
        return NumOfCheeseToppings;
    }
    
    public int getNumOfPepperoniToppings(int NumOfPepperoniToppings)
    {
        return NumOfPepperoniToppings;
    }
    
    public int getNumOfHamToppings(int NumOfHamToppings)
    {
        return NumOfHamToppings;
    }
    public int TotalNnumOfToppings()
    {
        int Toppings = this.NumOfCheeseToppings+this.NumOfPepperoniToppings+this.NumOfHamToppings;
        return Toppings;
    }
    public double CalCost()
    {
        int cost;
        if (this.size=="Small")
        {
           cost = (TotalNnumOfToppings() * 2) +10;
           return cost;
        }
        else if (this.size=="Medium")
        {
           cost = (this.TotalNnumOfToppings() * 2) + 12;
           return cost;
        }
        else
        {
           cost = (this.TotalNnumOfToppings() * 2) + 14;
           return cost;
        }   
    }
    
    public String getDescription()
    {
        
        return "Size: " +size +"\nNumber of cheese toppings: "+ NumOfCheeseToppings +"\nNumOfPepperoniToppings: "
                + NumOfPepperoniToppings +"\nNumOfHamToppings: "+ NumOfHamToppings;
    }  
}
    