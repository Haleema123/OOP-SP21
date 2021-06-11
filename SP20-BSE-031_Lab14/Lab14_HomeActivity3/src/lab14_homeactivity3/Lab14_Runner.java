
package lab14_homeactivity3;
import java.io.*;
import java.util.*;
public class Lab14_Runner implements Serializable
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("Bookstore.hax");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Book[] book =new Book[5];
        book[0] = new Book("Name1","Publisher1","Author1");
        book[1]  = new Book("Name2","Publisher2","Author2");
        book[2] = new Book("Name3","Publisher3","Author3");
        book[3]  = new Book("Name4","Publisher4","Author4");
        book[4]  = new Book("Name5","Publisher5","Author5");
        for(int i=0; i<book.length; i++)
        {
            oos.writeObject(book[i]);
        }
        oos.close();
       
        System.out.print("Enter the name of the book you want to search: ");
        String nameOfBook = input.nextLine();
        book[0].SearchBook(nameOfBook);        
    }   
}
