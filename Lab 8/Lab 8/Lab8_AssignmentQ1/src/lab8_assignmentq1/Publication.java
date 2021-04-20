
package lab8_assignmentq1;
public class Publication 
{
    private String title;
    private int price;
    
    public Publication(String title, int price)
    {
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    
     public void setPrice(int price) 
    {
        this.price = price;
    }

    public int getPrice() 
    {
        return price;
    }

    public void display()
    {
        System.out.println("Title: "+title+"\nPrice: "+price);
    }
    
}
