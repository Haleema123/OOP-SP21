
package labhomeact1;
public class Lab4HomeAct1_Runner 
{
    public static void main(String[] args)
    {
        Marks a = new Marks ();
        Marks b = new Marks (3,6,9);
        System.out.print("The sum of marks "+b.getMarks1()+","+b.getMarks2()+","+b.getMarks3()+" of b is = ");
        b.DisplaySum();
        System.out.print("The sum of marks "+a.getMarks1()+","+a.getMarks2()+","+a.getMarks3()+" of a is = ");
        a.DisplaySum();   
    }
    
}
