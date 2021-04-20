
package lab8_assignmentq2;
public class Computer 
{
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;
    
    public Computer(int wordSize,int memorySize,int storageSize,int speed)
    {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    public Computer()
    {
        wordSize=0;
        memorySize=0;
        storageSize=0;
        speed=0;
        
    }
    
    public void display()
    {
        System.out.println("\nWordSize: "+wordSize+"\nMemorySize: "+memorySize+"\nStorageSize: "+storageSize+"\nSpeed: "+speed);
    }  
}
