
package lab14_homeactivity1;
import java.io.*;
public class Book extends Person implements Serializable
{
    public String name;
    public String publisher;

    public Book(String name, String publisher, String author)
    {
        super(author);
        this.name = name;
        this.publisher = publisher;
    }
   
    @Override
    public String toString() 
    {
        return super.toString()+"\nName: " + name + "\nPublisher: " + publisher+"\n ";
    }    
}
