
package lab14_homeactivity1;
import java.io.*;
public class Person implements Serializable
{
    public String author;

    public Person(String author)
    {
        this.author = author;
    }
    
    public String toString()
    {
        return "Author: "+author;
    }   
}
