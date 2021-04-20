
package lab8_assignmentq1;
public class book extends Publication
{
    private int pageCounts;
  
    public book(int pageCounts, String title, int price)
    {
        super(title,price);
        this.pageCounts = pageCounts;  
    }
    
    public void setPageCounts(int pageCounts) 
    {
        this.pageCounts = pageCounts;
    }
    
    public int getPageCounts()
    {
        return pageCounts;
    }

    public void display()
    {
        super.display();
        System.out.println("PageCounts: "+pageCounts);
    }
    
}
