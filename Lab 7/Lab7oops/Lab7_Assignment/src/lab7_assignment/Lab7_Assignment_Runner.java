
package lab7_assignment;
public class Lab7_Assignment_Runner 
{
    public static void main(String[] args) 
    {
        Pizza a1 = new Pizza("Small",1,1,2);
        Pizza a2 = new Pizza("Medium",1,3,2);
        Pizza a3 = new Pizza("Large",2,1,2);
        PizzaOrder pizza = new PizzaOrder(a1,a3);


        System.out.println(pizza.TotalCost());
    }
    
}
