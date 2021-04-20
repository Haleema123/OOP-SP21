
package lab8_assignmentq2;
public class Laptop extends Computer
{
    protected int length;
    protected int width;
    protected int height;
    protected int weight;
    
    public Laptop()
    {
        super();
        length = 0;
        width = 0;
        height = 0;
        weight = 0;   
    }
    
    public Laptop(int length,int width,int height, int weight,int wordSize,int memorySize,int storageSize,int speed)
    {
        super(wordSize,memorySize,storageSize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;   
    }
    
    public void display()
    {
        super.display();
        System.out.println("Length: "+length+"\nWidth: "+width+"\nHeight: "+height+"\nWeight: "+weight);
    }
    
    
    
}
