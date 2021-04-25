
package assignment2;
public class BookChapter extends Text
{
    private String title;
    private int chapterNumber;
    
    public BookChapter(String title, int chapterNumber, String contents)
    {
        super(contents);
        this.title = title;
        this.chapterNumber = chapterNumber;
    }
    
    public String toString()
    {
        return "\t\t\tBOOK CHAPTER DETAILS"+"\n\nCHAPTER NAME: "+  title +"\nCHAPTER NUMBER: "+ chapterNumber
        +"\nCHAPTER CONTENTS: "+super.toString()+"\n\n\t\t   -----------------------------";
    }
    
}
