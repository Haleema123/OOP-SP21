
package lab6assign;
public class Lab6_Assignment_Runner
{
    public static void main(String[] args) 
    {
        String [] array = {"Sum +"," Multiply *","Divide /","Modulus %","sin","cos","tan"};
        for(int i=0; i<array.length; i++)
        {
            System.out.println(i+1 + " : "+ array[i]);
        }
        System.out.println("Enter any number between 1 and 7 for functionality and 0 to EXIT: ");
        Calculator .options(array);
        
    }   
}
