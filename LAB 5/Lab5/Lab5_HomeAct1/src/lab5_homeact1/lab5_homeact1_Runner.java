
package lab5_homeact1;
public class lab5_homeact1_Runner 
{
    public static void main(String[] args)
    {
        Distance obj1 = new Distance();
        Distance obj2 = new Distance(2,4);
        obj1.set(8,9);
        Distance obj3 = obj1.addDistances(obj2);
        obj3.display();
    }   
}
