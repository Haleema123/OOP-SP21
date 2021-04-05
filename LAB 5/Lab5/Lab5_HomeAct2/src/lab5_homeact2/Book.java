
package lab5_homeact2;
public class Book
{
    String author;
    String[] chapterNames;
    
    Book(){}
    
    Book(String l, int m)
    {
        author=l;
        chapterNames = new String[m];   
    }
    
    public void set(String x, int y)
    {
        author = x;
        chapterNames = new String[y];
    }
    
    public boolean compareBooks(Book b)
    {
        if(author==b.author)
            return true;
        else
            return false;    
    }
    
    public String compareChapterNames(Book b)
    {
        if(chapterNames.length>b.chapterNames.length)
            return author+"'s book has largest chapters";
        else
            return b.author+"'sbook has laegest chapters";    
    }   
}
