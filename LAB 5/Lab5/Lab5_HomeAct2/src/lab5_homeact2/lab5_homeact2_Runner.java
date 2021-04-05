
package lab5_homeact2;
public class lab5_homeact2_Runner 
{
    public static void main(String[] args) 
    {
        Book a = new Book();
        Book b = new Book("Arham",5);
        a.set("Arbab", 10);
        if(a.compareBooks(b))
            System.out.println("The two books have same Author ");
        else
            System.out.println("The two books don't have same Author ");
        System.out.println(a.compareChapterNames(b));   
    }   
}
