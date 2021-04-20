
package lab8_assignmentq1;
import java.util.Scanner;
public class Lab8_AssignmentQ1_Runner
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a title: ");
        String Title = input.next();
        System.out.print("Enter a price: ");
        int Price = input.nextInt();
        System.out.print("Enter a pageCount: ");
        int pageCount = input.nextInt();
        System.out.print("Enter a playingTime: ");
        double playingTime = input.nextDouble();
        
        book Book = new book(pageCount,Title,Price);
        tape Tape = new tape(playingTime,Title,Price);
        
        Book.display();
        System.out.println();
        Tape.display();   
    }
}
