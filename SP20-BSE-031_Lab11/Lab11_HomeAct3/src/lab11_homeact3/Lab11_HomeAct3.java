
package lab11_homeact3;
public class Lab11_HomeAct3 implements Interface, Interface1
{
    public int abc()
    {
        return 1;
    }
    public static void main(String[] args) 
    {
        Lab11_HomeAct3 a = new Lab11_HomeAct3();
        System.out.println(a.abc());
    }    
}

interface Interface
{
    public int abc();
}
interface Interface1
{
    public int abc();
}