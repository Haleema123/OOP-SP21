
package lab14_homeactivity3;
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

    public void SearchBook(String nameOfBook) throws Exception
    {
        FileInputStream fis = new FileInputStream("Bookstore.hax");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try
        {
            while(true)
            {
                Book obj = (Book)ois.readObject();
                if(obj.name.equals(nameOfBook))
                {
                    System.out.println("Author: "+obj.author+"\nPublisher: "+obj.publisher);
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("The book store does not contain the book you are searching");
        }
        
//        Book obj1 = (Book)ois.readObject();
//        Book obj2 = (Book)ois.readObject();
//        Book obj3 = (Book)ois.readObject();
//        Book obj4 = (Book)ois.readObject();
//        Book obj5 = (Book)ois.readObject();
//        
//        if(obj1.name.equals(nameOfBook))
//        {
//            System.out.println("Author: "+obj1.author+"\nPublisher: "+obj1.publisher);
//        }
//        else if(obj2.name.equals(nameOfBook))
//        {
//            System.out.println("Author: "+obj2.author+"\nPublisher: "+obj2.publisher);
//        }
//        else if(obj3.name.equals(nameOfBook))
//        {
//            System.out.println("Author: "+obj3.author+"\nPublisher: "+obj3.publisher);
//        }
//        else if(obj4.name.equals(nameOfBook))
//        {
//            System.out.println("Author: "+obj4.author+"\nPublisher: "+obj4.publisher);
//        }
//        else if(obj5.name.equals(nameOfBook))
//        {
//            System.out.println("Author: "+obj5.author+"\nPublisher: "+obj5.publisher);
//        }
//        else
//        {
//            System.out.println("The book store does not contain the book you are searching");
//        }
    }
}
