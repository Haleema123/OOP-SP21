
package Lab12_Assignment;
public class HumanResource <T>
{
    T[] array;
    public HumanResource(){}
    public void add(T Obj)
    {
        if (array==null)
        {
            array= (T[])new Object[1];
            array[0] = Obj;
            ((Association)Obj).associate();
        }
        else
        {
            extend();
            array[array.length-1]=Obj;
            ((Association)Obj).associate();
        } 
    }
    
    private void extend()
    {
        T[] temp;
        temp=array;
        array = (T[]) new Object[temp.length+1];
        for(int i=0; i<temp.length; i++)
        {
            array[i]=temp[i];
        }   
    }
    
    public boolean delete(T obj)
    {
        T[] temp = array;
        array= (T[]) new Object[temp.length-1];
        for(int i=0,j=0; i<array.length; i++)
        {
            if(obj.equals(temp[i]))
            {
               j++;
            }
            array[i]=temp[j];
            j++;
        } 
        return true;   
    }
    
//    {
//        Association[] temp= p1;
//        p1 = new Association[temp.length+1];
//        for(int i=0; i<temp.length; i++)
//        {
//            p1[i]=temp[i];
//        }   
//    }  
    
//    Association[] p1; //
//
//    public HumanResource()
//    {
//    }
//    
//    public void add(Association Obj)
//    {
//        if (p1==null)
//        {
//            p1=new Association[1]; //
//            p1[p1.length-1]=Obj;
//            Obj.associate();
//        }
//        else
//        {
//            extend();
//            p1[p1.length-1]=Obj;
//            Obj.associate();
//        } 
//    }
//    
//    private void extend()
//    {
//        Association[] temp= p1;
//        p1 = new Association[temp.length+1];
//        for(int i=0; i<temp.length; i++)
//        {
//            p1[i]=temp[i];
//        }   
//    }  
//    public boolean delete()
//    {
//        p1[p1.length -1] = null;
//        Association[] temp = p1;
//        p1=new Association[temp.length-1];
//        for(int i=0; i<p1.length; i++)
//        {
//            p1[i]=temp[i];
//        } 
//        return true;   
//    }
//    public void dispaly()
//    {
//        for(int i=0; i<p1.length; i++)
//        {
//            System.out.println(p1[i]+"\n");
//        }
//    }
    public String toString()
    {
        String a = "\n"; 
        for(int i=0; i<array.length; i++)
        { 
            a  += "\n"+array[i] +"\n";
        }
        return a;  
    }   
}
